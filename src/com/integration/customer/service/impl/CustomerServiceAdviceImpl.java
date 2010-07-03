package com.integration.customer.service.impl;

import com.integration.customer.service.CustomerServiceAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.AfterReturningAdvice;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jul 3, 2010
 * Time: 6:44:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerServiceAdviceImpl implements MethodBeforeAdvice, AfterReturningAdvice {


    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("*********************************Before advice executed");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("*********************************After advice executed");
    }

    
}
