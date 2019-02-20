package com.j1823.spring.demo01;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 切面 类
@Component("studentAdvice")
@Aspect
public class StudentAdvice {

    @Pointcut("execution(* com.j1823.spring.demo01.StudentDao.add())")
    public void addPointcut() {
    }

    @Before("StudentAdvice.addPointcut()")
    public void addAdvice01() {
        System.out.println("添加学生时，记录日志-前置增强 = Before");
    }

    @AfterReturning("StudentAdvice.addPointcut()")
    public void addAdvice02() {
        System.out.println("添加学生时，记录日志-后置增强 = AfterReturning");
    }

    @Around("StudentAdvice.addPointcut()")
    public void addAdvice04(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("添加学生时，记录日志-环绕增强前 = Around");
        joinPoint.proceed();
        System.out.println("添加学生时，记录日志-环绕增强后 = Around");
    }

    @After("StudentAdvice.addPointcut()")
    public void addAdvice03() {
        System.out.println("添加学生时，记录日志-最终增强 = After");
    }

    @AfterThrowing(value = "StudentAdvice.addPointcut()", throwing = "e")
    public void addAdvice05(Throwable e) {
        System.out.println("添加学生时，记录日志-异常增强 = AfterThrowing" + e.getMessage());
    }

    // 环绕增强  --  前置增强  --  方法体  --  环绕增强  --  最终增强  --  后置增强

}
