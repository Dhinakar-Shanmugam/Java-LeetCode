class Solution {
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        int sign = 1;

        if (dividend < 0) {
            sign = -sign;
        }
        if (divisor < 0) {
            sign = -sign;
        }

        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);

        while (dividendAbs >= divisorAbs) {
            dividendAbs -= divisorAbs;
            quotient++;
        }

        quotient = quotient * sign;

        if (quotient > Integer.MAX_VALUE - 1) {
            return Integer.MAX_VALUE - 1;
        } else if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return quotient;
        }
    }
}
