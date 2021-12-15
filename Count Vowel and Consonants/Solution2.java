import java.util.Scanner;

public class Solution2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        line  = line.toLowerCase();
        int vowelCnt=0, consoantCnt = 0;

        for(int i=0;i<line.length();i++){
            if(line.charAt(i)>='a' && line.charAt(i)<='z'){
                if(line.charAt(i)=='a' || line.charAt(i)=='e' ||line.charAt(i)=='i' ||line.charAt(i)=='o' || line.charAt(i)=='u')
                    vowelCnt += 1;
                else consoantCnt += 1;
            }
        }
        System.out.println("Number of Vowels: "+vowelCnt);
        System.out.println("Number of Consonants: "+consoantCnt);
    }
}