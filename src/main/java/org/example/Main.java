package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

   public static void someProcess() throws CanBeAnyError {
      class Local {
         public void doSomething() throws CanBeAnyError {
            Element table=new Element("столовый");
            Room room4=new Room("гостиная",table);
            Room room3=new Room("нижний колидор",null);
            Floor floor1=new Floor("1й этаж",room3);
             floor1.curentLadder=new Floor.Ladder(floor1,null,false);
            Room room2=new Room("верхний колидор",floor1.curentLadder);
            Room room1=new Room("начальное комната",null);

            Floor floor2=new Floor("2й этаж",room2);
             floor1.curentLadder.floor2=floor2;





             // добавим в список ряд элементов
             Element chair=new Element("стулья");
             Element bench=new Element("скамейки");
             Element bowl=new Element("миски");
             Element dish=new Element("тарелки");
             Element spoon=new Element("ложки");

            room2.curentDoor=room2.new Door(room1,false);
            room4.curentDoor=room4.new Door(room3,false);

            floor1.curentLadder=new Floor.Ladder(floor1,floor2,false);





            Person znayka=new Person("Знайка",new Place(floor2,room1,null,Situation.unknown.getPreposition()));

            Person korotshes=new Person("Коротыши",new Place(floor1,room4,table,Situation.unknown.getPreposition()));



            Action action=new Action() {
               @Override
               public void run() {
//процесс происходит здесь


                     znayka.changePlace(room2.curentDoor);

                     znayka.pushCurentDoor(room2);

                     znayka.cling("за притолоку");

                     znayka.pushCurentDoor(room2);

                     znayka.changePlace(room2);
                     znayka.goOnLadder(floor1);

                     znayka.cling("за перила");

                     znayka.goOnLadder(floor1);

                     znayka.changePlace(floor1);
                     znayka.changePlace(room4.curentDoor);

                     znayka.cling("за притолоку");

                     znayka.pushCurentDoor(room4);

                     znayka.changePlace(room4);


                     System.out.println("Он увидел "+korotshes+", собравшиеся в "+table+", не сидели, как всегда, за "+table+", а плавали в различных позах по воздуху. Вокруг них плавали "+chair+", "+bench+", "+bowl+", "+dish+", "+spoon);

               }
            };

            try {
               action.run();
            }catch (Exception e){

            throw new CanBeAnyError("вот проблема");
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
