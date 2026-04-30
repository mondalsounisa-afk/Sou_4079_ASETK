abstract class Accounts {
    double balance;
    int accountNumber;
    String name,address;

    Accounts(double b,int a,String n,String ad){
        balance=b;
        accountNumber=a;
        name=n;
        address=ad;
    }

    abstract void withdrawal(double amt);
    abstract void deposit(double amt);

    void display(){
        System.out.println("Balance = "+balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double b,int a,String n,String ad,double r){
        super(b,a,n,ad);
        rateOfInterest=r;
    }

    void withdrawal(double amt){
        balance-=amt;
    }

    void deposit(double amt){
        balance+=amt;
    }

    void calculateAmount(){
        double interest=balance*rateOfInterest/100;
        System.out.println("Amount with Interest = "+(balance+interest));
    }
}

public class Main{
    public static void main(String args[]){
        SavingsAccount s=new SavingsAccount(5000,101,"Sneha","Kolkata",5);

        s.deposit(1000);
        s.withdrawal(500);
        s.display();
        s.calculateAmount();
    }
}