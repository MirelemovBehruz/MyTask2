package org.example;

import java.util.ArrayList;
import java.util.List;

public class Floor implements ChangeablePlace {


    Room defaultRoom;
    Ladder curentLadder;
    String name;




    public Floor(String name,Room defaultRoom) {

        this.name = name;
        this.defaultRoom=defaultRoom;
    }

    @Override
    public void move(Place place) {

        if(curentLadder.canConect==true&& curentLadder.floor2==place.floor) {
            place.floor = this;
            place.room=defaultRoom;
            System.out.println("Спустился на "+this);
            System.out.println("там он очутился "+defaultRoom);
        }


    }

    @Override
    public String toString() {
        return name;
    }

    public static class Ladder extends Element {
        Floor floor1,floor2;
        boolean canConect;

        public Ladder(Floor floor1,Floor floor2,boolean canConect) {
            super("лестница");

            this.floor1=floor1;
            this.floor2=floor2;
            this.canConect=canConect;
        }
    }
}
