import java.util.*;

class Main {
    public static void main(String[] args) { // Fixed typo in 'agrs' to 'args'
        Scanner sc = new Scanner(System.in);

        //string input
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println(name);


        //integer input
        int a = sc.nextInt();
        System.out.println(a);

        int b = sc.nextInt();
        System.out.println(b);

        System.out.println(a+b);

    }
}