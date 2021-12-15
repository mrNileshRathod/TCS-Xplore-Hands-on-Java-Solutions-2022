import java.util.Scanner; 

public class Solution3 { 
    public static void main(String args[]) { 
        String s; 
        Scanner sc = new Scanner(System.in); 
        s = sc.nextLine(); 
        s = s.toLowerCase();  
        for(int i=0;i<s.length();i++) {
            if(!(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')) {
                System.out.print(s.charAt(i)); 
            }
        } 
    } 
} 