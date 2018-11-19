package com.company;

import java.lang.annotation.Annotation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        String path = "com.company";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter class Name ex:Tiger ");
        String className = sc.nextLine();
       ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class cls = classLoader.loadClass(path+"."+className);

        for (Annotation annotation : cls.getDeclaredAnnotations()) {

            if (annotation instanceof Managed) {
                System.out.println(annotation.toString());

                Object obj = cls.newInstance();
                ((Animal) obj).showName();
                break;
            }else{


                System.out.println("Managed annotation not found");
            }
        }

        System.out.println();


    }
}
