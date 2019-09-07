package com.itheima.crm.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.mapper.CustomerMapper;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	
	public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo ) {

		//设置查询条件 ，从那一条开始查询
		queryVo.setStart(  (queryVo.getPage()-1) * queryVo.getRows()  );
		
		//查询数据结果集
		List<Customer> list = customerMapper.queryCustomerByQueryVo(queryVo);
		
		//查询到的数据总条数
		int total = customerMapper.queryCountByQueryVo(queryVo);
		
		//封装返回的page对象
		Page<Customer> page = new Page<Customer>(total,queryVo.getPage(),queryVo.getRows(),list);
		
		return page;
	}

}
 
