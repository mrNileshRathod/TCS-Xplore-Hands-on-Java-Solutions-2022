## Problem Statement

Create a Class Player with below attributes:

playerId - int<br>
playerName - String<br>
iccRank - int<br>
noOfMatchesPlayed - int<br>
totalRunsScored - int<br>

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - findAverageScoreOfPlayers in Solution class.

This method will take an int parameter named target along with the other parameter as array of Player objects. 
The method will calculate the average runrate of the player based on totalRunsScored and noOfMatchesPlayed and return the same in a double array where the noOfMatchesPlayed attribute is greater than or equal to the int parameter target passed.

This method should be called from the main method and display the Grade of the players.

If the averageRunRate is greater than or equal to 80 then it should print "Grade A Player".

If the averageRunRate is between 50 to 79 then it should print "Grade B Player", else it should print "Grade C Player" .

Before calling this method(findAverageScoreOfPlayers) in the main method, use Scanner object to read values for four Player objects referring the attributes in the above sequence. then, read the value for noOfMatchesPlayed parameter. 
Next call the method findAverageScoreOfPlayers, write the logic to display the Grade(in the main method) and display the result. 

Consider below sample input and output:
## Input

    100
    Sachin
    1
    102
    13000
    101
    Shewag
    2
    110
    10000
    102
    Dhoni
    3
    80
    7500
    104
    Kholi
    4
    70
    7000
    100
   
## Output
    Grade A Player
    Grade A Player
