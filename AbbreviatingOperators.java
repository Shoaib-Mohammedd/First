public class AbbreviatingOperators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println( result );
        int previousResult = result ;
        System.out.println( " previousResult = " + previousResult);
        result = result - 1;
        System.out.println( " 3 - 1 = " + result);
        result = result * 10 ;
        System.out.println( " 2 * 10 = " + result);
        result = result / 5;
        System.out.println( " 20 / 5 = " + result);
        result = result % 3 ;
        System.out.println( " 4 % 3 = " + result );
        result++;
        System.out.println( " 1 + 1 = " + result);
        result--;
        System.out.println( " 2 - 1 = " + result);
        result = result + 2 ;
        System.out.println( " 1 + 2 = " + result);
        result *= 10 ;
        System.out.println( " 3 * 10 = " + result);
        result /= 2 ;
        System.out.println( " 3 / 10 = " + result);
        result -= 7 ;
        System.out.println( " 20 - 18 = " + result );
        result-= 2 ;
        System.out.println( " 8 - 2 = " + result );

        boolean isAlien = true;
        if (isAlien == !false ) System.out.println( " is an Alien! " );
    }
}