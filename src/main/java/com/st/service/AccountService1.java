package com.st.service;

import com.st.pojo.Account;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "cache")
public class AccountService1 {

  @Cacheable(key = "#name")
  public Account getAccountByName(String name) {
    return getFromDB(name);
  }

  @CachePut(key = "#account.getName()")
  public Account updateAccount(Account account) {
    return account;
  }

  @CacheEvict(key = "#name")
  public void deleteAccount(String name) {

  }

  private Account getFromDB(String name) {
    System.out.println("get from db " + name);
    return new Account(name);
  }
}
