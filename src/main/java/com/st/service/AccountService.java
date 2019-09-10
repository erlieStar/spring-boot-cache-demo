package com.st.service;

import com.st.pojo.Account;

public class AccountService {

  private Cache<Account> cache;

  public AccountService() {
    cache = new Cache<Account>();
  }

  public Account getAccountByName(String name) {
    Account result = cache.getValue(name);
    // 如果在缓存中，则直接返回缓存的结果
    if(result != null) {
      System.out.println("get from cache " + name);
      return result;
    }
    result = getFromDB(name);
    // 将数据库查询的结果更新到缓存中
    if(result != null) {
      cache.addOrUpdateCache(name, result);
    }
    return result;
  }

  public void reload() {
    cache.evictCache();
  }

  private Account getFromDB(String name) {
    System.out.println("get from db " + name);
    return new Account(1, name);
  }
}
