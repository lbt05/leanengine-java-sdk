package cn.leancloud.java_engine;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AVOSWebConfig extends WebMvcConfigurerAdapter {

  @AVFunction(name = "hello")
  public String testData() {
    return null;
  }

  @AVFunction
  public String testShit() {
    return null;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new HandlerInterceptor() {

      @Override
      public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
          Object object) throws Exception {
        System.out.println("pre shit " + request.getRequestURI() + "|||"
            + request.getParameterMap().toString());
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
          System.out.println(enumeration.nextElement());
        }
        return true;
      }

      @Override
      public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2,
          ModelAndView arg3) throws Exception {
        System.out.println("post shit");
      }

      @Override
      public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
          Exception arg3) throws Exception {
        System.out.println("after shit");
      }
    });
  }
}
