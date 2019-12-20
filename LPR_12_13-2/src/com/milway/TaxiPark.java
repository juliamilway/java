package com.milway;

import java.util.Arrays;
import java.util.StringJoiner;

import static java.util.Arrays.copyOf;

public class TaxiPark {
    EconomicClass [] economic=new EconomicClass[1];
    MiddleClass [] middle=new MiddleClass [1];
    EliteClass [] elite=new EliteClass [1];
    //GeneralCars[]crs=new GeneralCars[2];

    public TaxiPark (){
        economic [0]=new EconomicClass("Lanos", 8000, 7, 60);
        middle [0]=new MiddleClass("Nissan", 15000, 10, 80);
        elite [0]=new EliteClass("Range Rover", 30000, 15, 90);
    }

    public EconomicClass[] getEconomic() {
        return economic;
    }

    public void setEconomic(EconomicClass[] economic) {
        this.economic = economic;
    }

    public MiddleClass[] getMiddle() {
        return middle;
    }

    public void setMiddle(MiddleClass[] middle) {
        this.middle = middle;
    }

    public EliteClass[] getElite() {
        return elite;
    }

    public void setElite(EliteClass[] elite) {
        this.elite = elite;
    }

    public void  addCar(EconomicClass obj) {
        int count=economic[0].getCount()-1;
        if (economic.length <= economic[0].getCount()-1) {
            economic = Arrays.copyOf(economic, economic.length + count);
            economic[economic[0].getCount() - 1] = obj;
        } else {
            economic[economic[0].getCount() - 1] = obj;
        }
    }
        public void  addCar( MiddleClass obj) {
            int count=middle[0].getCount()-1;
            if (middle.length <= middle[0].getCount()-1) {
                middle = Arrays.copyOf(middle, middle.length + count);
                middle[middle[0].getCount() - 1] = obj;
            } else {
                middle[middle[0].getCount() - 1] = obj;
            }
        }
            public void  addCar( EliteClass obj) {
                int count=economic[0].getCount()-1;
                if (elite.length <= elite[0].getCount()-1) {
                    elite = Arrays.copyOf(elite, elite.length + count);
                    elite[elite[0].getCount() - 1] = obj;
                } else {
                    elite[elite[0].getCount() - 1] = obj;
                }
        }

    @Override
    public String toString() {
        return new StringJoiner(", ", TaxiPark.class.getSimpleName() + "[", "]")
                .add("economic=" + Arrays.toString(economic))
                .add("middle=" + Arrays.toString(middle))
                .add("elite=" + Arrays.toString(elite))
                .toString();
    }
}

