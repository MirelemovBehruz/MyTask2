package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

   public static void someProcess() throws ElementNotFoundException {
      class Local {
         public void doSomething() {
            Element table=new Element("стол");
            Room room4=new Room("гостиная",table);
            Room room3=new Room("нижний колидор",null);
            Floor floor1=new Floor("1й этаж",room3);
            Room room2=new Room("верхний колидор",floor1.curentLadder);
            Room room1=new Room("начальное комната",null);

            Floor floor2=new Floor("2й этаж",room2);






            room2.curentDoor=room2.new Door(room1,false);
            room4.curentDoor=room4.new Door(room3,false);

            floor1.curentLadder=new Floor.Ladder(floor1,floor2,false);




            Element chair=new Element("стул");
            Person znayka=new Person("Знайка",new Place(floor2,room1,null,Situation.unknown.getPreposition()));

            Person korotshes=new Person("Коротыши",new Place(floor1,room4,table,Situation.unknown.getPreposition()));



            Action action=new Action() {
               @Override
               public void run() {
                  try {


                     znayka.changePlace(room2.curentDoor);
                     znayka.cling();

                     znayka.pushCurentDoor(room2);

                     znayka.changePlace(room2);


                     znayka.cling();

                     znayka.goOnLadder(floor1);

                     znayka.changePlace(floor1);
                     znayka.cling();

                     znayka.pushCurentDoor(room4);

                     znayka.changePlace(room4);

                  } catch (InvalidActionException e) {
                     System.out.println("Ошибка выполнения действия: " + e.getMessage());
                  }
               }
            };

            action.run();

            System.out.println(znayka.place.room.name);
         }
      }

      Local local = new Local();
      local.doSomething();


   }



    public static void main(String[] args) throws Exception{


      someProcess();

        }
    }
