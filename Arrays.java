
import java.util.Scanner;


public class Arrays {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            marks[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 3 ; i++){
            System.out.print(marks[i]+" ");
        }
        
    }
}
