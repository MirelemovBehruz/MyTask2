package org.example.Home;

import org.example.Error.InvalidActionException;
import org.example.World.Place;
import org.example.Verb.ChangeablePlace;
import org.example.World.Element;

public class Floor implements ChangeablePlace {


    private Room defaultRoom;
    private Ladder curentLadder;
    private String name;


    public Ladder getCurentLadder() {
        return curentLadder;
    }

    public void setCurentLadder(Ladder curentLadder) {
        this.curentLadder = curentLadder;
    }

    public Floor(String name, Room defaultRoom) {

        this.name = name;
        this.defaultRoom=defaultRoom;
    }

    @Override
    public void move(Place place) {

        if(curentLadder.canConect==true&& curentLadder.floor2==place.getFloor()) {
            place.setFloor(this);
            place.setRoom(defaultRoom);
            System.out.println("Спустился на "+this);
            System.out.println("там он очутился "+defaultRoom);
        }else  throw  new InvalidActionException(" не возможно спустится  "+this.name);



    }

    @Override
    public String toString() {
        return name;
    }

    public static class Ladder extends Element {
        private Floor floor1,floor2;

        public void setFloor2(Floor floor2) {
            this.floor2 = floor2;
        }

        private boolean canConect;

        public void setCanConect(boolean canConect) {
            this.canConect = canConect;
        }

        public Ladder(Floor floor1, Floor floor2, boolean canConect) {
            super("лестница");

            this.floor1=floor1;
            this.floor2=floor2;
            this.canConect=canConect;
        }
    }
}
