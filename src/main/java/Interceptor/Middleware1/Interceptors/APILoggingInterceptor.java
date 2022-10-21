package Interceptor.Middleware1.Interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class APILoggingInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String user = request.getHeader("User-Agent");
        if(user != null) {
            System.out.println(user);
            return true;
        } else {
            return false;
        }
    }
}
