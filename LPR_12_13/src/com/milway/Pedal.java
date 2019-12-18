package com.milway;

import java.util.StringJoiner;

public class Pedal {
    private String pedalName;
    private boolean pedalString;
    public Pedal (){}

    public Pedal(String pedalName, boolean pedalString) {
        this.pedalName = pedalName;
        this.pedalString = pedalString;
    }

    public String getPedalName() {
        return pedalName;
    }

    public void setPedalName(String pedalName) {
        this.pedalName = pedalName;
    }

    public boolean isPedalString() {
        return pedalString;
    }

    public void setPedalString(boolean pedalString) {
        this.pedalString = pedalString;
    }
    public void pedalPressed(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        if (pedalString)
            return pedalName+" is pressed";
        else
            return "Pedal is not pressed";
    }
}
