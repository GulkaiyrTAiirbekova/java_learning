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
