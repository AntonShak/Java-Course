package com.shakov.task.oop.homework;

import java.util.List;

public class Floor {

    private final int id;
    private final List<Flat> flats;

    public Floor(int id, List<Flat> flats) {
        this.id = id;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Этаж № - " + id + ". Количество квартир - " + flats.size());
    }

    public int getId() {
        return id;
    }

    public List<Flat> getFlats() {
        return flats;
    }
}
