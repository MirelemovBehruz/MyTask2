package org.example;

public class Person {
    Place place;
    boolean beAttachSomeWhere=false;
    private String name;
    public Person(String name,Place place)
    {
        this.name=name;
        this.place=place;
    }

    public void changePlace(ChangeablePlace element)
    {
        element.move(place);
        beAttachSomeWhere=false;

    }

    public  void  goOnLadder(Floor floor)
    {
        if(beAttachSomeWhere)
            floor.curentLadder.canConect=true;
    }

    public void pushCurentDoor(Room room)
    {
       if(beAttachSomeWhere)
        room.curentDoor.isOpened=true;
    }

    public void cling()
    {
        beAttachSomeWhere=true;
    }




}
