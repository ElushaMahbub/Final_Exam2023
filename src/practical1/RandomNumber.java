package practical1;

    import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;
	
	
	public class RandomNumber {
		
	    public static void main(String[] args) {
	        int[] randomNumbers = new int[500];
	        Random random = new Random();

	        // Generate 500 random numbers
	        for (int i = 0; i < 500; i++) {
	            randomNumbers[i] = random.nextInt(1000);
	            System.out.println(randomNumbers[i]);
	        }

	        // Sort the array
	        Arrays.sort(randomNumbers);

	        // Ask user for the value of N
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of N to find the Nth smallest number: ");
	        int n = scanner.nextInt();

	        // Check if N is within a valid range
	        if (n < 1 || n > 500) {
	            System.out.println("N should be between 1 and 500.");
	        } else {
	            int nthSmallest = randomNumbers[n - 1];
	            System.out.println("The " + n + "th smallest number is: " + nthSmallest);
	        }
	    }
	

}
