import java.util.Scanner;

public class NumeriPrimi {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        //inserite qui il vostro codice
        boolean primo = true;
        int n = 2;
        while(n < Math.sqrt(number)){
            //System.out.println(n);
            if(number % n == 0){
                primo = false;
                //System.out.println(primo);
                //System.out.println(number % n);
                break;
            }
            n ++;
        }

        return primo;
    }
}