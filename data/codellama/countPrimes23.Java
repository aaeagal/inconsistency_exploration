public int countPrimes(int n) {
  int count = 0;
  for (int i = 2; i < n; i++) {
      boolean isPrime = true;
      for (int j = 2; j * j <= i; j++) {
          if (i % j == 0) {
              isPrime = false;
              break;
          }
      }
      if (isPrime) {
          count++;
      }
  }
  return count;
}
//
public static int countPrimes(int n) {
  int count = 0;
  for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
          count++;
      }
  }
  return count;
}

private static boolean isPrime(int n) {
  if (n <= 1) {
      return false;
  }
  for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
          return false;
      }
  }
  return true;
}
//
public int countPrimes(int n) {
	int count = 0;
	for (int i = 2; i < n; i++) {
    	boolean isPrime = true;
    	for (int j = 2; j * j <= i; j++) {
        	if (i % j == 0) {
            	isPrime = false;
            	break;
        	}
    	}
    	if (isPrime) {
        	count++;
    	}
	}
	return count;
}


public int countPrimes(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
        boolean isPrime = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            count++;
        }
    }
    return count;
}

public int countPrimes(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
    boolean isPrime = true;
    for (int j = 2; j * j <= i; j++) {
    if (i % j == 0) {
    isPrime = false;
    break;
    }
    }
    if (isPrime) {
    count++;
    }
    }
    return count;
    }