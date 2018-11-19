package com.company;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ FIELD,  TYPE})
public @interface DefaultValue {
    String firstName() default "John" ;
    String lastName() default "Snow";


}