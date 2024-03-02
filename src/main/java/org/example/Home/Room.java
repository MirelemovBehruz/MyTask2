package org.example.Home;

import org.example.Error.InvalidActionException;
import org.example.World.Place;
import org.example.Verb.ChangeablePlace;
import org.example.World.Element;

public class Room implements ChangeablePlace {


    private Element defaultElement;
    private Door curentDoor;
    private String name;

    public Door getCurentDoor() {
        return curentDoor;
    }

    public void setCurentDoor(Door curentDoor) {
        this.curentDoor = curentDoor;
    }

    public Room(String name, Element element) {

        this.name = name;
        this.defaultElement=element;

    }


    @Override
    public void move(Place place) {
        if(curentDoor.isOpened==true&& curentDoor.relationRoom==place.getRoom()) {
            place.setRoom( this);
            System.out.println("перешел в  "+this);
            place.setElement(defaultElement);
            System.out.println("там он очутился "+defaultElement);
        }
        else throw  new InvalidActionException("Нету входа в комнату "+this.name);


    }

    @Override
    public String toString() {
        return name;
    }

    public class Door extends Element {

        private Room relationRoom;
        private boolean isOpened;

        public void setOpened(boolean opened) {
            isOpened = opened;
        }

        public Door(Room room, boolean isOpened) {
            super("дверь");

            relationRoom=room;
            this.isOpened=isOpened;
        }

    }
}