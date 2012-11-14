public class method {
	public static int numOfDParcels = 0, numOfIParcels = 0, rejectedParcels = 0;
	public static double weight = 0, totalAmount = 0, grams = 0;
public static void introductionMessage () {
	System.out.println("Welcome");
	System.out.println("With this program, you can calculate the total cost of posting numbers of parcels");
}
public static double getParcelWeight () {
	double weight = 0;
	System.out.print("Enter the parcel weight in kg :");
	return weight;
}
public static char getParcelDestination () {
	char dest = 'a';
	System.out.print("Enter destination : <D>omestic or <I>nternational?");
	return dest;
}
public static boolean validParcelDestination (char dest, double weight) {
	if (dest != 'D' && dest != 'd' && dest != 'I' && dest != 'i')
	{
		System.out.println("Please enter 'D', 'd', 'I', or 'i' only");
	}
	if (dest == 'I' || dest == 'i' && weight > 20)
	{
		System.out.println("Sorry, you can't send parcel weighing more than 20.00 kg oversea");
	}
	else if (dest == 'D' || dest == 'd' && weight > 30)
	{
		 System.out.println("Sorry, you can't send parcel weighing more than 30.00 kg within Malaysia");
	}
	else if (weight < 0)
	{
		System.out.println("You must enter non-negative number");
		System.out.println("Enter the parcel weight in kg ");
	}return false;
}
public static double computeDomesticCost (double weight) {
	if (weight > 0 && weight <1)
	{totalAmount = 5.50;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + totalAmount);
	}
	else if (weight >=1 && weight<5) 
   	{
   		totalAmount = weight * 6.50;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + totalAmount);
   	}
   	else if (weight >=5) 
   	{
   		totalAmount = weight * 8.00;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + totalAmount);
   	}
   	else if (weight == 0) 
   	{
   		totalAmount = totalAmount * 0;
   
   	}
	return totalAmount;
}
public static double computeInternationalCost (double weight) {
	 grams = weight * 1000;
	 if (grams <=250)
	 {totalAmount = 41.20;
		 System.out.print("For a parcel weight of " + weight);
       	 System.out.println("kg, the cost is RM" + totalAmount);
	 }
	 else if (grams > 250 && weight <= 20)
	 {
		 totalAmount =(Math.ceil((grams - 250)/250)*5.20) + 41.20;
		 System.out.print("For a parcel weight of " + weight);
       	 System.out.println("kg, the cost is RM" + totalAmount);
	 }
	 else if (grams == 0)
	 {numOfIParcels--;
		 totalAmount = 0;
	 }
	 totalAmount = totalAmount*1;
	 return totalAmount;
 }
public static void displayFinalOutput (int numOfIParcels, int numOfDParcels, int rejectedParcels, double totalAmount) {
System.out.println("Number of rejected parcels is " + rejectedParcels);
System.out.println("Number of Domestic parcels is " + numOfDParcels);
System.out.println("Number of International parcels is " + numOfIParcels);
System.out.println("Number of total parcels is" + (numOfDParcels+numOfIParcels));
System.out.println("With total amount of " + totalAmount);
}
}