

public class Studentdemo {
    String name;
    int rollno;

    public Studentdemo(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollno);
    }
    public static void main(String[] args) {
           Studentdemo obj1=new Studentdemo("Sri",101);
           Studentdemo obj2=new Studentdemo("gopi",102);
           obj1.display();
           obj2.display();
} }
 
