package org.example;

public class Element implements ChangeablePlace{
    String type;
    public Element(String type)
    {
        this.type=type;
    }


    @Override
    public void move(Place place) {
        place.element=this;
        System.out.println("плыл до "+this);
    }

    @Override
    public String toString() {
        return type;
    }
}
