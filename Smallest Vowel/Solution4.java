import java.util.*;

public class Solution4{
    public static void main(String args[]){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String vowel[] = {"a","e","i","o","u"};

        for(int i=0;i<vowel.length;i++){
            if(s.contains(vowel[i])){
                System.out.print(vowel[i]);
                break;
            }
        }
    }
}