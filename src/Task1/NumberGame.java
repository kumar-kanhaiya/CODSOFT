package Task1;
// Task -1

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("\n💖Welcome To Number Guessing Game 💖\n");
        int computerGuess = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        int ans = 1 ;
        while(true){
            if(ans>7){
                System.out.print("You took more than 7 attempt , Please restart game !!");
                break;
            }

            System.out.print("Guess your number between 1 to 100 : ");
            int number = input.nextInt();
            if(number > computerGuess){
                System.out.print("Number is too high \n");
                ans++;
            }
            else if(number < computerGuess){
                System.out.print("Number is too low \n");
                ans++;
            }
            else{
                // ans found
                System.out.print("Successfully guess the number !!!\n");
                System.out.printf("You took %d  attempt " , ans);
                break;
            }
        }
        System.out.print("\n\nThanks for playing !!\n");
        System.out.println("This program is made by Kanhaiya Kumar\n");
    }
}
