package com.javashitang.controller;

import com.javashitang.service.IndexService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lilimin
 * @since 2022-01-11
 */
@RestController
public class IndexController {

	@Resource
	private IndexService indexService;

	@RequestMapping("index")
	public String index() {
		return indexService.index();
	}
}