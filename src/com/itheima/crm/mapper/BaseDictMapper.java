package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * 字典数据表持久化接口
 * @author huihui
 *
 */
public interface BaseDictMapper {
	
	/**
	 * 根据字典编码查询数据字典
	 * @param code
	 * @return
	 */
	public List<BaseDict> getBaseDictByCode(String code);

}
