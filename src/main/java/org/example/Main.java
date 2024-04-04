package org.example;

public class Main {
    public static void main(String[] args) {
        Animal jezyk = Animal.builder().setName("Jeżyk").setNumberOfLegs(4).build();
        System.out.printf("Zwierze: %s, ilość nóg: %s\n",jezyk.name(),jezyk.numberOfLegs());
        Animal los = jezyk.toBuilder().setName("Łoś").build();
        System.out.printf("Zwierze: %s, ilość nóg: %s\n",los.name(),los.numberOfLegs());
    }
}