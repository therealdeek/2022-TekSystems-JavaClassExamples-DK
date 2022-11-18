package com.sbaQuestion2_Sport_Inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class Cricket implements Sport {
    Cricket() {
        System.out.println("A new cricket team has been formed");
    }

    List<Integer> retired = new ArrayList<>();
@Override
public void calculateAvgAge(int[] age){
        double sum = 0;
        for(int age1 = 0; age1 < age.length; age1++){

            sum = sum + age[age1];
        }

        double avg = sum / age.length;

        System.out.println("The average age of the team is "+
                String.format("%.2f", (avg))); //using 2 digits after the decimal

    }
@Override
public void retirePlayer(int id){

        if(!retired.contains(id)){
            if(id >= 20 ){                      // less then 20 means they are retired players
                System.out.println("Player with id: "+ id +" has retired");
            }
            else if(id <= 40){                                // greater then 40 means the player is retired
                System.out.println("Player with id: "+ id +" has retired");
            }
        }
        else{
            System.out.println("Player has already retired");
        }

        retired.add(id);
    }
}
