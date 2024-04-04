package org.example;
import com.google.auto.value.AutoValue;
@AutoValue
abstract class Animal {
    abstract String name();
    abstract int numberOfLegs();

    static Builder builder() {
        return new AutoValue_Animal.Builder();
    }

    public abstract Builder toBuilder();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setName(String value);
        abstract Builder setNumberOfLegs(int value);
        abstract Animal build();
    }
}