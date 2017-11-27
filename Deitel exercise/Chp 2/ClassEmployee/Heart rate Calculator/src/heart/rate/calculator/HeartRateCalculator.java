/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heart.rate.calculator;

import java.util.Scanner;

/**
 *
 * @author cedwa
 */


public class HeartRateCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        
        int day,month,year;
        
        HeartRate person1 = new HeartRate();
        
        person1.setFirstName("Ali");
        person1.setLastName("Akber");
        
        System.out.println("Enter birth date: (dd/mm/yy)");
        
        Scanner input = new Scanner(System.in);
       
        day=input.nextInt();
        month=input.nextInt();
        year=input.nextInt();
        
        person1.setDate(day,month,year);
        
        System.out.printf("Name: %s %s\n", person1.getFirstName(), person1.getLastName());
        System.out.printf("Birth date:");
        person1.printBirthDate();
        System.out.printf("Age: %d\n", (int)person1.calculateAge());
        System.out.printf("Maximum Heart Rate: %.2f\n", person1.calcMaxHeartRate());
        System.out.printf("Target Heart Rate: %.2f\n", person1.calcTargetHeartRate());
    }
    
}
