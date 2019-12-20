package com.milway;

import java.util.Arrays;
import java.util.Scanner;

public class AppConsole {
    TaxiPark function=new TaxiPark();



    private void addPrice() {
        EconomicClass[] temp = Arrays.copyOf(function.getEconomic(), function.getEconomic()[0].getCount());
        MiddleClass [] temp1 = Arrays.copyOf(function.getMiddle(), function.getMiddle()[0].getCount());
        EliteClass [] temp2 = Arrays.copyOf(function.getElite(), function.getElite()[0].getCount());
        int generalprice = 0;
        for (int i = 0; i < temp.length; i++) {
            generalprice += temp[i].getCarPrice();

        }
        for (int i = 0; i < temp1.length; i++) {
            generalprice += temp1[i].getCarPrice();
        }
        for (int i = 0; i < temp2.length; i++) {
            generalprice += temp2[i].getCarPrice();
        }
        System.out.println("General price of Taxi Park is: "+generalprice+" $");
    }

    private void sortByFuel() {
        EconomicClass temp;
        MiddleClass temp1;
        EliteClass temp2;

//Bubble Method
        for (int i = 0; i < function.getEconomic()[0].getCount(); i++) {
            for (int j = 1; j < (function.getEconomic()[0].getCount() - i); j++) {
                if (function.getEconomic()[j - 1].getCarFuel() > function.getEconomic()[j].getCarFuel()) {
                    temp = function.getEconomic()[j - 1];
                    function.getEconomic()[j] = function.getEconomic()[j - 1];
                    function.getEconomic()[j - 1] = temp;
                }
            }
        }

            for (int i = 0; i < function.getMiddle()[0].getCount(); i++) {
                for (int j = 1; j < (function.getMiddle()[0].getCount() - i); j++) {
                    if (function.getMiddle()[j - 1].getCarFuel() > function.getMiddle()[j].getCarFuel()) {
                        temp1 = function.getMiddle()[j - 1];
                        function.getMiddle()[j] = function.getMiddle()[j - 1];
                        function.getMiddle()[j - 1] = temp1;
                    }
                }
            }

        for (int i = 0; i < function.getElite()[0].getCount(); i++) {
            for (int j = 1; j < (function.getElite()[0].getCount() - i); j++) {
                if (function.getElite()[j - 1].getCarFuel() > function.getElite()[j].getCarFuel()) {
                    temp2 = function.getElite()[j - 1];
                    function.getElite()[j] = function.getElite()[j - 1];
                    function.getElite()[j - 1] = temp2;
                }
            }
        }
        System.out.println("Cars were sorted by fuel rate");

    }
    public void findCarBySpeed (int carSpeed){
        int count=0;
        for (int i=0; i<function.getEconomic()[0].getCount(); i++){
            if (function.getEconomic()[i].getCarSpeed()>=carSpeed){
                count++;
            }
        }
        for (int i=0; i<function.getMiddle()[0].getCount(); i++){
            if (function.getMiddle()[i].getCarSpeed()>=carSpeed){
                count++;
            }
        }
        for (int i=0; i<function.getElite()[0].getCount(); i++){
            if (function.getElite()[i].getCarSpeed()>=carSpeed){
                count++;
            }
        }
        if (count>0){
            System.out.println("This car exist in the Taxi Park "+carSpeed);
        }
        else {
            System.out.println("This car is not found :(");
        }

    }

    public void showConsole(){
    int choice = 1;
        Scanner in=new Scanner(System.in);
    while (choice!=0){
        System.out.println("Make your choice, please:\n 1. General Price:\n 2. Sort By Fuel:\n 3. Find Car By Speed:");
        System.out.println("0 for exit");
        choice=in.nextInt();
        switch (choice){
            case 1: {
                addPrice();
                break;
            }
            case 2: {
                sortByFuel();
                break;
            }
            case 3: {
                System.out.println("Enter the volume of the car speed");
                findCarBySpeed(in.nextInt());
                break;
            }
            default: {
                System.out.println("Error! Please, enter the correct rates");
            }
        }
    }
    }
}
