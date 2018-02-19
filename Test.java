/**
 * @author      Li-Wei Li <email: lily.lsps@gmail.com>
 * @version     1.3
 */

public class Test
{
    /**
    * A test class to make sure rand13() is a fair random machinism.
    * <p>
    * How to execute: In the terminal, enter: test <number>, i.g. test 10000.
    *                 In IDE, set the environment to accept command line arguments.
    * <p>
    * Idea:
    * First, this program verifies if the input is a positive number.
    * Second, the for-loop will run with the input number as upperbound.
    * Last, the program shows the probabilities of chosen of each number.
    * We will see that probability of each number is almost the same. In other words,
    * the probabilities shows that rand13() is fair and random.
    * <p>
    */

    public static void main(String args[])
    {   
        Rand obj = new Rand();
        
        int[] track = new int[13];
        int rand = 0;
        double total = 0;
        int num_iteration = 0;

        try {
            num_iteration = Integer.parseInt(args[1]);
            if(num_iteration < 0) throw new NumberFormatException("negative");
            
        } catch (NumberFormatException e) {
            System.out.println("Please specify an positive integer");
            System.exit(1);
        }
        
        
        for (int cnt = 0; cnt < num_iteration; cnt++)
        {
            rand = obj.rand13();
            track[rand-1] += 1;
        } 

        for (int i = 0; i < 13; i++) {
            System.out.println("Probability of occurence of " + (i+1) + ": " + (double)track[i]/num_iteration);
            total += (double)track[i]/num_iteration;
        } // for
        
        System.out.println("Total probability: " + total);
    }
}