package com.example.sach.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class LogBook {
    @AfterThrowing(pointcut = "execution( public * com.example.sach.SachApplication.*(..))", throwing = "e")
    public void logError(JoinPoint joinPoint,Exception e){
        String className = joinPoint.getClass().getSimpleName();
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("\nO day co loi :)): %s.%s.%s.%s: %s", className,
                returnType,
                methodName,
                argsName,
                e.getMessage());
    }
    @AfterReturning("execution( public * com.example.sach.SachApplication.*(..))")
    public void logChange(JoinPoint joinPoint){
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("\nDa thuc hien : %s.",argsName);
    }
}
