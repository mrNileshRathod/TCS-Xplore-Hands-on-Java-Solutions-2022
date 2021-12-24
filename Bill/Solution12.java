import java.util.Scanner;
import java.util.Arrays;

public class Solution12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bill[] bill = new Bill[n];

        for(int i=0;i<n;i++) {
            int billNo = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String typeOfConnection = sc.nextLine();
            double billAmount = sc.nextDouble();
            boolean status = sc.nextBoolean();
            bill[i] = new Bill(billNo,name,typeOfConnection,billAmount,status);
        }
        boolean status = sc.nextBoolean();sc.nextLine();
        String typeOfConnection = sc.nextLine();
        sc.close();
        
        Bill[] result = findBillWithMaxBillAmountBasedOnStatus(bill,status);
        if(result == null) {
            System.out.println("There are no bill with the given status");
        }
        else {
            for(int i=0;i<result.length;i++) {
                System.out.println(result[i].getBillNo()+"#"+result[i].getName());
            }
        }
        
        int count = getCountWithTypeOfConnection(bill,typeOfConnection);
        if(count!=0) {
            System.out.print(count);
        }
        else {
            System.out.print("There are no bills with given type of connection");
        }
    }
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] bill, boolean status) {
        double max = 0.0;
        Bill[] result = new  Bill[0];
        for(int i=0;i<bill.length;i++) {
            if(bill[i].getStatus() == status && bill[i].getBillAmount()>max) {
                max = bill[i].getBillAmount();
            }
        }
        for(int i=0;i<bill.length;i++) {
            if(bill[i].getBillAmount() == max) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = bill[i];
            }
        }
        for(int i=0;i<result.length-1;i++) {
            for(int j=0;j<result.length-i-1;j++) {
                if(result[j].getBillNo() > result[j+1].getBillNo()) {
                    Bill t = result[j];
                    result[j] = result[j+1];
                    result[j+1] = t;
                }
            }
        }
        if(result.length==0) return null;
        else return result;
    }

    public static int getCountWithTypeOfConnection(Bill[] bill, String typeOfConnection) {
        int count = 0;
        for(int i=0;i<bill.length;i++) {
            if(bill[i].getTypeOfConnection().equalsIgnoreCase(typeOfConnection)) {
                count+=1;  
            }
        }
        if(count>0)
            return count;
        else return 0;
    }
}

class Bill {
    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;

    public Bill(int billNo,String name, String typeOfConnection,double billAmount,boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getBillNo(){
        return billNo;
    }
    public String getName(){
        return name;
    }
    public String getTypeOfConnection(){
        return typeOfConnection;
    }
    public double getBillAmount(){
        return billAmount;
    }
    public boolean getStatus(){
        return status;
    }
}

// 4
// 111
// Aman Mittal
// Prepaid
// 914.25
// true
// 333
// Rekha Kumar
// Prepaid
// 1425.75
// true
// 222
// Samyra Gupta
// Prepaid
// 1425.75
// true
// 444
// Mohit Saxena
// Postpaid
// 1300.50
// true
// true
// Prepaid