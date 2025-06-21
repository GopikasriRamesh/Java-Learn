import java.util.Scanner;

public class Numberclasifier{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number too check:");
        int num=sc.nextInt();
        if(num > 0){
            System.out.println("the Number is positive!!");
        }else if(num<0){
            System.out.println("the number isnnegative!!");
        }
        else{
            System.out.println("it's zero!!");
        }
    }
}