package Abstract;

abstract class Vehicle {
    String name;
    Vehicle(String name){
        this.name=name;
    }
    abstract void start();
    abstract void stop();
}
