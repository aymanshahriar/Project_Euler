class ProjectEuler {
    public static long largestPrimeFactor(long n) {
        long largestPrime = 1L;
        for (long i = 2; i*i <= n; i++) {
                if ((n % i) == 0) {
                        largestPrime = i;
                }
                
        }
        return largestPrime;

    }


    public static void main(String[] args){
        long n = 600851475143L;
        System.out.println(largestPrimeFactor(n));
    }
}

