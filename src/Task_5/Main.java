package Task_5;
import java.math.BigInteger;
public class Main {
    /* Name: Humayra Kabir Nisa
    ID: 2012020298
    Sec: F
    Email: cse_2012020298@lus.ac.bd
    Date: 13/10/2021
     */
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        int x = obj.divisorSum(5);
        BigInteger y = obj.findFactorial(6);

        System.out.println("divisorSum "+x);
        System.out.println("Find Factorial "+y);
    }
}
