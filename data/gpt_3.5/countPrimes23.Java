public class CountPrimeNumbers {

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n)); // Output: 4
    }
}

public class PrimeNumbers {

    public static int countPrimes(int n) {
      if (n <= 2) {
        return 0;
      }
  
      boolean[] isPrime = new boolean[n];
      for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
          for (int j = i * i; j < n; j += i) {
            isPrime[j] = false;
          }
        }
      }
  
      int count = 0;
      for (int i = 2; i < n; i++) {
        if (isPrime[i]) {
          count++;
        }
      }
  
      return count;
    }
  
    public static void main(String[] args) {
      int n = 20;
      System.out.println("Number of prime numbers less than " + n + ": " + countPrimes(n));
    }
}

import java.util.Arrays;

public class PrimeNumberCount {
	public static int countPrimes(int n) {
    	boolean[] isPrime = new boolean[n];
    	Arrays.fill(isPrime, true);

    	for (int i = 2; i * i < n; i++) {
        	if (isPrime[i]) {
            	for (int j = i * i; j < n; j += i) {
                	isPrime[j] = false;
            	}
        	}
    	}

    	int count = 0;
    	for (int i = 2; i < n; i++) {
        	if (isPrime[i]) {
            	count++;
        	}
    	}

    	return count;
	}

	public static void main(String[] args) {
    	int n = 30;
    	int count = countPrimes(n);
    	System.out.println("Number of primes less than " + n + " = " + count);
	}
}

public class PrimeNumbers {
  public static int countPrimeNumbers(int n) {
      if (n <= 1) {
          return 0;
      }
      
      boolean[] isPrime = new boolean[n];
      for (int i = 2; i < n; i++) {
          isPrime[i] = true;
      }
      
      for (int i = 2; i * i < n; i++) {
          if (isPrime[i]) {
              for (int j = i * i; j < n; j += i) {
                  isPrime[j] = false;
              }
          }
      }
      
      int count = 0;
      for (int i = 2; i < n; i++) {
          if (isPrime[i]) {
              count++;
          }
      }
      
      return count;
  }
}

import java.util.Arrays;

public class PrimeNumbers {

    public static int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }
  
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Number of prime numbers less than " + n + ": " + countPrimes(n));
    }
}

