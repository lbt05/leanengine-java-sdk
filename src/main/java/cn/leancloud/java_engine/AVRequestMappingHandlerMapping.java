package cn.leancloud.java_engine;

import java.lang.reflect.Method;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class AVRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

  @Override
  protected void registerHandlerMethod(Object handler, Method method, RequestMappingInfo mapping) {
    super.registerHandlerMethod(handler, method, mapping);
    AVFunction annotation = AnnotationUtils.findAnnotation(method, AVFunction.class);
    if (annotation != null) {
      System.out.println(annotation.name() + "fucking shit  amazing");
    } else {
      System.out.println("it's shit");
    }
  }
}