/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heart.rate.calculator;

/**
 *
 * @author cedwa
 */
public class HeartRate {
    private String firstName, lastName;
    private int day,month,year;
    private double age;
    
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setDate(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    public void printBirthDate()
    {
        System.out.printf("%02d.%02d.%04d\n", day,month,year);
    }
    
    public double calculateAge()
    {
        age=2017-year;
        
        return age;
    }
    
    public double calcMaxHeartRate()
    {
        return 220-age;
    }
    
    public double calcTargetHeartRate()
    {
        return ((220-age)*85)/100;
    }
    
}
