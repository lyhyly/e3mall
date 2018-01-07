package com.lytwsy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lytwsy.pojo.TbItem;
import com.lytwsy.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/{itemId}")
	@ResponseBody
	public TbItem findById(@PathVariable Integer itemId) {
		return service.findById(itemId);
	}
	
}
