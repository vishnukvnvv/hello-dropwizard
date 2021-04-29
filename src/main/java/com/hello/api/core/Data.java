package com.hello.api.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

  @JsonProperty("message")
  private String message;

  public Data(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
