package com.shakov.task.oop.homework;

public class Room {

    private final boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public void print() {
        System.out.println("Эта комната проходная?  - " + isWalkThrough);
    }

    @Override
    public String toString() {
        return "Room{" +
                "isWalkThrough=" + isWalkThrough +
                '}';
    }
}
