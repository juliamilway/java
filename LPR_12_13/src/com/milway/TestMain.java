package com.milway;

public class TestMain {

    public static void main(String[] args) {
    Piano piano=new Piano("Rolex", new Button("Button","White and Black"), new Pedal("right and left", true));
    piano.pianoPlay();
    }

}
