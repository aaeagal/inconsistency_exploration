public int reverse(int x) {
    long reversed = 0;
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x = x / 10;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) reversed;
}
public int reverse(int x) {
    long rev = 0;
    while (x != 0) {
        rev = rev * 10 + x % 10;
        x = x / 10;
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) rev;
}
public class Solution {
	public int reverse(int x) {
    	long rev = 0;
    	while(x!=0){
        	rev = rev * 10 + x % 10;
        	x = x / 10;
        	if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            	return 0;
        	}
    	}
    	return (int) rev;
	}
}

public int reverse(int x) {
    long reversed = 0;
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x = x / 10;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) reversed;
}

public class Solution {
    public int reverse(int x) {
        long reversed = 0;

        while(x != 0){
            reversed = reversed*10 + x%10;
            x = x/10;

            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }

        return (int)reversed;
    }
}
