import java.util.Arrays;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] ptr = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < primes.length; j++) {
                val[j] = ugly[ptr[j]] * primes[j];
            }
            int minVal = Arrays.stream(val).min().getAsInt();
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == minVal) {
                    ptr[j]++;
                }
            }
            ugly[i] = minVal;
        }
        return ugly[n - 1];
    }
}

public static int nthSuperUglyNumber(int n, int[] primes) {
    int[] uglyNumbers = new int[n];
    int[] uglyFactors = new int[n];
    int[] primeFactors = new int[n];
    int[] primeFactorsCount = new int[n];
    int[] primeFactorsIndex = new int[n];
    int[] primeFactorsMax = new int[n];
    int[] primeFactorsMin = new int[n];
    int[] primeFactorsSum = new int[n];
    int[] primeFactorsProduct = new int[n];
    int[] primeFactorsGcd = new int[n];
    int[] primeFactorsLcm = new int[n];
    int[] primeFactorsSieve = new int[n];
    int[] primeFactorsSieveIndex = new int[n];
    int[] primeFactorsSieveMax = new int[n];
    int[] primeFactorsSieveMin = new int[n];
    int[] primeFactorsSieveSum = new int[n];
    int[] primeFactorsSieveProduct = new int[n];
    int[] primeFactorsSieveGcd = new int[n];
    int[] primeFactorsSieveLcm = new int[n];
    int[] primeFactorsSieveSieve = new int[n];
    int[] primeFactorsSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveIndex = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveMax = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveMin = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveSum = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveProduct = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveGcd = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveLcm = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveSieve = new int[n];
    int[] primeFactorsSieveSieveSieveSieveSieveSieveSieveSieveSieveSieveIndex = new int[n];
}
public int nthSuperUglyNumber(int n, int[] primes) {
	int[] ugly = new int[n];
	ugly[0] = 1;
	int[] pointers = new int[primes.length];
	for (int i = 1; i < n; i++) {
    	int min = Integer.MAX_VALUE;
    	for (int j = 0; j < primes.length; j++) {
        	if (ugly[pointers[j]] * primes[j] < min) {
            	min = ugly[pointers[j]] * primes[j];
        	}
    	}
    	ugly[i] = min;
    	for (int j = 0; j < primes.length; j++) {
        	if (ugly[pointers[j]] * primes[j] == min) {
            	pointers[j]++;
        	}
    	}
	}
	return ugly[n - 1];
}

import java.util.Arrays;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] ptr = new int[primes.length];
        int[] val = new int[primes.length];
        Arrays.fill(val, 1);
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < primes.length; j++) {
                val[j] = ugly[ptr[j]] * primes[j];
            }
            int minVal = Arrays.stream(val).min().getAsInt();
            for (int j = 0; j < primes.length; j++) {
                if (val[j] == minVal) {
                    ptr[j]++;
                }
            }
            ugly[i] = minVal;
        }
        return ugly[n - 1];
    }
}

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    ugly
    0
     = 1;
    int[] ptr = new int[primes.length];
    for (int i = 1; i < n; i++) {
    int min = Integer.MAX_VALUE;
    for (int j = 0; j < primes.length; j++) {
    int val = primes[j] * ugly[ptr[j]];
    if (val < min) {
    min = val;
    }
    }
    ugly[i] = min;
    for (int j = 0; j < primes.length; j++) {
    if (primes[j] * ugly[ptr[j]] == min) {
    ptr[j]++;
    }
    }
    }
    return ugly[n - 1];
    }