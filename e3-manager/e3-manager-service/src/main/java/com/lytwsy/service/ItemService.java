package com.lytwsy.service;

import com.lytwsy.pojo.TbItem;

public interface ItemService {

	/**
	 * 通过id查询Item
	 * @param itemId
	 * @return Item对象
	 */
	public TbItem findById(Integer itemId);
	
}
