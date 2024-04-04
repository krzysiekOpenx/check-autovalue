package org.example;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Person {
    static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    abstract String name();
    abstract int id();

    @AutoValue.Builder
    interface Builder {
        Builder name(String x);
        Builder id(int x);
        Person build();
    }
}