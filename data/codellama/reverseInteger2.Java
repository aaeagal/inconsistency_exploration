public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            result = result * 10 + digit;
        }
        return result;
    }
}
public int reverseInt(int x) {
    int result = 0;
    while (x != 0) {
        int digit = x % 10;
        x /= 10;
        result = result * 10 + digit;
    }
    if (result < -2147483648 || result > 2147483647) {
        return 0;
    }
    return result;
}
public int reverseInt(int x) {
	int result = 0;
	while (x != 0) {
    	int digit = x % 10;
    	x /= 10;
    	result = result * 10 + digit;
	}
	if (result < -231 || result > 231 - 1) {
    	return 0;
	}
	return result;
}
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

public int reverseInt(int x) {
    int result = 0;
    while (x != 0) {
    int digit = x % 10;
    x /= 10;
    result = result * 10 + digit;
    }
    if (result < -231 || result > 231 - 1) {
    return 0;
    }
    return result;
    }