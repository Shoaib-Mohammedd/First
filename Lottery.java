import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 6 );
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter Guess Number  ( pick two digits ) " );
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 6 ;
        int lotteryDigit2 = lottery % 6 ;
        int guessDigit1   = guess /   6 ;
        int guessDigit2   = guess % 6 ;
        System.out.println( " The lottery Number is " + lottery );
        if ( lottery  == guess )
            System.out.println( " Exactly Matched You Win 10,000 " );
        else if( guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 )
            System.out.println( " Digits Are Matched You Win 3000! " );
        else if ( guessDigit1 == lotteryDigit1 ||guessDigit1 == lotteryDigit2||guessDigit2 ==
                lotteryDigit1||
                guessDigit2 == lotteryDigit2 )
            System.out.println( " One Digit Matched You Win 10,000 " );
        else
            System.out.println( " OOPS YOU'RE UNLUCKY Sorry no matched! " );

    }
}
