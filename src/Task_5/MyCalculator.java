package Task_5;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {
    /* Name: Humayra Kabir Nisa
    ID: 2012020298
    Sec: F
    Email: cse_2012020298@lus.ac.bd
    Date: 13/10/2021
     */
    @Override
    public int divisorSum(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                count +=i;
            }
        }
        return count;
    }

    @Override
   public BigInteger  findFactorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i=1; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));

      }
        return result;
   }
}
