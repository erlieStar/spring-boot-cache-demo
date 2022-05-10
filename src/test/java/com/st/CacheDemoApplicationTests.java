package com.st;

import com.javashitang.CacheDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CacheDemoApplication.class})
public class CacheDemoApplicationTests {

	@Value("${show.test}")
	private List<Integer> showList;

	@Test
	public void contextLoads() {
	}

	@Test
	public void t1() {
		System.out.println(showList);
	}

}

