import java.util.Scanner;
import java.util.Arrays;

public class Solution9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Sim[] sim = new Sim[5];

        for(int i=0;i<5;i++) {
            int simId = sc.nextInt();sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();sc.nextLine();
            String circle = sc.nextLine();
            sim[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[] result = transferCustomerCircle(sim, circle1, circle2);

        for(int i=0;i<result.length;i++)
			System.out.println(result[i].getSimId()+" "+result[i].getCustomerName()+" "+result[i].getCircle() + " " + result[i].getRatePerSecond());
    }

    public static Sim[] transferCustomerCircle(Sim[] sim, String circle1, String circle2) {
        Sim[] result = new Sim[0];

        for(int i=0;i<5;i++) {
            if(sim[i].getCircle().equalsIgnoreCase(circle1)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = sim[i];
                result[result.length-1].setCircle(circle2);
            }
        }
        for(int i=0;i<result.length-1;i++) {
            for(int j=0;j<result.length-i-1;j++) {
                if(result[j].getRatePerSecond() < result[j+1].getRatePerSecond()) {
                    Sim t = result[j];
                    result[j] = result[j+1];
                    result[j+1] = t;
                }
            }
        }
        return result;
    }
}
class Sim {
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalane() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle(){
        return circle;
    }

    public void setCircle(String circle){
        this.circle = circle;
    }
}