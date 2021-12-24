import java.util.*;

public class Solution11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[4];

        for(int i=0;i<s.length;i++) {
            int rollNO = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            boolean dayScholar = sc.nextBoolean();
            s[i] = new Student(rollNO, name, branch, score, dayScholar);
        }

        int CountOfDayscholarStudents = findCountOfDayscholarStudents(s);
        if(CountOfDayscholarStudents>0) {
            System.out.println(CountOfDayscholarStudents);
        }  
        else  { 
            System.out.println("There are no such dayscholar students");
        }

        findStudentwithSecondHighestScore(s);
    }
    public static int findCountOfDayscholarStudents(Student[] s) {
        int cnt=0;
        for(int i=0;i<s.length;i++) {
            if(s[i].getScore()>=80 && s[i].getDayScholar()){
                cnt+=1;
            }
        }
        return cnt;
    }
    public static void findStudentwithSecondHighestScore(Student[] s) {
        Student[] result = new Student[0];
        double f1=-1,f2=-1;
        int f=-1;
        for(int i=0;i<s.length;i++){
            if(!s[i].getDayScholar()){
                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1] = s[i]; 
            }
        }
        if(result.length==1){
            System.out.print(result[result.length-1].getRollNo()+"#"+result[result.length-1].getName()+"#"+result[result.length-1].getScore());
        }
        else if(result.length>=2){
            for(int i=0;i<result.length;i++){
                for(int j=i+1;j<result.length;j++){
                    if(result[i].getScore()>result[j].getScore()) {
                        Student t = result[i];
                        result[i] = result[j];
                        result[j] = t;
                    }
                }
            }
            System.out.print(result[result.length-2].getRollNo()+"#"+result[result.length-2].getName()+"#"+result[result.length-2].getScore());
        }
        else {
            System.out.print("There are no student from non day scholar");
        }
    }
}
class Student {
    int rollNO;
    String name;
    String branch;
    double score;
    boolean dayScholar;

    public Student(int rollNO, String name, String branch, double score, boolean dayScholar) {
        this.rollNO = rollNO;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public int getRollNo() {
        return rollNO;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }

    public boolean getDayScholar(){
        return dayScholar;
    }
}