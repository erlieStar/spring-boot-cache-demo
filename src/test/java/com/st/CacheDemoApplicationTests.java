package com.st;

import com.st.pojo.Account;
import com.st.service.AccountService;
import com.st.service.AccountService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheDemoApplicationTests {

	@Autowired
	AccountService accountService;

	@Autowired
	AccountService1 accountService1;

	@Autowired
	CacheManager cacheManager;

	@Test
	public void test0() {

		/**
		 * get from db 1
		 * get from db 2
		 */
		accountService.getAccountByName("1");
		accountService.getAccountByName("1");
		accountService.getAccountByName("2");
		accountService.getAccountByName("2");
	}

	@Test
	public void test1() {
		/**
		 * get from db 1
		 * get from db 1
		 */
		accountService.getAccountByNameCache1("1");
		accountService.getAccountByNameCache2("1");
	}

	@Test
	public void test2() {
		/**
		 * get from db 1
		 * get from db 1
		 */
		accountService.getAccountByNameCache1("1");
		accountService.getAccountByNameCache2("1");
	}

	@Test
	public void test3() {

		/**
		 * get from db 1
		 * get from db 1
		 * cache2
		 * cache1
		 */
		accountService.getAccountByNameCache1("1");
		accountService.getAccountByNameCache2("1");
		Collection<String> collection = cacheManager.getCacheNames();
		collection.forEach(item ->{
			System.out.println(item);
		});
	}

	@Test
	public void test4() {
		/**
		 * get from db 1
		 */
		accountService1.getAccountByName("1");
		accountService1.getAccountByName("1");
	}

	@Test
	public void test5() {

		Account account = new Account();
		account.setName("aaa");
		account.setPassword("123");
		accountService1.updateAccount(account);
		accountService1.getAccountByName(account.getName());
	}

	@Test
	public void test6() {
		/**
		 * get from db aaa
		 * get from db aaa
		 */
		accountService1.getAccountByName("aaa");
		accountService1.deleteAccount("aaa");
		accountService1.getAccountByName("aaa");
	}

}

