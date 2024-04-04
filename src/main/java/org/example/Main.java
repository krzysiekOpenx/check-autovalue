package org.example;

public class Main {
    public static void main(String[] args) {
        Animal kangur = Animal.builder().setName("kangur").setNumberOfLegs(2).build();
        System.out.println(kangur.name());
        Animal los = kangur.toBuilder().setName("Łoś").setNumberOfLegs(4).build();
        System.out.println(los.name());
    }
}