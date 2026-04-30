abstract class Asset
{
    String description;
    String date;
    double currentValue;

    Asset(String description,String date,double currentValue)
    {
        this.description=description;
        this.date=date;
        this.currentValue=currentValue;
    }

    abstract void displayDetails();
}

class Stock extends Asset
{
    int noOfShares;
    double sharePrice;

    Stock(String description,String date,double currentValue,
          int noOfShares,double sharePrice)
    {
        super(description,date,currentValue);
        this.noOfShares=noOfShares;
        this.sharePrice=sharePrice;
    }

    void displayDetails()
    {
        System.out.println("----Stock Details----");
        System.out.println("Description: "+description);
        System.out.println("Date: "+date);
        System.out.println("Current Value: "+currentValue);
        System.out.println("No of Shares: "+noOfShares);
        System.out.println("Share Price: "+sharePrice);
    }
}

class Bond extends Asset
{
    double interestRate;

    Bond(String description,String date,double currentValue,
         double interestRate)
    {
        super(description,date,currentValue);
        this.interestRate=interestRate;
    }

    void displayDetails()
    {
        System.out.println("----Bond Details----");
        System.out.println("Description: "+description);
        System.out.println("Date: "+date);
        System.out.println("Current Value: "+currentValue);
        System.out.println("Interest Rate: "+interestRate);
    }
}

class Savings extends Asset
{
    double interestRate;

    Savings(String description,String date,double currentValue,
            double interestRate)
    {
        super(description,date,currentValue);
        this.interestRate=interestRate;
    }

    void displayDetails()
    {
        System.out.println("----Savings Details----");
        System.out.println("Description: "+description);
        System.out.println("Date: "+date);
        System.out.println("Current Value: "+currentValue);
        System.out.println("Interest Rate: "+interestRate);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Asset a;

        a=new Stock("TCS Shares","20-04-2026",50000,100,500);
        a.displayDetails();

        a=new Bond("Government Bond","21-04-2026",30000,7.5);
        a.displayDetails();

        a=new Savings("Savings Account","22-04-2026",20000,5.0);
        a.displayDetails();
    }
}