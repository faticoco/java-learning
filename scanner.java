import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the value you enetered is " +a);
        System.out.println("Enter a string/line ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("the string you enetered is " +input);
    }
}
//This is the explanation of output and input statements ......for integer and string input