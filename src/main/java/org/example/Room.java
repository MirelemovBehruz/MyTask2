package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room implements ChangeablePlace {


   Element defaultElement;
    Door curentDoor;


    String name;


    public Room(String name,Element element) {

        this.name = name;
        this.defaultElement=element;

    }


    @Override
    public void move(Place place) {
        if(curentDoor.isOpened==true&& curentDoor.relationRoom==place.room) {
            place.room = this;
            System.out.println("перешел ");
            place.element=defaultElement;
        }


    }




    class Door extends Element {

        Room relationRoom;
        boolean isOpened;

        public Door(Room room,boolean isOpened) {
            super("дверь");

            relationRoom=room;
            this.isOpened=isOpened;
        }

    }
}