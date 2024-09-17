public class Main {
    public static void main(String[] args) {
        int limit = 50;
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(limit);

        sieve.printPrimes();

        System.out.println("Is 47 prime? " + sieve.isPrime(47));
        System.out.println("Is 48 prime? " + sieve.isPrime(48));
    }
}