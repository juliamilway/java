package com.milway;

import java.util.StringJoiner;

public class Piano {
    private String pianoBrand;
    private Button button=new Button();
    private Pedal pedal=new Pedal();

    public Piano(String pianoBrand, Button button, Pedal pedal) {
        this.pianoBrand = pianoBrand;
        this.button = button;
        this.pedal = pedal;
    }

    public String getPianoBrand() {
        return pianoBrand;
    }

    public void setPianoBrand(String pianoBrand) {
        this.pianoBrand = pianoBrand;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Pedal getPedal() {
        return pedal;
    }

    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }
    public void pianoSetting() {
        System.out.println("The piano was set:)");
    }
    public void pianoPlay(){
        int count=0;
        while (count!=10){
            button.buttonPressed();
            pedal.pedalPressed();
            count++;
        }
    }

}
