package org.example.World;

import org.example.Verb.ChangeablePlace;

public class Element implements ChangeablePlace {
    private String type;
    public Element(String type)
    {
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void move(Place place) {
        place.setElement(this);
        System.out.println("плыл до "+this);
    }

    @Override
    public String toString() {
        return type;
    }
}
