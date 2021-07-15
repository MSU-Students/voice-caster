package com.voicecaster.voicecaster.models;

public class Institution {

  private String client;
  private String code;
  private String status;

  public Institution(String client, String code, String status) {
    this.client = client;
    this.code = code;
    this.status = status;
  }

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
