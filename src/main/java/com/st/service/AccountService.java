package com.st.service;

import com.st.pojo.Account;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  @Cacheable(value = "cache", key = "#name")
  public Account getAccountByName(String name) {
    return getFromDB(name);
  }

  @Cacheable(value = "cache1", key = "#name")
  public Account getAccountByNameCache1(String name) {
    return getFromDB(name);
  }

  @Cacheable(value = "cache2", key = "#name")
  public Account getAccountByNameCache2(String name) {
    return getFromDB(name);
  }

  private Account getFromDB(String name) {
    System.out.println("get from db " + name);
    return new Account(name);
  }
}
