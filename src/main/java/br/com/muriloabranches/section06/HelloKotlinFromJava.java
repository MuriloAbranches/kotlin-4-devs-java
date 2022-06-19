package br.com.muriloabranches.section06;

import br.com.muriloabranches.section05.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {
        Person rob = new Person("Robert", "Martin");

        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His name is now " + rob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);

    }
}
