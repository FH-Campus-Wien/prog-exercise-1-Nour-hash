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


        char inter1 ='Z';
        int inter2 =0xface;
        int inter3 = 012;
        long lon1 = 80L;
        float fl= 44e-1f;
        float fl1 = 5.5f;
        double db = 8.88e1;
        double db1= 99.9;

        int number = inter1;
        int number1 = (int)db;
        int number2 = (int)db1;
        int number3 = (int)fl;
        int number4 = (int)fl1;
        int number5 = Math.toIntExact(lon1);
        int sum = number+inter2+inter3+number5+number3+number4+number1+number2;
        System.out.println(sum);

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

        if (rev < 0 || rev >= 100000){
            System.out.println( "Invalid Revenue");
        }
        else if (0 <= rev && rev< 20000) {
            System.out.println( "Poor Sales Revenue");
        }
        else if (20000 <= rev && rev< 50000) {
            System.out.println( "Average Sales Revenue");
        }
        else if (50000 <= rev && rev< 80000) {
            System.out.println( "Good Sales Revenue");
        }
        else if (80000 <= rev && rev< 100000) {
            System.out.println( "Excellent Sales Revenue" );
        }


    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int pro = input1.nextInt();

        switch (pro) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;

        }
    }
    //todo Task 9
    public void leapyear() {
        // input your solution here

        System.out.print("Year: ");
        Scanner input2 = new Scanner(System.in);
        int year = input2.nextInt();

        if (year % 4 == 0 && year % 400 == 0) {

            System.out.println("Leapyear");

        }
        else if (year % 100 == 0) {

            System.out.println("Not a Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }


    }
    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int rever=0;
        Scanner input1= new Scanner(System.in);
        int number = input1.nextInt();
        System.out.print("Number: ");
        for( ;number != 0; number=number/10)
        {
            int uebrig = number % 10;
            rever = rever * 10 + uebrig;
        }
        System.out.println(rever);
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