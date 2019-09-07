package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerMapper {
	
	public List<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	
	public int queryCountByQueryVo(QueryVo queryVo);

}
