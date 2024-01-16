class Solution {
    public int reverse(int x) {
        int result = 0;
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }

        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }

            result = result * 10 + x % 10;
            x /= 10;
        }

        return isNegative ? -result : result;
    }
}
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
class Solution {
	public int reverse(int x) {
    	int reversed = 0;
    	while (x != 0) {
        	int pop = x % 10;
        	x /= 10;
       	 
        	if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        	if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
       	 
        	reversed = reversed * 10 + pop;
    	}
    	return reversed;
	}
}
public int reverse(int x) {
    long result = 0;
    while (x != 0) {
        result = result * 10 + (x % 10);
        x /= 10;
    }
    if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
        return 0;
    }
    return (int) result;
}

public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = -x;
        }
        
        long reverse = 0;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        
        if (negative) {
            reverse = -reverse;
        }
        
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reverse;
    }
}
