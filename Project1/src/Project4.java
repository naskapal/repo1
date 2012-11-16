public class Project4 {

	public static void main (String[] args){
		double i = 1, totalAmount = 0, weight, cost = 0;
		char dest;
		int numOfIParcels = 0, numOfDParcels = 0, rejectedParcels = 0;
		boolean check;
		method.introductionMessage();
		while (i != 0)
		{
			weight = method.getParcelWeight();
			i = weight;
			if (i != 0)
			{
		dest = method.getParcelDestination();
		check = method.validParcelDestination(dest, weight);
		if (check == true)
		{
			if (dest == 'D' || dest == 'd')
			{
				cost = method.computeDomesticCost(weight);
				numOfDParcels++;
			}
			else if (dest == 'I' || dest == 'i')
			{
				cost = method.computeInternationalCost(weight);
				numOfIParcels++;
			}totalAmount = totalAmount + cost;
		}
		else if (check == false)
		{
			rejectedParcels++;
		}
		}
	}method.displayFinalOutput(numOfIParcels, numOfDParcels, rejectedParcels, totalAmount);
		
}
}