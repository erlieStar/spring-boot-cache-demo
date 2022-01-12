package com.javashitang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lilimin
 * @since 2022-01-11
 */
@RestController
public class IndexController {

	@RequestMapping("index")
	public String index() {
	    int a = 100 / 0;
		return "index";
	}
}
