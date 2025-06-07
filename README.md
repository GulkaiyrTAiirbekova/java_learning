my hh# java_learning
I am learning Java , so next 360 days  you can see what I will be learning .
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

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello  World";
        System.out.println(greeting);

    }
}
public class Main {
    public static void main (String [] args){
        int items = 25;
        float costPerItem = 6.7f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items:" + items );
        System.out.println("Cost per item:" + costPerItem);
        System.out.println(" Total Cost:" +totalCost + currency);
    }
}
public class Main {
    public static void main (String [] args){
        int myInt =6;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}
public class Main {
    public static void  main (String [] args){
        double myDouble = 4.57d;
        int myInt = (int) myDouble;

        System.out.print(myDouble);
        System.out.println(myInt);

    }
}
public class Main {
    public static void main (String []args) {
        int maxScore = 600;
        int userScore = 123;
        float percentage = (float)userScore/maxScore * 100.0f;

        System.out.println( "User's percentage is "+ percentage);

    }
}
public class Main {
    public static void main (String []args){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);


    }
}
public class Main {
    public static void main (String [] args){
        int maxScore = 500;
        int userScore =423;
        float percentage = (float)userScore/maxScore * 100.0f;
        System.out.println("User percentage is " + percentage);
    }
}
public class Main {
    public static void main (String [] args){
        int x = 134 + 45;
        System.out.println(x);
    }
}
public class Main {
    public static void main (String []args){
        int sum1 = 123 + 34;
        int sum2 = 985+2;
        int sum3 = 876+21;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
public class Main {
    public static void main (String [] args){
        int x =16;
        System.out.println(x);
    }
}
public class Main {
    public static void main (String [] args){
        int x= 16;
        x+=4;
        System.out.println(x);

    }
}
public class Main {
    public static void main (String []args){
        int sum1 =120 + 23;
        int sum2 = sum1 +124;
        int sum3 = sum2 +sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
public class Main {
    public static void main (String [] args) {
        int x=12;
        int y=5;
        System.out.println(x + y );
        System.out.println (x - y);
        System.out.println (x * y);
        System.out.println (x/y);
        System.out.println (x % y);
        System.out.println ( ++x );
        System.out.println( --x);
    }
}
public class Main {
    public static void main(String[] args) {
        int x = 13;
        x += 5;
        System.out.println(x);
        System.out.println(x -3);
        System.out.println(x * 3);
        System.out.println(x / 3);
        System.out.println(x % 3);
        System.out.println (x & 3);
        System.out.println (x |= 3);
        System.out.println (x ^ 3);
        System.out.println (x >> 3);
        System.out.println (x << 3);
           }
}
public class Main {
    public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x == y);
    }
}
public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 4;
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >=y);
        System.out.println(x <= y);
    }
}
public class Main {
    public static void main (String [] args){
        int x = 8;
        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 || x < 3);
        System.out.println(!(x > 5 && x < 10));
    }
}
public class Main {
    public static void main (String [] args){
        String greeting = " Hello World!";
        System.out.println(greeting);
    }
}
public class Main{
    public static void main (String [] args){
        String txt = "ABCDEFHHIJKLMOPQRSTUWZ";
        System.out.println("The length of the txt string is: " + txt.length()); //22
    }
}
public class Main {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
}
public class Main {
    public static void main (String [] args) {
        String txt = " This text needs to bo be printed";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

    }
}
public class Main {
    public static void main(String [] args){
        String txt = "please locate where 'locate' occurs";
        System.out.println(txt.indexOf("locate")); //7
    }
}
public class Main {
    public static void main (String [] args){
        String txt = " I am learning finding character 'indexOf' ";
        System.out.println(txt.indexOf("indexOf")); //34
    }
}
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        double multiplied = Calculator.multiply(3.14, 2, 5, 6.5, 7, 8);
        double added = Calculator.add(3.14, 2, 5, 6.5, 7, 8);
        System.out.println("Multiplying answer is " + multiplied);
        System.out.println("Adding answer is " + added);
    }
    public class Calculator {
        static double add(double... numbers) {
            return DoubleStream.of(numbers)
                    .sum();
        }

        static double multiply(double... numbers) {
            return DoubleStream.of(numbers)
                    .reduce(1, (a, b) -> a * b);
        }
    }
}
public class Main{
    public static void main(String[] args){
        int x = 23;
        int y = 45;
        String z = "23";
        String w = "45";
        System.out.println(x+y);
        System.out.println(z+w);
    }
}
public class Strings {
    public static void main(String[] args) {
        String txt = "We are from beautiful \"Kadamzhay\" city in Kyrgyzstan.";
        String txt1 = " It\\'s alright.";
        System.out.println(txt);
        System.out.println(txt1);
    }
}
public class Strings {
    public static void main(String[] args) {
        String txt = "The character \\ is called backslash.";
        System.out.println(txt);
    }
}
public class Strings {
    public static void main(String[] args) {
        String txt = "Separate\nline!";

        System.out.println(txt);
    }
}
public class Strings {
    public static void main(String[] args) {
        String txt = "Return\rString!";
        System.out.println(txt);
    }
}

public class Strings {
    public static void main(String[] args) {
        String txt = "Conn\bect String!";
        System.out.println(txt);
    }
}
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        
        

    
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
import java.util.Scanner;

