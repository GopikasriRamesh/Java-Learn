import java.util.Scanner;

public class Library {
    String name;
    int price;

    public Library(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void printDetails(){
        System.out.println("Book name:"+name);
        System.out.println("Book price:"+price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name:");
        String name=sc.nextLine();
        System.out.println("Enter book price:");
        int price=sc.nextInt();
        Library book=new Library(name,price);
        book.printDetails();
        sc.close();
    }
}
