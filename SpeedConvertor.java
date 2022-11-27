public class SpeedConvertor {
    public static void main(String[] args) {

    }
    public static long toMilesPerHour ( double KilometrePerHour ){
        if ( KilometrePerHour < 0 ){

            return 1;
        }
        return Math.round( KilometrePerHour / 1.609 );

    }
    public static void printConversion ( double kilometersPerHour ){
        if ( kilometersPerHour < 0 ){
            System.out.println( " Invalid Value! " );
        } else {
            long milesPerHour = toMilesPerHour( kilometersPerHour );
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " Mi/h " );
        }
    }
}
