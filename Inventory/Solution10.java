import java.util.Scanner;
import java.util.Arrays;

public class Solution10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Inventory[] inventory = new Inventory[4]; 

        for(int i=0;i<inventory.length;i++) {
            inventory[i] = new Inventory(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        int limit = sc.nextInt();

        Inventory[] result = replenish(inventory, limit);

        for(int i=0;i<result.length;i++){
            if(result[i].getThreshold() >= 75) {
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            }
            else if(result[i].getThreshold() <= 74 && result[i].getThreshold() >= 50) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            }
            else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }
    }
    public static Inventory[] replenish(Inventory[] inventory, int limit) {
        Inventory[] result = new Inventory[0];

        for(int i=0;i<inventory.length;i++) {
            if(inventory[i].getThreshold() <= limit) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = inventory[i];
            }
        }
        return result;
    }
}

class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public int getThreshold() {
        return threshold;
    }
}