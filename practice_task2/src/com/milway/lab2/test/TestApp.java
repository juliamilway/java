package com.milway.lab2.test;

import com.milway.lab2.model.Timber;
import com.milway.lab2.store.ProductStore;
import com.milway.lab2.store.WoodDirectory;

public class TestApp {
    //Creating wood catalog
    WoodDirectory wd =new WoodDirectory();
    //Timber catalog
    ProductStore ps =new ProductStore();

    private float calcWeight() {
        float fullWeight = 0;
        for (Timber timber : ps.getArr()) {
            fullWeight += timber.weight();
        }
        return fullWeight;
    }

    public void startApp(){

     //Fill timber store
     ps.add(new Timber(wd.get(1), 5f, 0.5f, 0.4f));
     ps.add(new Timber(wd.get(2), 10f, 0.5f, 0.4f));

     //Print counted product
        System.out.println(wd);
        System.out.println(ps);


        //Count calcWeight
        System.out.printf("General weight: %1.3f", calcWeight());

    }

    public static void main(String[] args) {
        TestApp app = new TestApp();
            app.startApp();
        }
    }
