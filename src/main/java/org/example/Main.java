package org.example;

import org.example.Error.CanBeAnyError;
import org.example.Verb.Action;
import org.example.World.Element;
import org.example.Home.Floor;
import org.example.Home.Room;
import org.example.World.Person;
import org.example.World.Place;


public class Main {

   public static void someProcess() throws CanBeAnyError {
      class Local {
         public void doSomething() throws CanBeAnyError {
            Element table=new Element("столовый");
            Room room4=new Room("гостиная",table);
            Room room3=new Room("нижний колидор",null);
            Floor floor1=new Floor("1й этаж",room3);
             floor1.setCurentLadder(new Floor.Ladder(floor1,null,false));
            Room room2=new Room("верхний колидор",floor1.getCurentLadder());
            Room room1=new Room("начальное комната",null);

            Floor floor2=new Floor("2й этаж",room2);
             floor1.getCurentLadder().setFloor2(floor2);






             Element chair=new Element("стулья");
             Element bench=new Element("скамейки");
             Element bowl=new Element("миски");
             Element dish=new Element("тарелки");
             Element spoon=new Element("ложки");

            room2.setCurentDoor(room2.new Door(room1,false));
            room4.setCurentDoor(room4.new Door(room3,false));

            floor1.setCurentLadder(new Floor.Ladder(floor1,floor2,false));





            Person znayka=new Person("Знайка",new Place(floor2,room1,null,Situation.unknown.getPreposition()));

            Person korotshes=new Person("Коротыши",new Place(floor1,room4,table,Situation.unknown.getPreposition()));



            Action action=new Action() {
               @Override
               public void run() {
//процесс происходит здесь


                     znayka.changePlace(room2.getCurentDoor());

                     znayka.pushCurentDoor(room2);

                     znayka.cling("за притолоку");

                     znayka.pushCurentDoor(room2);

                     znayka.changePlace(room2);
                     znayka.goOnLadder(floor1);

                     znayka.cling("за перила");

                     znayka.goOnLadder(floor1);

                     znayka.changePlace(floor1);
                     znayka.changePlace(room4.getCurentDoor());

                     znayka.cling("за притолоку");

                     znayka.pushCurentDoor(room4);

                     znayka.changePlace(room4);


                     System.out.println("Он увидел "+korotshes+", собравшиеся в "+table+", не сидели, как всегда, за "+table+", а плавали в различных позах по воздуху. Вокруг них плавали "+chair+", "+bench+", "+bowl+", "+dish+", "+spoon);

               }
            };

            try {
               action.run();
            }catch (Exception e){

            throw new CanBeAnyError("вот проблема"+e.getMessage());
            }



         }
      }

      Local local = new Local();
      local.doSomething();


   }



    public static void main(String[] args) {


       try {
          someProcess();
       } catch (CanBeAnyError e) {


          System.out.println(e.getMessage());
       }
    }
}
