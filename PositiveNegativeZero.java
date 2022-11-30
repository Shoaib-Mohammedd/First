public class PositiveNegativeZero {
    public static void main(String[] args) {
        CheckNumber(0);
        CheckNumber(-10);
        CheckNumber(6);
        CheckNumber(-0);
        //toMilesPerHour(7);
    }
    public static void CheckNumber ( int number ){
        if ( number > 0 ){
            System.out.println( " Positive!" );

        } else  if ( number < 0 ){
            System.out.println( " Negative!" );

        } else {
            System.out.println( " Zero! \f " );
        }
    }

}