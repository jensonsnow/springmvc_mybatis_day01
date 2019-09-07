package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerMapper {
	
	public List<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	
	/**
	 * 查询数据内容
	 * @param id
	 * @return
	 */
	public int queryCountByQueryVo(QueryVo queryVo);
	
	/**
	 * 根据id查询数据内容
	 * @param id
	 * @return
	 */
	public Customer queryCustomerById(Long id);
	
	/**
	 *进行修改内容
	 * @param id
	 * @return
	 */
	public void updateCustomerById(Customer customer);
	
	/**
	 *根据ID删除数据 
	 * @param id
	 * @return
	 */
	public void deleteCustomerById(Long id);

}
