package com.fy.fyy.back.action;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface To {

  public enum TYPE {
    forwrad, redirect
  }

  TYPE value() default TYPE.forwrad;
}