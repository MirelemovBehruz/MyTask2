package org.example.World;

import org.example.Home.Floor;
import org.example.Home.Room;
import org.example.Verb.ChangeablePlace;

public class Person {
    private Place place;
    private boolean beAttachSomeWhere=false;
    private String name;
    public Person(String name,Place place)
    {
        this.name=name;
        this.place=place;
    }

    public void changePlace(ChangeablePlace element)
    {
        System.out.print(name+" ");
        element.move(place);
        beAttachSomeWhere=false;


    }

    public  void  goOnLadder(Floor floor)
    {
        if(beAttachSomeWhere) {
            floor.getCurentLadder().setCanConect( true);
            System.out.println(name + " двигался по лестнице ");
        }else System.out.println("Из за отсуствия силы тяжести не смог спустится вниз");
    }

    public void pushCurentDoor(Room room)
    {
        System.out.println(name+" изо всех сил толкал "+room.getCurentDoor().getType());
       if(beAttachSomeWhere) {
           room.getCurentDoor().setOpened(true);
           System.out.println(room.getCurentDoor().getType() + " открылся");
       }else System.out.println(" в состоянии невесомости это не получился");

    }

    public void cling(String str)
    {
        System.out.println(name+" уцепился "+str);
        beAttachSomeWhere=true;

    }


    @Override
    public String toString() {
        return name;
    }
}
