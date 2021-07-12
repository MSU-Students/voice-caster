package com.voicecaster.voicecaster.models;

public class OutputInstitution {

  private Institution content;

  public OutputInstitution() {}

  public OutputInstitution(Institution institution) {
    this.content = institution;
  }

  public Institution getContent() {
    return content;
  }
}
