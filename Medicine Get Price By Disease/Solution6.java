import java.util.Scanner;
import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        Medicine[] medicine = new Medicine[4];
        String search;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < medicine.length; i++) {
            String medicineName = sc.nextLine();
            String batchNo = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            medicine[i] = new Medicine(medicineName, batchNo, disease, price);
        }

        search = sc.nextLine();
        Integer[] price = medicinePriceForGivenDisease(medicine, search);

        for(int i=0;i<price.length;i++) {
        System.out.println(price[i]);
        }
    }
    public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease) {
        Integer result[] = new Integer[0];
        for(int i=0;i<medicine.length;i++){
            if(medicine[i].getDisease().equals(disease)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = medicine[i].getPrice();
            }
            Arrays.sort(result);
        }
        return result; 
    }
}
 
 class Medicine {
    String medicineeName;
    String batchNo;
    String disease;
    int price;

    public Medicine(String medicineeName, String batchNo, String disease, int price) {
        this.medicineeName = medicineeName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }
    
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }
}