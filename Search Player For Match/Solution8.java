import java.util.Scanner;
import java.util.Arrays;

public class Solution8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Player[] player = new Player[4];

        for(int i=0;i<player.length;i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String country = sc.nextLine();
            String side = sc.nextLine();
            double price = sc.nextDouble();
            player[i] = new Player(id,country,side,price);
        }
        String side = sc.next();
        sc.close();

        Integer[] playerId = searchPlayerForMatch(player,side);
        for(int i=0;i<playerId.length;i++) {
            System.out.println(playerId[i]);
        }
    }
    public static Integer[] searchPlayerForMatch(Player[] player, String side) {
        Integer[] result = new Integer[0]; 
        for(int i=0;i<player.length;i++){
            if(player[i].getSide().equals(side)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = player[i].getId();
            }
        }
        return result;
    }
}

class Player {
    int id;
    String country;
    String side;
    double price;

    public Player(int id, String country, String side, double price){
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
    public String getSide(){
        return side;
    }
    public int getId(){
        return id;
    }
}