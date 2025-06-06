import java.util.Scanner;

public class Arrays {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            marks[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 3 ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        int numbers[] = {1,2,3,4,5,6};
        for(int i = 0 ; i <= 5 ; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
