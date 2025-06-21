import java.util.Scanner;

public class Bank{
    String name;
    int accnum;
    double bal;

    public Bank(String name,int accnum,double bal){
        this.name=name;
        this.accnum=accnum;
        this.bal=bal;
    }

    public void Balance(){
        System.out.println("Name:"+name);
        System.out.println("Account number:"+accnum);
        System.out.println("Balance:"+bal);
    }
    public void Deposit(double amt){
        if(amt>0){
            bal+=amt;
            System.out.println("Deposited:"+amt);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amt){
        if(amt>0 && amt<bal){
            bal-=amt;
            System.out.println("Withdrawn:"+amt);
        }
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter accno:");
        int accno=sc.nextInt();
        System.out.println("enter balance:");
        double bal=sc.nextInt();
        Bank obj=new Bank(name,accno,bal);
        obj.Balance();
        System.out.println("Amount to deposit:");
        double deptamt=sc.nextInt();
        obj.Deposit(deptamt);
        System.out.println("Amout to withdraw:");
        double withamt=sc.nextInt();
        obj.withdraw(withamt);
        obj.Balance();
        sc.close();
    }
    
}