package Abstract;

public class Bike extends Vehicle {

    Bike(String name){
        super(name);
    }
    @Override
    void start(){
        System.out.println("bike is starting..");
    }
    @Override
    void stop(){
        System.out.println("bike stopped..");
    }
    public static void main(String[] args) {
        Bike bike=new Bike("ktm");
        bike.start();
        bike.stop();
        System.out.println("Bike name is:"+bike.name);
    }
}
