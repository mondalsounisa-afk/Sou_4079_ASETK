abstract class AbstractProduct{
    int product_id;
    String title;

    AbstractProduct(int id,String t){
        product_id=id;
        title=t;
    }

    abstract void display();
}

class Book extends AbstractProduct{
    String author;

    Book(int id,String t,String a){
        super(id,t);
        author=a;
    }

    void display(){
        System.out.println(product_id+" "+title+" "+author);
    }
}

class CD extends AbstractProduct{
    String artist;

    CD(int id,String t,String ar){
        super(id,t);
        artist=ar;
    }

    void display(){
        System.out.println(product_id+" "+title+" "+artist);
    }
}

public class Main{
    public static void main(String args[]){
        AbstractProduct p;

        p=new Book(1,"Travel Guide","ABC");
        p.display();

        p=new CD(2,"Music CD","XYZ");
        p.display();
    }
}