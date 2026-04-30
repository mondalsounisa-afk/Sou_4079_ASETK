class OuterClass
{
    int x = 10;   

    class InnerClass
    {
        void display()
        {
            System.out.println("Value of x is: " + x);
        }
    }

    public static void main(String args[])
    {
        OuterClass obj = new OuterClass();                 
        OuterClass.InnerClass inner = obj.new InnerClass(); 

        inner.display();   
    }
}