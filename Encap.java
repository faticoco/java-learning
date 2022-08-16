//Encapsulation : also known as data hiding 
//This concept is also often used to hide the internal representation, 
//or state of an object from the outside. This is called information hiding.

class Student
 {
    private String name;
    public void setname(String newName)
    {
        name=newName;
    }
    public String getname()
    {
        return name;
    }
 }
 public class Encap {
    public static void main(String[] args) {
        Student s= new Student();
        s.setname("suzie");
        System.out.println(s.getname());
    }
}
 