package com.itheima.crm.service;


import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.utils.Page;

public interface CustomerService {
	
	  public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	  
	  public Customer queryCustomerById(Long id);
	  
	  /**
		 *�����޸�����
		 * @param id
		 * @return
		 */
	  public void updateCustomerById(Customer customer);
	  
	  /**
		 *����IDɾ������ 
		 * @param id
		 * @return
		 */
	  public void deleteCustomerById(Long id);

}
