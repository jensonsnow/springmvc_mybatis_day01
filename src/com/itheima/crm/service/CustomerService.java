package com.itheima.crm.service;


import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.utils.Page;

public interface CustomerService {
	
	  public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	  
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
