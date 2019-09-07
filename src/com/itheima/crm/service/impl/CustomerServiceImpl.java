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

		//���ò�ѯ���� ������һ����ʼ��ѯ
		queryVo.setStart(  (queryVo.getPage()-1) * queryVo.getRows()  );
		
		//��ѯ���ݽ����
		List<Customer> list = customerMapper.queryCustomerByQueryVo(queryVo);
		
		//��ѯ��������������
		int total = customerMapper.queryCountByQueryVo(queryVo);
		
		//��װ���ص�page����
		Page<Customer> page = new Page<Customer>(total,queryVo.getPage(),queryVo.getRows(),list);
		
		return page;
	}

}
 
