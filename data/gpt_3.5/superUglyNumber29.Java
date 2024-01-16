import java.util.PriorityQueue;

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] factors = new int[primes.length];
        ugly[0] = 1;

        PriorityQueue<Num> pq = new PriorityQueue<>();
        for (int i = 0; i < primes.length; i++) {
            pq.add(new Num(primes[i], 1, primes[i]));
        }

        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().val;
            while (pq.peek().val == ugly[i]) {
                Num nxt = pq.poll();
                factors[nxt.idx]++;
                pq.add(new Num(ugly[factors[nxt.idx]] * primes[nxt.idx], nxt.idx, primes[nxt.idx]));
            }
        }
        return ugly[n - 1];
    }

    class Num implements Comparable<Num> {
        int val;
        int idx;
        int prime;

        public Num(int val, int idx, int prime) {
            this.val = val;
            this.idx = idx;
            this.prime = prime;
        }

        @Override
        public int compareTo(Num o) {
            return this.val - o.val;
        }
    }
}



public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] pointer = new int[primes.length];
        ugly[0] = 1;

        PriorityQueue<NumWithPrime> pq = new PriorityQueue<>();
        for (int i = 0; i < primes.length; i++) {
            pq.add(new NumWithPrime(primes[i], i));
        }

        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek().num;
            while (pq.peek().num == ugly[i]) {
                NumWithPrime np = pq.poll();
                pointer[np.prime]++;
                pq.add(new NumWithPrime(primes[np.prime] * ugly[pointer[np.prime]], np.prime));
            }
        }

        return ugly[n - 1];
    }

    class NumWithPrime implements Comparable<NumWithPrime> {
        int num;
        int prime;

        NumWithPrime(int num, int prime) {
            this.num = num;
            this.prime = prime;
        }

        @Override
        public int compareTo(NumWithPrime o) {
            return this.num - o.num;
        }
    }
}

import java.util.*;

public class SuperUglyNumber {
	public static int nthSuperUglyNumber(int n, int[] primes) {
    	int[] ugly = new int[n];
    	int[] ptr = new int[primes.length];
    	ugly[0] = 1;
    	for (int i = 1; i < n; i++) {
        	ugly[i] = Integer.MAX_VALUE;
        	for (int j = 0; j < primes.length; j++) {
            	ugly[i] = Math.min(ugly[i], primes[j] * ugly[ptr[j]]);
        	}
        	for (int j = 0; j < primes.length; j++) {
            	if (ugly[i] == primes[j] * ugly[ptr[j]]) {
                	ptr[j]++;
            	}
        	}
    	}
    	return ugly[n - 1];
	}

	public static void main(String[] args) {
    	int n = 12;
    	int[] primes = {2, 7, 13, 19};
    	System.out.println(nthSuperUglyNumber(n, primes));
	}
}

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        nums[0] = 1;
        int[] indexes = new int[primes.length];
        
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, primes[j] * nums[indexes[j]]);
            }
            
            nums[i] = min;
            
            for (int j = 0; j < primes.length; j++) {
                if (min == primes[j] * nums[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }
        
        return nums[n - 1];
    }
    
    public static void main(String[] args) {
        SuperUglyNumber solution = new SuperUglyNumber();
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        System.out.println(solution.nthSuperUglyNumber(n, primes));
    }
}

import java.util.*;

public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] pointer = new int[primes.length];
        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int nextUgly = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                nextUgly = Math.min(nextUgly, primes[j] * ugly[pointer[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ugly[pointer[j]] == nextUgly) {
                    pointer[j]++;
                }
            }

            ugly[i] = nextUgly;
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] primes = {2, 7, 13, 19};

        int result = nthSuperUglyNumber(n, primes);

        System.out.println("The " + n + "th super ugly number is: " + result);
    }
}
