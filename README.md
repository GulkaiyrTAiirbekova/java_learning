# java_learning
I am learnign Java , so next 360 days  you can see what I will be learning .
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
} #Hello World
pritnln(" ") it adds new line
print ()
// for SINGLE line comments 
/* */ for longer comments 
#Java Variables - conteiners for storing data values. Different types
public class Main {
    public static void main (String[] args) {
        String name = "John";
        System.out.println(name);
    }
} //John
public class Main{
    public static void main(String[] args) {
    int x ,y,z:
    x - y - z - 50;
    System.out.println(x+y+x);
    }
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.print("I'm learning Java");
    }

}
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.print("I'm learning Java");
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println(3 * 9); //27
        
    }
}
//Multi-line comments start with /* and ends with */.


}
public class Main{
    public static void main (String[] args){
        String name = "Amanda";
        System.out.println(name);
    }
}
public class Main {
    public static void main (String[] args){
        int myNum = 12;
        System.out.println(myNum);
    }
}
public class Main {
    public static void main (String[] args){
        int myNum;
        myNum=12;
        System.out.println(myNum);
    }
}
public class Main {
    public static void main (String[]args){
        int myNum =12;
        myNum = 34;
        System.out.println(myNum); //34
    }
}
public class Main {
    public static void main (String[] args) {
        int myNum =6;
        float myFloatNum = 6.77f;
        char myLetter = 'A';
        boolean myBool = true;
        String myText = "Greetings";

    }
}
public class Main {
    public static void main (String [] arg) {
        int x =6;
        int y =13;
        System.out.println(x+y); //19
    }
}
public class Main {
    public static void main (String[] args) {
        int x,y,z;
        x=y=z=50;
        System.out.println(x+y+z);
    }
}  
public class Main {
    public static void main (String[] args ){
        int x=2,y=4,z=12;
        System.out.println(x+y+z);
    }
}
public class Main {
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println("Hello " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        String firstName = "Tom";
        String lastName = "Jones";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
public class Main {
    public static void main(String []args) {
        boolean isTodaySunny = true;
        boolean isTodayRainy = false;
        System.out.println(isTodaySunny);
        System.out.println(isTodayRainy);
    }
}
public class Main {
    public static void main(String [] args) {
        char Grade = 'A';
        System.out.println(Grade);
    }
}
public class Main {
    public static void main (String [] args){
        char Var1 =23,Var2= 45, Var3=89;
        System.out.println(Var1);
        System.out.println(Var2);
        System.out.println(Var3);
    }
}
public class Main{
    public static void main (String []args) {
        String greeting = "Hello, Java World!";
        System.out.println(greeting);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!");
    }
}
public class Main {
    public static void main(String[] args) {
        int number= 12;
        System.out.println(number);
    }
}
public class Main {
    public static void main(String[] args) {
        int number = 2;
        double pi = 3.14;
        char a = 'A';
        boolean b = true, c = false;
        String text = "Hello World";

        System.out.println(number);
        System.out.println(pi);
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main {
    public static void main (String [] args){
      int a = 13;
      int b = 2;
      int c = a/b;
      int d = a % b;
//      13/2=[6].1
//      13 % 2 = 6.[1]          
      System.out.println(c); //6
      System.out.println(d); //1
    }
}
public class Main {
    public static void main (String [] args) {
        double a =10, b = 5;
        double c = a/b;
        double d = 11;
        double f = 2;
        double g = d /f ;
        double g1 = d % f;
        System. out.println(c); //2.0
        System.out.println(g); //5.5
        System.out.println(g1); //1.0
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println( "Welcome "  + name); //Welcome Gulkaiyr

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();  //2
        int b = sc.nextInt(); //6
        System.out.println( a+b ); //8

    }
}
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        double d= sc.nextDouble();
        System.out.println(d);
    }
} 
public class Main {
    public static void main (String [] args) {
        boolean execute = true;
        if (execute) {
            System.out.println("Execution is true"); //Execution is true
        }

    }
}
public class Main {
    public static void main(String[] args) {
        int a= 2, b=2;
        if (a == b) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b= sc.nextInt();
        if (a ==b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n < 0) {
            System.out.println("negative");
        } else {
            if ( n > 0){
            System.out.println("positive");
        } else {
                System.out.println("zero");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      String s =sc.next();
      if (s.equals("a")) {
          System.out.println("A");
      } else {
          if (s.equals("b")) {
              System.out.println ("B");
          } else {
              if (s.equals("c")) {
                  System.out.println("C");
              } else {
                  System.out.println("Invalid character");
              }
          }
      }
    }
}
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int temperature = sc.nextInt();

        if (temperature >25) {
            System.out.println("It's a warm say. Stay hydrated!");

        }
        System.out.println("Enjoy your day!");
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main (String [] args) {
//      Scanner sc = new Scanner(System.in);
//      int dayNumber = sc.nextInt();
//
//      switch (dayNumber){
//          case 1:
//              System.out.println("Monday- Start of the work week");
//              break;
//          case 2:
//              System.out.println("Tuesday - Keep going!");
//              break;
//          case 3:
//              System.out.println("Wednesday - Midweek already.");
//              break;
//          case 4:
//              System.out.println("Tuesday-   Almost there.");
//              break;
//          case 5:
//              System.out.println("Friday- Weekend is near!");
//              break;
//          case 6:
//              System.out.println("Saturday -Time to relax!");
//              break;
//          case 7:
//              System.out.println("Sunday - Rest and recharge");
//              break;
//          default:
//              System.out.println("Invalid day number.");
//
//      }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main (String [] args) {
//        Scanner sc = new Scanner (System.in); 1:12:40
//27.03.2025 java basics and arrays
/*
//int [] array = new int[3];
//array[0]= 10;
//array [1]=20;
//array
//public class Main {
//    public static void main(String[] args) {
//        int a,b;
//        int [] array = new int [5];
//        array [0] = 10;
//        array [2] = 20;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//    }
//}
//}
*/
//A program that guesses a number between 0-100, to guess it
/*import java.util.Random;

public class Main{
    public static void main (String [] args){
        Random rand = new Random();
        int guess = rand.nextInt() % 100;

        Scanner sc =  new Scanner(System.in);
        int guess
        System.out.println(int);
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    private static final Scanner scan = new Scanner (System.in);
    public static void main (String [] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N%2 !=0) {
            System.out.println("Weird");
        }
        else if (N % 2 ==0 && N >= 2 & N <=5) {
            System.out.println("Not weird");
        }
        else if ( N %2 ==0 && N>=6 & N <=20) {
            System.out.println("Weird");
        }
        else if (N % 2 ==0 && N>=6 & <=20) {
            System.out.println("Weird");
        }
        else if (N % ==0 && N>20)
        {
            System.out.println(" Not Weird");
        }
        scanner.close();
        }
    }
}
public class Main {
    public static void main (String [] args) {
        String studentName = " Tom Galt";
        int studentID = 1234;
        int studentAge = 19;
        float studentFee = 35.45f;
        char studentGrade = 'A';

        System.out.println("Student name: " + studentName);
        System.out.println ("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println ("Student grade: " + studentGrade);

    }
}
public class Main {
    public static void main (String [] args ){
        int length = 6;
        int width = 8;
        int area;

        area =  length * width;
        System.out.println ("Length is:" +length);
        System.out.println("Width is: " + width);
        System.out.println ("Area of the rectangle is: " + area ); 
    }
}
public class Main {
    public static void main (String [] args){
        int myNum = 4;
        float myFloat = 4.99f;
        char myChar = 'G';
        boolean myBoolean = true;
        String myText = "Hello";
        System.out.println(myNum);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myText);

    }
}
public class Main {
    public static void main (String [] args){
        byte myNum = 100;
        System.out.println (myNum);
    }
}
public class Main {
    public static void main (String [] args){
        short myNum = 2000;
        System.out.println(myNum);
    }
}
public class Main {
    public static void main (String[] args){
        int myNum = 100000;
        System.out.println(myNum);
    }
}
public class Main {
    public static void main (String [] args){
        long myNum = 13000000000L;
        System.out.println(myNum);
    }
}
import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int a  = scan.nextInt();
        String myString = scan.next();
        int myInt = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(myString);
        System.out.println(myInt);

    }
}
public class Main {
    public static void main (String[] args){
        float myNum= 6.78f;
        System.out.println (myNum);
    }
}
public class Main {
    public static void main (String [] args){
       boolean isJavaFun = true;
       boolean isGrassTasty = false;
       System.out.println(isJavaFun);
       System.out.println(isGrassTasty);
    }
}
public class Main {
    public static void main (String[] args){
        char MyGrade = 'A';
        System.out.println(MyGrade);
    }
}
public class Main {
    public static void main (String[]args ){
        char myVar1= 145;
        char myVar2= 234;
        char myVar3= 324;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
}
