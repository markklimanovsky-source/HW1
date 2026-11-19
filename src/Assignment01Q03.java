public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        int numOdd = 0;

        for (int i = 1; i <= x; i++) {
            long fib = Math.round(Math.pow(phi, i) / sqrt5);

            System.out.print(fib);

            if (fib % 2 != 0) 
                numOdd++;

            if (i < x) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
