package com.lytwsy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lytwsy.dao.TbItemMapper;
import com.lytwsy.pojo.TbItem;
import com.lytwsy.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	/**
	 * 通过id查询Item
	 * @param itemId
	 * @return Item对象
	 */
	public TbItem findById(Integer itemId) {
		return tbItemMapper.selectByPrimaryKey((long)itemId);
	}

}
