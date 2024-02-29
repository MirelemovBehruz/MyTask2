package org.example;

public class Place {
    Floor floor;
    Room room;
    Element element;

    String pre;

    public Place(Floor floor,Room room,Element element,String pre)
    {
        this.floor=floor;
        this.room=room;
        this.element=element;
        this.pre=pre;
    }

}
