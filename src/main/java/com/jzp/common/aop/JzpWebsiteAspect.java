package com.jzp.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * @author Hongyi Zheng
 * @date 2019/4/22
 */
public class JzpWebsiteAspect {

    private static Logger logger = LoggerFactory.getLogger(JzpWebsiteAspect.class);


    @Pointcut("execution(public * com.jzp.controller.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (null != sra) {
            HttpServletRequest request = sra.getRequest();
            String currentUser = (String) request.getAttribute("");
        }
        return null;
    }
}
