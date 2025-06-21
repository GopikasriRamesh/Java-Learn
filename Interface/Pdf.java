package Interface;

public class Pdf implements Printable{
    public void print(){
        System.out.println("Pdf is printing!!");
    }
    public static void main(String[] args) {
        Printable doc1=new Book();
        Printable doc2=new Pdf();
        doc1.print();
        doc2.print();
    }
}
