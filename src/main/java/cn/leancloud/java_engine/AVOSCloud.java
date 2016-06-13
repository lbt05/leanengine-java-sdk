package cn.leancloud.java_engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;

@SpringBootApplication
public class AVOSCloud {

  static String applicationId;
  static String applicationSercet;
  static String masterKey;

  public static void main(String[] args) {
    AVOSCloud.init(null, null, null);
  }

  public static void init(String applicationId, String applicationSercet, String masterKey) {
    AVOSCloud.applicationId = applicationId;
    AVOSCloud.applicationSercet = applicationSercet;
    AVOSCloud.masterKey = masterKey;
    SpringApplication app = new SpringApplication(AVOSCloud.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run();
  }
}
