

public class Car {
    String name;
    String color;
    int price;
    int year;
   //parametrized
    public Car(String name,String color,int price,int year){
        this.name=name;
        this.color=color;
        this.price=price;
        this.year=year;
    }
    //default
    public Car(){
        this.name="unknown";
        this.color="unknown";
        this.price=0;
        this.year=0;
    }
    public void display(){
        System.out.println("car name:"+name);
        System.out.println("car color:"+color);
        System.out.println("car price:"+price);
        System.out.println("make yr:" +year);
    }

    public static void main(String[] args) {
        Car defcar=new Car();
        System.out.println("Default car:");
        defcar.display();

        Car paracar=new Car("thar","black",50000,2024);
        System.out.println("value inserted");
        paracar.display();
    }
}
