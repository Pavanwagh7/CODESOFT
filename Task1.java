//The Number Game(Guess the number)

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("NUMBER GAME\nTotal number of chances is 6\n");

        Scanner sc = new Scanner(System.in);

        Random rmd = new Random();
        int generated_num = rmd.nextInt(100) + 1;

        System.out.print("Enter you guess (Guess the number between 1 to 100) : ");
        int guess = sc.nextInt();

        guess(guess,generated_num,sc);

    }
    static void guess(int guess,int generated_num,Scanner sc){
        int attempts = 1;

        while (guess != generated_num) {

            if (guess > generated_num)
                System.out.print("Your guess is too high.Enter you guess again : ");
            else if (guess < generated_num)
                System.out.print("Your guess is too low.Enter you guess again : ");
            guess = sc.nextInt();

            attempts  = attempts + 1;
            if(attempts == 6)
                break;
        }
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
            System.out.println("Your guess is wrong.Your score is 0.You Failed!");
    }
}