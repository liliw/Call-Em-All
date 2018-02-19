/**
 * @author      Li-Wei Li <email: lily.lsps@gmail.com>
 * @version     1
 */

public class Rand
{
	/**
	* Generating one number which is between 1 to 13.
	* <p>
	* I already have a function, rand11(), which can randomly generate a number between 1 and 11.
	* My design is intuitive: running rand11() 13 times, and then moduling the result by 13. Thus,
	* the function gives a number between 0 to 12. I shift the result with 1 unit, strictly speaking,
	* the function will return the number from 1 to 13.
	* <p>
	* Because rand11() is a blackbox, I still need to check it if it works properly, so the customed
	* Rand11Exception() is used.
	* <p>
	* @return a random number between 1 and 13.
	*/
    int rand13()
    {
        
        int sum = 0;
        int num = 0;
		for (int cnt = 0; cnt <13; cnt++) {
			try {
    			num = (int)(Math.random() * 11 + 1); // change rand11() to (int)(Math.random() * 11 + 1) when testing
		        if (num > 11 || num < 1)
		            throw new Rand11Exception();
			} catch (Rand11Exception e) {
			    System.out.println(e);
			    System.exit(1);
			}
		}
        return (sum%13)+1;
    }
}
