 class Base1
{
public Base1()    //Base class constructor //same name as class and should always be public.
 {
    System.out.println("i am a base class constructor");
 }

}

 class Derived1 extends Base1
{

public Derived1()      //derived class constructor // constructors are always public and of same name as class.
 {
     System.out.println("i am a derived class constructor");
 }

}

public class constructors_in_Inheritance{

    public static void main(String[] args)
    {
        Base1 b= new Base1();
        //It executes the base class constructor.....
        Derived1 d= new Derived1();
        //I have only created a derived class object here and that executes the derived class constructor as well as the base class constructor....

    }
}
