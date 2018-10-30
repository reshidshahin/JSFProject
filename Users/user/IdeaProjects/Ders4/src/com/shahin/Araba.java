package com.shahin;

public class Araba {

    private String name,model,segment;

    public Araba() {
    }

    public Araba(String name, String model, String segment) {
        this.name = name;
        this.model = model;
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", segment='" + segment + '\'' +
                '}';
    }
}