public class Solutions{
    public static  void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sc.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class Calculator {
    public static void main (String [] args){
        System.out.println(Math.max(5, 60));
        System.out.println(Math.min(5, 60));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.abs(-4.7));
    }
        }

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Math.random());
    }
}
public class Main {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;    
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
  }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 0 ){
    System.out.println("Negative");
    } else {
        if (n>0){
            System.out.println("Positive");
        } else{
            System.out.println(" zero");
        }
    }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a->A
        //b->B
        //c->C
        //invalid Character
        String s = sc.next();
        if (s.equals("a")) {
            System.out.println("A");
        } else {
            if (s.equals("b")) {
                System.out.println("B");
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
public class Calculator {
            public static void main(String [] args ){
                int randomNum = (int)(Math.random() *100);
                System.out.println("Random number: " + randomNum);
}
            }
public class Calculator {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
            }
        }
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a->A
        //b->B
        //c->C
        //invalid Character
        String s = sc.next();
        if (s.equals("a")) {
            System.out.println("A");
        } else {
            if (s.equals("b")) {
                System.out.println("B");
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
public class Main {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }    
  }
}
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }  
  }
}
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }  
  }
}
public class Main {
  static void myMethod() {
    System.out.println("I started this method!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
public class Parameters {
    static void myMethod (String fname){
        System.out.println(fname  + " Adress");
    }
    public static void main (String [] args){
        myMethod("Tom");
        myMethod("John");
        myMethod("Jane");
    }
}
public class Parameters {
    static void myMethod( String fname, int age) {
        System.out.println(fname + " is "  + "age");
    }
    public static void main (String [] args){
        myMethod( "Tom",20);
        myMethod ("Sam",30);
        myMethod ("Jack",40);
    }
}
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }  
  }
}
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }  
  }
}
public class Main {
  public static void main(String[] args) {
    // Outer loop.
    for (int i = 1; i <= 2; i++) {
      System.out.println("Outer: " + i); // Executes 2 times
      
      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
    } 
  }
}
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}
package org.examples;

public class Main {
    public static void main(String[] args) {
        Payable firstPerson = new CreditCardPayment();
        Payable secondPerson = new CashPayment();
        firstPerson.pay (50);
        secondPerson.pay (60);


    }
}
import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  } 
}
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("Kyrgyzstan", "Bishkek");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Uzbekistan", "Tashkent");
    capitalCities.put("Kazakhstan", "Astana");
    System.out.println(capitalCities); 
  }
}
import java.util.LinkedList;

public class Main { 
  public static void main(String[] args) { 
    LinkedList<String> regions = new LinkedList<String>();
    regions.add("Bishkek");
    regions.add("Osh");
    regions.add("Batken");
    regions.add("Chui");
    System.out.println(regions);
  } 
}
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> regions = new LinkedList<String>();
    regions.add("Bishkek");
    regions.add("Osh");
    regions.add("Chui");
    
    // Use addFirst() to add the item to the beginning
    regions.addFirst("Batken");
    System.out.println(regions);
  }
}
import java.util.ArrayList;
import java.util.Collections;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> books = new ArrayList<String>();
    books.add("The Innovator's Dilemma");
    books.add("The Soul of a New Machine");
    books.add("The New New Thing: A Silicon Valley Story");
    books.add("Clean Code: A Handbook of Agile Software Craftsmanship");
    
    Collections.sort(books);

    for (String i : books) {
      System.out.println(i);
    }
  } 
}
import java.util.ArrayList;

public class NameListExample {
    public  static void main (String [] args){
        ArrayList <String> names = new ArrayList<String>();
        names.add("Aikol");
        names.add("Khankeldi");
        names.add("Sofi");
        names.add("Tom");

        // Print the entire list
        System.out.println("Names" + names);

        // Access individual elements
        System.out.println("The first name:" + names.get(0));
        // Modify an element
        names.set(1,"Alexsandr");
        System.out.println("After changes:" + names);
        // Remove an element
        names.remove("Sofi");
        System.out.println("After removal:" + names);

        System.out.println("All names:" + names);
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("Total names:" + names.size());
    }
}
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);
  }
}
public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
  }
}
public class Main {
  public static void main(String[] args) {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    // Get the length of the array
    int length = ages.length;

    // Loop through the elements of the array
    for (int age : ages) {
      sum += age;
    }
    
    // Calculate the average by dividing the sum by the length
    avg = sum / length;

    // Print the average
    System.out.println("The average age is: " + avg);
  }
}

public class Main {
  public static void main(String[] args) {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    
    // Create a 'lowest age' variable and assign the first array element of ages to it
    int lowestAge = ages[0];

    // Loop through the elements of the ages array to find the lowest age
    for (int age : ages) {
      // Check if the current age is smaller than the current 'lowest age'
      if (lowestAge > age) {
        // If the smaller age is found, update 'lowest age' with that element
        lowestAge = age;
      }
    }

    // Output the value of the lowest age
    System.out.println("The lowest age in the array is: " + lowestAge);
  }
}
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
  }
}
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }  
  }
}

#Exceptions
public class Main {
  public static void main(String[] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]);
  }
}
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main { 
  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
