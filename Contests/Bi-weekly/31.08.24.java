You are given three positive integers num1, num2, and num3.

The key of num1, num2, and num3 is defined as a four-digit number such that:

Initially, if any number has less than four digits, it is padded with leading zeros.
The ith digit (1 <= i <= 4) of the key is generated by taking the smallest digit among the ith digits of num1, num2, and num3.
Return the key of the three numbers without leading zeros (if any).

class Solution {
    public int generateKey(int num1, int num2, int num3) {
       StringBuilder key = new StringBuilder();
       String str1 = String.format("%04d",num1);
       String str2 = String.format("%04d",num2);
       String str3 = String.format("%04d",num3);

       for(int i=0; i<4;i++){
        int dig1 = str1.charAt(i)-'0';
        int dig2 = str2.charAt(i)-'0';
        int dig3 = str3.charAt(i)-'0';
        
        int mindigit = Math.min(dig1,Math.min(dig2,dig3));
        key.append(mindigit);
                 
       }
       return Integer.parseInt(key.toString());

       }
    }