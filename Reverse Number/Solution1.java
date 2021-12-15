import java.util.*; 
public class Solution1 { 
    public static void main(String args[]) { 
        int no,rem,rev=0; 
        Scanner sc = new Scanner(System.in); 
        no = sc.nextInt(); 
        while(no!=0) { 
            rem = no%10; 
            rev = rev*10+rem; 
            no = no / 10; 
        } 
        System.out.print("Reverse of the number is "+rev); 
    } 
}