package com.st.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account {
  private int id;
  private String name;
  private String password;

  public Account(String name) {
    this.name = name;
  }
}
