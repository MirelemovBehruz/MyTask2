package org.example;

public enum Situation {
    unknown(""),
    on("над");

    private String preposition;

    Situation(String  preposition)
    {
        this.preposition=preposition;
    }

    public String getPreposition()
    {
        return this.preposition;
    }
}
