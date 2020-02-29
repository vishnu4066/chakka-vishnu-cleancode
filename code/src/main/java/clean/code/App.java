package clean.code;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Select an option that you want to do : ");
    	System.out.println("1.Calculating Interests"+"\n"+"2.Estimating Construction Cost");
    	Scanner input = new Scanner(System.in);
    	int option = input.nextInt();
    	if(option == 1) {
            Interest interestObject = new Interest();
            System.out.print("Enter principle : ");
            float principle = input.nextFloat();
            System.out.print("Enter rate of interest : ");
            int rate = input.nextInt();
            System.out.print("Enter time in years : ");
            int timeInYears = input.nextInt();
            System.out.println("Simple Interest : " + interestObject.simpleInterest(principle,timeInYears,rate));
            System.out.printf("Compound Interest : %.2f",interestObject.compoundInterest(principle,timeInYears,rate));
    	}
    	else if(option == 2) {
    		System.out.println("Select a type of material  standard : "+"\n"+"1.standard materials"+"\n"+"2.above standard materials"+"\n"+"3.high standard material"+"\n"+"4.high standard material and fully\r\n" + 
    				"automated home");
    		int type = input.nextInt();
    		System.out.println("Enter Area : ");
    		int area = input.nextInt();
    		Estimation estimationObject = new Estimation(type,area);
    		System.out.println("Your estimated cost is "+estimationObject.costEstimation());
    	}
    	else {
    		System.out.println("Invalid option");
    	}
    	input.close();
    }
}