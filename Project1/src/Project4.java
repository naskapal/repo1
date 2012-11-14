import java.util.*;
public class Project4 {

	public static void main (String[] args){
		double i = 1, totalAmount = 0, weight = 0;
		char dest = 'a';
		int numOfIParcels = 0, numOfDParcels = 0, rejectedParcels = 0;
		method myclass = new method();
		
		method.introductionMessage();
		while (i != 0)
		{
			Scanner sc1 = new Scanner(System.in);
			myclass.getParcelWeight();
			weight = sc1.nextDouble();
			i = weight;
			myclass.validParcelDestination(dest, weight);
		
		Scanner sc2 = new Scanner(System.in);
		myclass.getParcelDestination();
		dest = sc2.next().charAt(0);
		myclass.validParcelDestination(dest, weight);
		if (dest == 'D' || dest == 'd')
		{
			myclass.computeDomesticCost(weight);
			numOfDParcels++;
			if (weight <= 0)
			{
				numOfDParcels--;
			}
		}
		else if (dest == 'I' || dest == 'i')
		{
			myclass.computeInternationalCost(weight);
			numOfIParcels++;
			if (weight <= 0)
			{
				numOfIParcels--;
			}
		}
		}
		myclass.displayFinalOutput(numOfIParcels, numOfDParcels, rejectedParcels, totalAmount);
	}
}