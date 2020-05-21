import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.Stream;


class Test {
    public static void main(String[] args) throws IOException {
       FindBigNum(3);
    }

     static long FindBigNum(long n) {
         int num = 1;
         StringBuffer out = new StringBuffer();
         while (num <= n) {
             out.append(Integer.toBinaryString(num));
             num ++;
         }
         BigInteger output = new BigInteger(out.toString(), 2);
         return output.mod(new BigInteger("1000000007")).longValue();
     }
}