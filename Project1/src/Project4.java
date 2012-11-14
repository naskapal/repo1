import java.util.*;
public class Project4 {

	public static void main (String[] args){
		double i = 1, totalAmount = 0, weight = 0, cost = 0;
		char dest = 'a';
		int numOfIParcels = 0, numOfDParcels = 0, rejectedParcels = 0;
		method.introductionMessage();
		while (i != 0)
		{
			weight = method.getParcelWeight();
			i = weight;
			if (i > 0)
			{
		Scanner sc2 = new Scanner(System.in);
		method.getParcelDestination();
		dest = sc2.next().charAt(0);
		method.validParcelDestination(dest, weight);
		if (dest == 'D' || dest == 'd')
		{
			cost = method.computeDomesticCost(weight);
			numOfDParcels++;
			if (weight <= 0)
			{
				numOfDParcels--;
			}
		}
		else if (dest == 'I' || dest == 'i')
		{
			cost = method.computeInternationalCost(weight);
			numOfIParcels++;
			if (weight <= 0)
			{
				numOfIParcels--;
			}
		}totalAmount = totalAmount + cost;
		}
		method.displayFinalOutput(numOfIParcels, numOfDParcels, rejectedParcels, totalAmount);
	}
}
}