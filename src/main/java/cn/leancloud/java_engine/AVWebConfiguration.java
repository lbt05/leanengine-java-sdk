package cn.leancloud.java_engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class AVWebConfiguration extends WebMvcConfigurationSupport {
  @Bean
  @Override
  public RequestMappingHandlerMapping requestMappingHandlerMapping() {
    AVRequestMappingHandlerMapping handlerMapping = new AVRequestMappingHandlerMapping();
    handlerMapping.setOrder(0);
    handlerMapping.setInterceptors(getInterceptors());
    handlerMapping.setContentNegotiationManager(mvcContentNegotiationManager());
    handlerMapping.setUseTrailingSlashMatch(false);
    handlerMapping.setUseSuffixPatternMatch(false);
    return handlerMapping;
  }
}
