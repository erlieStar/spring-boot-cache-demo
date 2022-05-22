package com.javashitang.controller;

import com.javashitang.domain.Student;
import com.javashitang.service.IndexService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lilimin
 * @since 2022-01-11
 */
@RestController
public class IndexController {

	@Resource
	private IndexService indexService;

	@RequestMapping("info")
	public String info(@RequestParam String name, @RequestParam int age) {
		return indexService.index(name, age);
	}

	@RequestMapping("save")
	public Student save(@RequestBody Student student) {
		return indexService.save(student);
	}

	@RequestMapping("notice")
	public List<Integer> info() {
		return indexService.notice();
	}
}
