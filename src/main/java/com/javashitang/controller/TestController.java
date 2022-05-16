package com.javashitang.controller;

import com.javashitang.service.IndexService;
import com.javashitang.util.ThreadLocalUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lilimin
 * @since 2022-01-11
 */
@RestController
public class TestController {

	@Resource
	private IndexService indexService;

	@RequestMapping("test")
	public String index() {
		ThreadLocalUtil.setPath("com.javashitang.service.IndexService.index");
		String result = indexService.index();
		ThreadLocalUtil.remove();
		return result;
	}
}
