/************************************************************
 *                                                          *
 *  CSCI 470-1   Assignment 3 Pt 2              Spring 2019 *
 *                                                          *
 *  Programmer:  Samuel Piecz                               *  
 *               z1732715                                   *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    3/06/19                                    *
 *                                                          *
 ************************************************************/ 
import java.util.Scanner;

public class DateDemo
{
    public static void main(String[] args)
    {
        // Objects
        int day, month, year; 
        Scanner keyScan = new Scanner(System.in);

        // Get day from user
        System.out.print("Please enter the day: ");
        day = keyScan.nextInt();

        // Get month from user
        System.out.print("Please enter the month: ");
        month = keyScan.nextInt();

        // Get year from user
        System.out.print("Please enter the year: ");
        year = keyScan.nextInt();

        // Make date obj
        Date myDate = new Date(day, month, year);

        // Call methods
        System.out.print("Days since January: " + myDate.daysSinceJan1() + "\n");
    }
}
