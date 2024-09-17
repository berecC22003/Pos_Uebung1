import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSteve {

    private int limit;
    private boolean[] sieve;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
        this.sieve = new boolean[limit + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        if (p < 0 || p > limit) {
            throw new IllegalArgumentException("Number is out of bounds");
        }
        return sieve[p];
    

    @Override
    public void printPrimes() {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (sieve[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
