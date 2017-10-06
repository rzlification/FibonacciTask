package sum.even.number.fibonacci.sequence;

/**
 *
 * @author rzlfication
 */
public class SumEvenNumberFibonacciSequence {

    public static void main(String[] args) {
	    int x = 1, y = 2, sum, total=2 , limit = 4000000;
            
	    while ((x+y) <= limit)
	    {
                sum = x+y;
	        x = y;
	        y= sum;
                if (sum%2==0){
	        total +=sum;}
	    }
	    System.out.println("Sum of Even Number in fibonacci sequence = "+total);
    }
    
}
