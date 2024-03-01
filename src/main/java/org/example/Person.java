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
        System.out.print(name+" ");
        element.move(place);
        beAttachSomeWhere=false;


    }

    public  void  goOnLadder(Floor floor)
    {
        if(beAttachSomeWhere) {
            floor.curentLadder.canConect = true;
            System.out.println(name + " двигался по лестнице ");
        }else System.out.println("Из за отсуствия силы тяжести не смог спустится вниз");
    }

    public void pushCurentDoor(Room room)
    {
        System.out.println(name+" изо всех сил толкал "+room.curentDoor.type);
       if(beAttachSomeWhere) {
           room.curentDoor.isOpened = true;
           System.out.println(room.curentDoor.type + " открылся");
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
