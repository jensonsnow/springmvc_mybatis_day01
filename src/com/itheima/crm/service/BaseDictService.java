package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * �ֵ����ݱ�ҵ���߼��ӿ�
 * @author huihui
 *
 */
public interface BaseDictService {
	
	/**
	 * �����ֵ�����ѯ�����ֵ�
	 * @param code
	 * @return
	 */
	public List<BaseDict> getBaseDictByCode(String code);

}
