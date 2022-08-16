                  /*method overriding: its an example of polymorphism
                   redifining the method of super class in sub class */
                  //The arguments lists should bve same
                  //If there are no arguments of the super class method then its overrided method in sub class should have no arguments in it as well
                  //If one method is public then its overrided func should be public as well , same goes for protected ,, private isnt possible
class A
{
    public void func1()       //it will be overrided in class B that is a child class.
    {
        System.out.println("i am in class A");    
    }
}
class B extends A
{
    @Override
    public void func1()       // overriding the parent class function i-e func1()
    {
        System.out.println("i am in class B");    
    }
}
public class method_overriding {
    public static void main(String[] args) 
    {
        A a=new A();
        a.func1();
        B b=new B();
        b.func1();
        //Here am calling two classes , one is parent and other is the child class and the result is due to override method...
    }
}
