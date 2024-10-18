//The Number Game(Guess the number)

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("NUMBER GAME\nTotal number of chances is 6\n");

        Scanner sc = new Scanner(System.in);   //object of Scanner class

        Random rmd = new Random();   //object of Random class
        int generated_num = rmd.nextInt(100) + 1;   //this will generate random number from 0 to 99 and then adds 1 to it

        System.out.print("Enter your guess (Guess the number between 1 to 100) : ");
        int guess = sc.nextInt();              //input guess

        guess(guess,generated_num,sc);  //calling guess(); method

    }
    static void guess(int guess,int generated_num,Scanner sc){
        int attempts = 1;

        //while loop with condition (guess != generated_num)
        while (guess != generated_num) {

            if (guess > generated_num)
                System.out.print("Your guess is too high.Enter your guess again : ");
            else if (guess < generated_num)
                System.out.print("Your guess is too low.Enter your guess again : ");
            guess = sc.nextInt();

            attempts  = attempts + 1;
            if(attempts == 6)
                break;
        }
        // desplaying score based on number of attempts taken
        if(attempts == 1)
            System.out.println("Your guess is correct.Your score is 100.You won!");
        else if (attempts == 2)
            System.out.println("Your guess is correct.Your score is 80.You won!");
        else if (attempts == 3)
            System.out.println("Your guess is correct.Your score is 60.You won!");
        else if (attempts == 4)
            System.out.println("Your guess is correct.Your score is 40.You won!");
        else if (attempts == 5)
            System.out.println("Your guess is correct.Your score is 20.You won!");
        else
            System.out.println("You have used your all attempts the correct number was " + generated_num + ".Your score is 0.You Failed!");
    }
}