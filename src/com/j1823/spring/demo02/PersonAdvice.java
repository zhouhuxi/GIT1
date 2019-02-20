package com.j1823.spring.demo02;

import org.aspectj.lang.ProceedingJoinPoint;

public class PersonAdvice {


    public void addAdvice01() {
        System.out.println("前置增强代码");
    }

    public void addAdvice02() {
        System.out.println("后置增强代码");
    }

    public void addAdvice03(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕增强代码前");
        joinPoint.proceed();
        System.out.println("环绕增强代码后");
    }

    public void addAdvice04() {
        System.out.println("最终增强代码");
    }

}
