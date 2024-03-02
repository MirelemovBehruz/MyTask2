package org.example.World;

import org.example.World.Element;
import org.example.Home.Floor;
import org.example.Home.Room;

public class Place {
    private Floor floor;
    private Room room;
    private Element element;

    private String pre;

    public void setElement(Element element) {
        this.element = element;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Element getElement() {
        return element;
    }

    public Room getRoom() {
        return room;
    }

    public Floor getFloor() {
        return floor;
    }

    public Place(Floor floor, Room room, Element element, String pre)
    {
        this.floor=floor;
        this.room=room;
        this.element=element;
        this.pre=pre;
    }

}
