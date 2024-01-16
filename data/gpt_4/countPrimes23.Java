public class Main {
  
  public static int countPrimes(int n) {
      if(n < 3) {
          return 0;
      }

      boolean[] prime = new boolean[n];
      for(int p = 2; p <= Math.sqrt(n); ++p) {
          if(prime[p] == false) {
              for(int i = p*p; i < n; i += p) {
                  prime[i] = true;
              }
          }
      }

      int count = 0;
      for (int i=2; i< n; i++) {
          if (prime[i] == false) {
              count++;
          }
      }

      return count;
  }

  public static void main(String[] args) {
      System.out.println(countPrimes(100));
  }

}

public class Main {
  public static void main(String[] args) {
      System.out.println(countPrimesLessThanN(30));
  }

  public static int countPrimesLessThanN(int n) {
      boolean prime[] = new boolean[n+1];
      for(int i=0;i<n;i++)
          prime[i] = true;

      for(int p = 2; p*p <=n; p++)
      {
          if(prime[p] == true)
          {
              for(int i = p*2; i <= n; i += p)
                  prime[i] = false;
          }
      }

      int primeCount = 0;
      for (int i = 2; i < n; i++)
          if (prime[i])
              primeCount++;
              
      return primeCount;
  }
}

public int countPrimes(int n) {
    
	if(n <= 2)
    	return 0;
    
	boolean[] isPrime = new boolean[n];
    
	for (int i = 2; i < n; i++)
    	isPrime[i] = true;
    
	for (int i = 2; i * i < n; i++) {
   	 
    	if (!isPrime[i])
        	continue;
       	 
    	for (int j = i * i; j < n; j += i)
        	isPrime[j] = false;
       	 
	}
    
	int primeCount = 0;
    
	for (int i = 2; i < n; i++) {
   	 
    	if (isPrime[i])
        	primeCount++;
       	 
	}
    
	return primeCount;
    
}


public class Main {
  static final int MAX_N = 5000001;
  static boolean[] isPrime = new boolean[MAX_N];
  
  static void sieveOfEratosthenes() {
      for (int i = 0; i < MAX_N; i++) {
          isPrime[i] = true;
      }
      
      isPrime[0] = isPrime[1] = false;
      
      for (int i = 2; i * i < MAX_N; i++) {
          if (isPrime[i]) {
              for (int j = i * i; j < MAX_N; j += i) {
                  isPrime[j] = false;
              }
          }
      }
  }
  
  public static int countPrimes(int n) {
      sieveOfEratosthenes();
      int count = 0;
      for (int i = 2; i < n; i++) {
          if (isPrime[i]) {
              count++;
          }
      }
      return count;
  }
  
  public static void main(String[] args) {
      System.out.println(countPrimes(100));  // Outputs: 25
  }
}

import java.util.Arrays;

public class PrimeNumbersCount {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        return count;
    }
}

