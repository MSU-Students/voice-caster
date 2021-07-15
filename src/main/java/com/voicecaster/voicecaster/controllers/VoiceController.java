package com.voicecaster.voicecaster.controllers;

import com.voicecaster.voicecaster.models.Message;
import com.voicecaster.voicecaster.models.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
@Controller
public class VoiceController {

  @MessageMapping("/information")
  @SendTo("/topic/announcements")
  public OutputMessage send(Message message) throws Exception {
    Thread.sleep(1000);
    // System.out.println("Message: " + message.getMessage());
    return new OutputMessage(message.getMessage());
  }
}
