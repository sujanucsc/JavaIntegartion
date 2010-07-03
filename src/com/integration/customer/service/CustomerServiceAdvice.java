package com.integration.customer.service;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: Jul 3, 2010
 * Time: 6:43:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerServiceAdvice extends MethodBeforeAdvice, AfterReturningAdvice {
}
