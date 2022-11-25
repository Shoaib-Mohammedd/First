import java.util.Scanner;
public class Currentime {
    public static void main(String[] args) {

        //Scanner input =new Scanner(System.in);

        long totalMS = System.currentTimeMillis() ;
        long totalseconds  =    totalMS / 1000;
        long curentseconds =    totalseconds % 60;
        long totalminutes  =    totalseconds / 60;
        long curentminutes =    totalminutes % 60;
        long totalhours    =    totalminutes / 60;
        long curenthours   =    totalhours   % 24;
        System.out.println( " You're Devices Current Time is "
                + ( curenthours + 3 ) + " : " + curentminutes + " : "
                + curentseconds );
        Scanner Input = new Scanner(System.in);
        System.out.println( "Enter Something! " );
        long  Recomendation = Input.nextInt();
        System.out.println(Recomendation);
    }
}