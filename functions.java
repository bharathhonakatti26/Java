
import java.util.*;


public class functions{

    public static void printname(String name){
        System.out.print(name); 
    }

    public static int add(int a , int b){
        int Sum = a+b;
        return Sum;
    }

    public static void main(String[] agrs){
        Scanner sc =  new Scanner(System.in);
        // String name = sc.nextLine();
        // printname(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = add(a,b);
        System.out.print(sum);

    }
}