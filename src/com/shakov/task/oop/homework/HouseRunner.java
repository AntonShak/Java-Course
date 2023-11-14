package com.shakov.task.oop.homework;

import java.util.List;

public class HouseRunner {
    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(true);

        List<Room> roomsForFlat1 = List.of(room1);
        List<Room> roomsForFlat2 = List.of(room1, room2);
        List<Room> roomsForFlat3 = List.of(room1, room2, room3);

        Flat flat1 = new Flat(1, roomsForFlat1);
        Flat flat2 = new Flat(2, roomsForFlat2);
        Flat flat3 = new Flat(3, roomsForFlat3);

        List<Flat> flatsForFloor1 = List.of(flat1, flat2, flat3);
        List<Flat> flatsForFloor2 = List.of(flat1, flat2);

        Floor floor1 = new Floor(1, flatsForFloor1);
        Floor floor2 = new Floor(2, flatsForFloor2);

        List<Floor> floorList = List.of(floor1, floor2);

        House house = new House(1, floorList);

        room1.print();
        System.out.println("---------------------------------");
        flat1.print();
        System.out.println("---------------------------------");
        floor1.print();
        System.out.println("---------------------------------");
        house.print();
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        house.printAllInformation();

    }
}
