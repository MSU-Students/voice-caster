package com.voicecaster.voicecaster.models;

public class OutputInstitution {

  private String institution;
  private String code;
  private String status;

  public OutputInstitution() {}

  public OutputInstitution(String institution, String code, String status) {
    this.institution = institution;
    this.code = code;
    this.status = status;
  }

  public String getInstituition() {
    return institution;
  }
  
  public String getCode() {
    return code;
  }

  public String getStatus() {
    return status;
  }
}
