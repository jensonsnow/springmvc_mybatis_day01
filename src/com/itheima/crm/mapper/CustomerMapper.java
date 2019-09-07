package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerMapper {
	
	public List<Customer> queryCustomerByQueryVo(QueryVo queryVo);
	
	/**
	 * ��ѯ��������
	 * @param id
	 * @return
	 */
	public int queryCountByQueryVo(QueryVo queryVo);
	
	/**
	 * ����id��ѯ��������
	 * @param id
	 * @return
	 */
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
