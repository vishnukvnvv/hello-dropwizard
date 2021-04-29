package com.hello.api.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

  @JsonProperty("data")
  private final Data data;

  @JsonProperty("err")
  private final Object err;

  @JsonProperty("status")
  private final int status;

  public ApiResponse(Data data, Object err, int status) {
    this.data = data;
    this.err = err;
    this.status = status;
  }

  public Data getData() {
    return this.data;
  }

  public Object getErr() {
    return this.err;
  }

  public int getStatus() {
    return this.status;
  }
}
