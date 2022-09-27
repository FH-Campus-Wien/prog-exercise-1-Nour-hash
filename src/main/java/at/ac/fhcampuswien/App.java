package at.ac.fhcampuswien;

import com.sun.tools.javac.util.Convert;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");


    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
/*
        char inter1 ='Z';
        int inter2 =0xface;
        int inter3 = 012;

   80L, 44e-1f, 5.5f, 8.88e1 und 99.9

   */
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

        int sum = num1+num2;
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner myObj = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int num1 = myObj.nextInt();
        System.out.print("y: ");
        int num2 = myObj.nextInt();

        System.out.println("After Swap:");

        System.out.println("x: "+ num2);
        System.out.println("y: "+ num1);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();

            if (n1 < n2){
                System.out.println("n2 > n1");
            }
            else if (n1 > n2) {
                System.out.println("n1 > n2");
            }
            else if (n1 == n2) {
                System.out.println("n1 == n2");
            }
        }



    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here

        Scanner input= new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int rev = input.nextInt();

        for(int i = 0 ; i>3; i++)
        {
            System.out.println(rev);
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}