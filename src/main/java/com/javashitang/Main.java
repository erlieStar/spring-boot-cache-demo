package com.javashitang;

import com.javashitang.service.AccountService;

public class Main {

  public static void main(String[] args) {

    /**
     * get from db aaa
     * get from cache aaa
     */
    AccountService s = new AccountService();
    s.getAccountByName("aaa");
    s.getAccountByName("aaa");
  }
}
