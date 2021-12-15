import java.util.*; 

public class Solution5 { 
    public static void main(String args[]) { 
        String s; 
        Scanner sc = new Scanner(System.in); 
        s = sc.nextLine(); 
        for(int i=0;i<s.length();i++) { 
            if(i%2==0) 
                System.out.print(s.charAt(i)); 
        } 
    } 
}