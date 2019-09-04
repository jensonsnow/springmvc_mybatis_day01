package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * 字典数据表业务逻辑接口
 * @author huihui
 *
 */
public interface BaseDictService {
	
	/**
	 * 根据字典编码查询数据字典
	 * @param code
	 * @return
	 */
	public List<BaseDict> getBaseDictByCode(String code);

}
