package com.st;

import com.st.service.AccountService;

public class Main {

  public static void main(String[] args) {

    /**
     * get from db somebody
     * get from cache somebody
     *
     * after reload...
     *
     * get from db somebody
     * get from cache somebody
     */
    AccountService s = new AccountService();
    // 开始查询账号
    s.getAccountByName("somebody");
    s.getAccountByName("somebody");

    s.reload();// 重置缓存
    System.out.println("after reload...");

    s.getAccountByName("somebody");
    s.getAccountByName("somebody");
  }
}
