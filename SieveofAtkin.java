package practice;

public class SieveofAtkin {

	static int SieveOfAtkin(int limit) 
    { 
        // 2 and 3 are known to be prime 
        if (limit > 2) 
            System.out.print(2 + " "); 
  
        if (limit > 3) 
            System.out.print(3 + " "); 
  
        // Initialise the sieve array with 
        // false values 
        boolean sieve[] = new boolean[limit]; 
  
        for (int i = 0; i < limit; i++) 
            sieve[i] = false;
        for (int x = 1; x * x < limit; x++) { 
            for (int y = 1; y * y < limit; y++) { 
  
                // Main part of Sieve of Atkin 
                int n = (4 * x * x) + (y * y); 
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) 
  
                    sieve[n] ^= true; 
  
                n = (3 * x * x) + (y * y); 
                if (n <= limit && n % 12 == 7) 
                    sieve[n] ^= true; 
  
                n = (3 * x * x) - (y * y); 
                if (x > y && n <= limit && n % 12 == 11) 
                    sieve[n] ^= true; 
            } 
        } 
  
        // Mark all multiples of squares as 
        // non-prime 
        for (int r = 5; r * r < limit; r++) { 
            if (sieve[r]) { 
                for (int i = r * r; i < limit; 
                     i += r * r) 
                    sieve[i] = false; 
            } 
        } 
  
        // Print primes using sieve[] 
        for (int a = 5; a < limit; a++) 
            if (sieve[a]) 
                System.out.print(a + " "); 
        return 0; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int limit = 20; 
        long startTime = System.nanoTime();
        SieveOfAtkin(limit);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        
    } 

}
