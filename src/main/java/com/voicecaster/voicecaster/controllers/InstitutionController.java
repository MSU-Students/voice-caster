package com.voicecaster.voicecaster.controllers;

import com.voicecaster.voicecaster.models.Institution;
import com.voicecaster.voicecaster.models.OutputInstitution;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class InstitutionController {

  @MessageMapping("/instituition")
  @SendTo("/topic/register")
  public OutputInstitution send(Institution institution)
    throws Exception {
    Thread.sleep(1000);
    System.out.println("Client: " + institution.getClient() + " Code: " + institution.getCode() + " Status: " + institution.getStatus());
    return new OutputInstitution(institution.getClient(), institution.getCode(), institution.getStatus());
  }
}
