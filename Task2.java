//Student Grade calculator

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input_Student_Info(sc); //this method is called to take details from user

        sc.close();
    }
    static void input_Student_Info(Scanner sc){
        System.out.println("\nGive Details to calculate your result\n");

        System.out.print("Enter your name : ");  //input your name
        String name = sc.nextLine().trim();        //input your name

        System.out.print("Enter your class (In which class do you study,Ex..,9th,10th,11th,12th,only provide neumeric value(If you are in 12th class,provide 12)): ");
        int std = sc.nextInt();       //input you class
        System.out.println();

        System.out.println("Enter your marks of each subject out of 100");

        System.out.print("Mathematics = ");
        int maths = sc.nextInt();                    //input your Mathematics marks
        System.out.print("Science = ");
        int sci = sc.nextInt();                      //input your Science marks
        System.out.print("Hindi = ");
        int hindi = sc.nextInt();                    //input your Hindi marks
        System.out.print("History = ");
        int history = sc.nextInt();                  //input your History marks
        System.out.print("Political Science = ");
        int polity = sc.nextInt();                   //input your Political Science marks
        System.out.print("Geography = ");
        int geog = sc.nextInt();                     //input your Geography marks

        System.out.println("\n");


        double percent = calculate_percentage(maths,sci,hindi,history,polity,geog); //this method is called to calculate percentage of 6 subbjects

        print_Student_Info(name,std,percent,maths,sci,hindi,history,polity,geog); //this method is called t print the details and the result of student
    }
    static double calculate_percentage(int maths,int sci,int hindi,int history,int polity,int geog){
        return (maths + sci + hindi + history + polity + geog)/6;
    }
    static void print_Student_Info(String name,int std,double percent,int maths,int sci,int hindi,int history,int polity,int geog){
        System.out.println("RESULT\n");

        System.out.println("Name : " + name);
        System.out.println("Class : " + std);

        System.out.print("Mathematics = " + maths);
        System.out.println();
        System.out.print("Science = " + sci);
        System.out.println();
        System.out.print("Hindi = " + hindi);
        System.out.println();
        System.out.print("History = " + history);
        System.out.println();
        System.out.print("Political Science = " +polity );
        System.out.println();
        System.out.print("Geography = " + geog);
        System.out.println("\n");

        //displaying percentage
        System.out.print("percentage (%) = " + percent + " %");
        System.out.println();

        //displaying Grades based on Percentage
        if(percent < 40 )
            System.out.println("Grade : F (Fail)");
        else if(percent < 60 )
            System.out.println("Grade : D");
        else if(percent < 70 )
            System.out.println("Grade : C");
        else if(percent < 80 )
            System.out.println("Grade : B");
        else if(percent < 90 )
            System.out.println("Grade : A");
        else
            System.out.println("Grade : A+");

        System.out.println();

    }
}