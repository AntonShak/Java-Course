package com.shakov.task.oop.homework;

import java.util.ArrayList;
import java.util.List;

public class Flat {

    private final int id;

    private final List<Room> rooms;

    public Flat(int id, List<Room> rooms) {
        this.id = id;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Квартрира № - " + id + ". Количество комнат в ней: " + rooms.size());
    }

    public int getId() {
        return id;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
