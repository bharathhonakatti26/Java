
public class Patterns_Questions{
    public static void main(String[] args){

        //solid rectangle pattern
        int n = 4;
        int m = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    

        //hollow rectangle pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //half pyramid
        for(int i = 0 ; i <= n ; i++){
            for(int j = 1 ; j <= i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //invert half pyramid left
        for(int i = n ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //invert half pyramid right
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        
        //half primid with numbers
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        
        //inverted half primid with numbers
        for(int i = 5 ; i >= 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Floyds triangle 
        int number = 1;
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();

        //0-1 triangle
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                int add = i+j;
                if(add % 2 == 0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println();

        //Butterfly Pattern
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }

            for (int j = 1 ; j <= 5-i ; j++) {
                System.out.print("  ");
            }

            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 5; i >= 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }

            for (int j = 1 ; j <= 5-i ; j++) {
                System.out.print("  ");
            }

            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        
        //Solid Rhombus
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5-i ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<= 5 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        //Number pyramid
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j<= 5-i ; j++){
                System.out.print(" ");
            }
            for(int j = 5-i ; j <= 5-1 ; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        
    }
}