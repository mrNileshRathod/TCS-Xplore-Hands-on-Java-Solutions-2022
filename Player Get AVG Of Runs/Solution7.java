import java.util.Scanner;
import java.util.Arrays;

public class Solution7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Player[] players  = new Player[4];

        for(int i=0;i<players.length;i++){
            int playerId = sc.nextInt();
            String playerName = sc.nextLine();sc.nextLine();
            int  iccRank = sc.nextInt();
            int noOfMatchesPlayed = sc.nextInt();
            int totalRunsScored = sc.nextInt();
            players[i] = new Player(playerId,playerName,iccRank,noOfMatchesPlayed,totalRunsScored);
        }

        int totalMatches = sc.nextInt();
        sc.close();

        double[] averageRun = findAverageScoreOfPlayers(players, totalMatches);
      
        for(int i=0;i<averageRun.length;i++){
            if(averageRun[i]>=80)
                System.out.println("Grade A Player");
            else if(averageRun[i]>=50 && averageRun[i]<=79)
                System.out.println("Grade B Player");
            else System.out.println("Grade C Player");
        }        

    }

    public static double[] findAverageScoreOfPlayers(Player[] players, int totalMatches){
        double averageRun[] = new double[0];

        for(int i=0;i<players.length;i++){
            if(players[i].getMatchesPlayed()>= totalMatches){
                averageRun = Arrays.copyOf(averageRun, averageRun.length+1);
                averageRun[averageRun.length-1] = (double)(players[i].getRunsScored()/players[i].getMatchesPlayed());
            }
        }
        return averageRun;
    }
}

class Player{
    int playerId;
    String playerName;
    int  iccRank;
    int noOfMatchesPlayed;
    int totalRunsScored;

    public Player(int playerId, String playerName, int iccRank, int noOfMatchesPlayed, int totalRunsScored){
        this.playerId = playerId;
        this.playerName = playerName;
        this.iccRank = iccRank;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.totalRunsScored = totalRunsScored;
    }

    public int getMatchesPlayed(){
        return noOfMatchesPlayed;
    }
    public int getRunsScored(){
        return totalRunsScored;
    }
}