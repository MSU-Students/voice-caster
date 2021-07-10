package com.voicecaster.voicecaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class VoiceCasterApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(VoiceCasterApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(
    SpringApplicationBuilder builder
  ) {
    return builder.sources(VoiceCasterApplication.class);
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry
          .addMapping("/**")
          .allowedOriginPatterns("*")
          .allowCredentials(true);
      }
    };
  }
}
