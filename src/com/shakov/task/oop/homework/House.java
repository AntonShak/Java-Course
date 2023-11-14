package com.shakov.task.oop.homework;

import java.util.List;

public class House {

    private final int id;
    private final List<Floor> floors;

    public House(int id, List<Floor> floors) {
        this.id = id;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом № - " + id + ". Количество этажей - " + floors.size());
    }

    public void printAllInformation() {
        print();
        System.out.println();
        for (Floor floor : floors) {
            floor.print();
            for (Flat flat : floor.getFlats()) {
                flat.print();
                for (Room room : flat.getRooms()) {
                    room.print();
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
