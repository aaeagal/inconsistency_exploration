public class Main{
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if (ugly[i] == primes[j] * ugly[idx[j]]) {
                    idx[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] index = new int[primes.length];
    int[] factor = new int[primes.length];
    System.arraycopy(primes, 0, factor, 0, primes.length);

    int nextUglyNumber = 1;
    ugly[0] = nextUglyNumber;

    for (int i = 1; i < n; ++i) {
        nextUglyNumber = Arrays.stream(factor).min().getAsInt();

        for (int j = 0; j < factor.length; ++j) {
            if (factor[j] == nextUglyNumber) {
                factor[j] = primes[j] * ugly[++index[j]];
            }
        }

        ugly[i] = nextUglyNumber;
    }

    return ugly[n - 1];
}


public int nthSuperUglyNumber(int n, int[] primes) {
	int[] superUgly = new int[n];
	superUgly[0] = 1;

	int[] indices = new int[primes.length];
	int[] values = new int[primes.length];
	for (int i = 0; i < primes.length; i++) {
    	values[i] = primes[i];
	}

	for (int i = 1; i < n; i++) {
    	int min = findMin(values);
    	superUgly[i] = min;

    	for (int j = 0; j < primes.length; j++) {
        	if (values[j] == min) {
            	indices[j]++;
            	values[j] = primes[j] * superUgly[indices[j]];
        	}
    	}
	}

	return superUgly[n - 1];
}

private int findMin(int[] values) {
	int min = Integer.MAX_VALUE;
	for (int value : values) {
    	min = Math.min(min, value);
	}
	return min;
}

// 
public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] idx = new int[primes.length];

    ugly[0] = 1;

    for (int i = 1; i < n; i++) {
        ugly[i] = Integer.MAX_VALUE;
        for (int j = 0; j < primes.length; j++) {
            ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
        }
        for (int j = 0; j < primes.length; j++) {
            if (ugly[i] == primes[j] * ugly[idx[j]]) {
                idx[j]++;
            }
        }
    }

    return ugly[n - 1];
}

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] index = new int[primes.length];
    
    ugly[0] = 1; // 1 is always a super ugly number
    
    for(int i = 1; i < n; i++){
        //find next
        ugly[i] = Integer.MAX_VALUE;
        for(int j = 0; j < primes.length; j++){
            ugly[i] = Math.min(ugly[i], primes[j] * ugly[index[j]]);
        }
        
        //slip duplicate
        for(int j = 0; j < primes.length; j++){
            if(primes[j] * ugly[index[j]] == ugly[i]){
                index[j] ++;
            }
        }
    }
    
    return ugly[n - 1];
}
