package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.BaseDictService;

/**
 * �ͻ���Ϣ������
 * @author huihui
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Value("${customer_industry_type}")
	private String customer_industry_type;
	
	@Value("${customer_from_type}")
	private String customer_from_type;
	
	@Value("${customer_level_type}")
	private String customer_level_type;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		//��ѯ��ҵ
		List<BaseDict> industryType = baseDictService.getBaseDictByCode(customer_industry_type);
		
		//��ѯ��Դ
		List<BaseDict> fromType = baseDictService.getBaseDictByCode(customer_from_type);
		
		//��ѯ�ͻ�����
		List<BaseDict> levelType = baseDictService.getBaseDictByCode(customer_level_type);
		
		//��������ģ�ͷ���
		model.addAttribute("industryType", industryType);
		model.addAttribute("fromType", fromType);
		model.addAttribute("levelType", levelType);
		
		return "customer";
	};
}
