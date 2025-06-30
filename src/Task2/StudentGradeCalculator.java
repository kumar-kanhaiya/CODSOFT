package Task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("\n💖Welcome to Student Grade Calculator Program 💖");
        float math , physics, chemistry , computerScience, english;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Maths Number : ");
            math = input.nextFloat();
            System.out.print("Enter Physics Number : ");
            physics = input.nextFloat();
            System.out.print("Enter Chemistry Number : ");
            chemistry = input.nextFloat();
            System.out.print("Enter ComputerScience Number : ");
            computerScience = input.nextFloat();
            System.out.print("Enter English Number : ");
            english = input.nextFloat();
            if(math<=100 && chemistry<=100 && computerScience<=100 && physics<=100 && english<=100){
                System.out.println("\nThanks for input numbers \n");
                break;
            }
            else{
                System.out.println("Enter marks less than or equal to 100");
                System.out.println("\nTry Again \n");
            }
        }
        float totalMarks = math + physics + chemistry + computerScience + english;
        float averagePercentage = totalMarks/5;
        char grade;
        if(averagePercentage >= 90 && averagePercentage<=100 ){
            grade = 'A';
        }
        else if(averagePercentage>=80 && averagePercentage<90){
            grade = 'B';
        }
        else if(averagePercentage>=70 && averagePercentage<80){
            grade = 'C';
        }
        else if(averagePercentage>=60 && averagePercentage<70){
            grade = 'D';
        }
        else if(averagePercentage>=50 && averagePercentage<60){
            grade = 'E';
        }
        else{
            grade = 'F';
        }
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Percentage : " + averagePercentage);
        System.out.println("Grade : " + grade);
        System.out.println("\n Thanks for Using \n");
        System.out.println("This program is created by Kanhaiya Kumar ");
    }
}
