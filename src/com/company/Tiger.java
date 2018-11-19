package com.company;

import java.lang.annotation.Annotation;
@Managed
@DefaultValue(firstName = "Richard ", lastName = "Parker")
public class Tiger extends Animal {
    Class aClass = Tiger.class;
    Annotation annotation = aClass.getAnnotation(DefaultValue.class);

    DefaultValue myAnnotation = (DefaultValue) annotation;


    String name =myAnnotation.firstName();

    String surrnaame = myAnnotation.lastName();



    @Override
    public void showName(){
        System.out.println("[Tiger] My name is "+name+" and surr = "+surrnaame );


    }
}
