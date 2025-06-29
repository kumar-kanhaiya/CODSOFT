package Task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("\n💖Welcome to Student Grade Calculator Program 💖");
        float math , physics , chemistry , computerScience , english ;
        Scanner input = new Scanner(System.in);
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
        float totalMarks = math + physics + chemistry + computerScience + english;
        float averagePercentage = totalMarks/5;



    }
}
