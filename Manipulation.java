public class Manipulation {
    public static void main(String[] args) {
        //basics left and right swift ( N << 1 , N << 1 )
        // things to learn ---> Get , Set , Clear , Update bit.

        //Get the 3rd bit (postion = 2 ) of a number n . ( n = 0101 )
        // int n = 5; // 1010
        // int pos = 2;
        // int bitmask = 1 << pos;

        // if((bitmask & n) == 0 ){
        //     System.out.println("Bit is Zero");
        // }
        // else{
        //     System.out.println("Bit is One");
        // }

        //Set the 2nd bit (postion = 1) of a number n . (n = 1010)
        // int n = 5 ; //1010
        // int pos = 1;
        // int bitmask = 1 << pos;

        // int newnumber = bitmask | n;
        // System.out.print(newnumber);

        //clear bit the 3rd bit (postion = 2 ) of a number n . (n = 1010)
        // int n = 5;
        // int pos = 2;
        // int bitmask = 1 << pos;
        // int notbitmask = ~(bitmask);

        // int newnumber = notbitmask & n;
        // System.out.println(newnumber);

        //update the 2nd bit (postion = 1) of a number n to 1 .(n = 1010)
        int n = 5;
        int pos = 1;
        int oper = 1; //if oper is 1 -> update bit to 1 , if oper is 0 -> update bit to 0 
        int bitmask = 1 << pos;

        if(oper == 1) {
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        }else{
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
    }
}
