package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * �ֵ����ݱ�־û��ӿ�
 * @author huihui
 *
 */
public interface BaseDictMapper {
	
	/**
	 * �����ֵ�����ѯ�����ֵ�
	 * @param code
	 * @return
	 */
	public List<BaseDict> getBaseDictByCode(String code);

}
