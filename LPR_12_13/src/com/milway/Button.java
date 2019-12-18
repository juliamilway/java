package com.milway;

import java.util.StringJoiner;

public class Button {
    private String buttonName;
    private String buttonColor;
    public Button (){}

    public Button (String buttonName, String buttonColor){
        this.buttonName=buttonName;
        this.buttonColor=buttonColor;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }
    public void buttonPressed(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return buttonColor+" "+buttonName;
    }
}
