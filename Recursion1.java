// public class Recursion {
    
//     public static int fact(int n){
//         if( n==0 ){
//             return 1;
//         }

//         return n * fact(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         int result = fact(n);
//         System.out.println(result);
//     }

// }

// public class Recursion {
    
//     public static int fact(int n){
//         if( n == 0 ){
//             return 0;
//         }
//         // System.out.println(n);
//         return n + fact(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int num = fact(n);
//         System.out.println(num);
//     }


// }

// public class Recursion {
    
//     public static void fibo(int a ,int b , int n){
//         if( n == 0 ){
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         fibo(b , c , n-1);
//     }

//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         int n = 7;
//         System.out.println(a);
//         System.out.println(b);
//         fibo(a , b , n-2);
//         // System.out.println(num);
//     }

// }

// public class Recursion {
    
//     public static int xpn(int x, int n){
//         if( n == 0 ){
//             return 1;
//         }
//         if(x == 1 ){
//             return 0;
//         }
//         int xpownm1 =  xpn(x, n-1);
//         int xpown = x * xpownm1;
//         return xpown;
//     }

//     public static void main(String[] args) {
//         int x = 2;
//         int n = 5;
//         int ans = xpn(x , n);
//         System.out.println(ans);
//     }


// }


public class Recursion1 {
    
    public static int xpn(int x, int n){
        if( n == 0 ){
            return 1;
        }
        if(x == 1 ){
            return 0;
        }
        
        if(n%2 ==  0){
            return xpn(x, n/2) * xpn(x , n/2);
        }
        else{
            return xpn(x , n/2) * xpn(x, n/2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = xpn(x , n);
        System.out.println(ans);
    }


}
