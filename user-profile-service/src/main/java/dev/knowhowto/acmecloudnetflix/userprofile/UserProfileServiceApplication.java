package dev.knowhowto.acmecloudnetflix.userprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserProfileServiceApplication {

  private UserProfileServiceApplication() {
  }

  public static void main(String[] args) {
    SpringApplication.run(UserProfileServiceApplication.class, args);
  }
}
