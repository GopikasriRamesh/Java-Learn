import java.util.Scanner;
public class Methods {
    //add
    public static int add(int a,int b){
        return a+b;
    }
    //factorial
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        } else{
            return n* fact(n-1);
        }
    }
    //prime
    public static int prime(int num){
     if(num<1){
        return 0;
     }else{
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
        }
     }
        // greet
        public static String greet(String name){
            return "Hii "+name+ "!";
        }

        //cube
        public static int cube(int n){
            return (n*n*n);
        }

        public static void main(String[] args) {
           add(2,7);
           fact(7);
           prime(3);
           greet("gopi");
           cube(5);

              Scanner sc = new Scanner(System.in);

              // Input two numbers
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum: " + add(a, b));
                
                // Input a number for factorial
                System.out.println("Enter a number for factorial:");    
                int n = sc.nextInt();
                System.out.println("Factorial: " + fact(n));
                // Input a number to check if prime
                System.out.println("Enter a number to check if prime:");
                int num = sc.nextInt();
                if (prime(num) == 1) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
                // Input a name for greeting
                System.out.println("Enter your name for greeting:");
                String name = sc.next();
                System.out.println(greet(name));
                // Input a number to calculate cube
                System.out.println("Enter a number to calculate its cube:");
                int cubeNum = sc.nextInt();
                System.out.println("Cube of " + cubeNum + " is: " + cube(cubeNum));
                sc.close();

        }
    }

