package com.windrift.effectivejava.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 22/05/12
 * Time: 9:10 AM
 * To change this template use File | Settings | File Templates.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExceptionTest {
    Class<? extends Exception> value();
}
