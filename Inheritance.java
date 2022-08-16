class Base{
    public 
    int x=3;
    protected void printme()
    {
        System.out.println("i am printed");
    }
}

class derived extends Base{
    public void printed()
    {
        int y=x;
        System.out.println(y);
    }
    public void dosomething(int x)
    {

        System.out.println(x);
    }
}
public class Inheritance{

    public static void main(String[] args){
        derived d=new derived();
        d.printme();
        d.printed();
        d.dosomething(4);
        //i created an object of derived class and then called base and derived class functions by it.
        //secondly if i try to call some base class data
    }
}