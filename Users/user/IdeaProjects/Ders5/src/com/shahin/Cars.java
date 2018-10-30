package com.shahin;

import java.util.List;

public class Cars {
    private Car enHizli;
    private List<Car> diger;

    public Car getEnHizli() {
        return enHizli;
    }

    public void setEnHizli(Car enHizli) {
        this.enHizli = enHizli;
    }

    public List<Car> getDiger() {
        return diger;
    }

    public void setDiger(List<Car> diger) {
        this.diger = diger;
    }

    @Override
    public String toString() {

        String cars = "En hizli araba" + "\n" + enHizli + "\n\nDiger arabalar: \n";
        for (Car a : diger) {
            cars += a + "\n";
        }
        return cars;
    }
}
