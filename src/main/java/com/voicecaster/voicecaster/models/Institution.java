package com.voicecaster.voicecaster.models;

public class Institution {

  private String institution;
  private String code;
  private String status;

  public Institution(String institution, String code, String status) {
    this.institution = institution;
    this.code = code;
    this.status = status;
  }

  public Institution() {

  }

  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
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
