package Interceptor.Middleware1.Configuration;

import Interceptor.Middleware1.Interceptors.APILoggingInterceptor;
import Interceptor.Middleware1.Interceptors.LegacyIntercepotr;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMvcConfiguration implements WebMvcConfigurer{
    @Autowired
    APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    LegacyIntercepotr legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
