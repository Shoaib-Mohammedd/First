public class MethodChallenge {
    public static void main(String[] args) {
        // PlayerOne
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition( " Shoaib Mohammed : " , + highScorePosition);
        // PlayerTwo
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition( " Idman Abdirahman :" , + highScorePosition);
        // PlayerThree
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition ( " Shamis Mokhtar : " , + highScorePosition);
        // PlayerFour
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition(  " Nafisa Abdirahman : " , + highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(" Su'mai Mukhtar " , highScorePosition);
    }
    public static void displayHighScorePosition( String playerName, int hihScorePosition ){
        System.out.println( playerName + " Managed to get into position  " + hihScorePosition
                + " On the High Score Table! " );
    }
    public static int calculateHighScorePosition ( int PlayerScore ){
        if ( PlayerScore >= 1000 ){
            return 1;
        } else if (PlayerScore >= 500){
            return  2 ;
        } else if (PlayerScore >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}
                        //[// STOPSHIP: 5/8/2022  ]