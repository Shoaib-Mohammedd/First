import java.util.Scanner;

public class OperatorsChallenge {
    public static void main(String[] args) {
        Scanner FDs = new Scanner(System.in);
        System.out.println( " Enter You're First Number! " );

        double FD = FDs.nextInt();
        Scanner SDs = new Scanner(System.in);
        System.out.println( " Enter You're Second Number! " );

        double SD = SDs.nextInt();
        double THD = 100.00;
        double TD = (FD + SD) * THD;
        System.out.println( " The Total Numbers Equal " + TD );
        double Reminder = TD % 40.00D;

        System.out.println( " The Reminder Equals " + Reminder );

        boolean isNoReminder = ( Reminder == 0) ? true :false;

        System.out.println( " The No Reminder Equals " + isNoReminder);
        if (!isNoReminder){

            System.out.println( " Got Some Reminder " );


        }


    }
}