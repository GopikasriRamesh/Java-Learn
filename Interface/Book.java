package Interface;

public class Book implements Printable{
    @Override
    public void print(){
        System.out.println("Book is printing!!");
    }
}
