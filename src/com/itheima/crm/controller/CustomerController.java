package com.itheima.crm.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.BaseDictService;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;

/**
 * 客户信息请求处理
 * @author huihui
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@Value("${customer_industry_type}")
	private String customer_industry_type;
	
	@Value("${customer_from_type}")
	private String customer_from_type;
	
	@Value("${customer_level_type}")
	private String customer_level_type;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo) {
		//解决get请求乱码问题
		try {
			if(StringUtils.isNotBlank(queryVo.getCustName())) {
				queryVo.setCustName(new String(queryVo.getCustName().getBytes("ISO-8859-1"),"UTF-8" ));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//查询行业
		List<BaseDict> industryType = baseDictService.getBaseDictByCode(customer_industry_type);
		
		//查询来源
		List<BaseDict> fromType = baseDictService.getBaseDictByCode(customer_from_type);
		
		//查询客户级别
		List<BaseDict> levelType = baseDictService.getBaseDictByCode(customer_level_type);
		
		
		
		//设置数据模型返回
		model.addAttribute("industryType", industryType);
		model.addAttribute("fromType", fromType);
		model.addAttribute("levelType", levelType);
		
		
		//分页查询结果集
		Page<Customer> page = customerService.queryCustomerByQueryVo(queryVo);
		//把分页查询的结果集放到模型中
		model.addAttribute("page", page);
		
		//查询数据显示
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());

		
		return "customer";
	};
}
