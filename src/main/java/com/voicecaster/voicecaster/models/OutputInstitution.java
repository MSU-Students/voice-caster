package com.voicecaster.voicecaster.models;

public class OutputInstitution {

  private String client;
  private String code;
  private String status;

  public OutputInstitution() {}

  public OutputInstitution(String client, String code, String status) {
    this.client = client;
    this.code = code;
    this.status = status;
  }

  public String getClient() {
    return client;
  }
  
  public String getCode() {
    return code;
  }

  public String getStatus() {
    return status;
  }
}
