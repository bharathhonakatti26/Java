
public class Strings {
    public static void main(String[] agrs){
        String firstname = "Proxy";
        String lastname = "Cool";
        String fullname = firstname +" "+ lastname;
        System.out.println(fullname);
        
        //charAt
        for(int i = 0 ; i < fullname.length() ; i++){
            System.out.println(fullname.charAt(i));
        }
        
        //string campare
        //s1 > s2 ---> +ve value
        //s1 == s2 --> 0
        //s1 < s2 ---> -ve valve

        String name1 = "proxy";
        String name2 = "Proxy";

        if(name1.compareTo(name2) == 0){
            System.out.println("strings are equal ");
        }
        else{
            System.out.println("strings are not equal ");
        }
        
        //Substring
        String email = "proxyspector@gmail.com";
        // substring(beg index , end index )
        String name = email.substring(0 , 12);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("proxy");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0, 'T' );
        
        //0th index char changed
        System.out.println(sb.charAt(0));

    }
}
