import java.util.Scanner;
public class method {
	public static int numOfDParcels = 0, numOfIParcels = 0, rejected = 0, i = 1;
	public static double weight, totalAmount = 0, grams = 0, cost = 0;
	public static boolean check;
	static Scanner sc1 = new Scanner(System.in);
public static void introductionMessage () {
	System.out.println("Welcome");
	System.out.println("With this program, you can calculate the total cost of posting numbers of parcels");
}
public static double getParcelWeight () {
	System.out.print("Enter the parcel weight in kg : ");
	weight = sc1.nextDouble();
	while (weight < 0)
	{
		System.out.print("You must enter non-negative number");
		System.out.print("Enter the parcel weight in kg : ");
		weight = sc1.nextDouble();
	}
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
		check = true;
	}
	if (weight > 20 && dest == 'I' || dest == 'i')
	{
		check = true;
	}
	else if (weight > 30 && dest == 'D' || dest == 'd')
	{
		 check = true;
	}
	return check;
}
public static double computeDomesticCost (double weight) {
	if (weight > 0 && weight <1)
	{cost = 5.50;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + cost);
	}
	else if (weight >=1 && weight<5) 
   	{
   		cost = weight * 6.50;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + cost);
   	}
   	else if (weight >=5) 
   	{
   		cost = weight * 8.00;
   		System.out.print("For a parcel weight of " + weight);
   	 	System.out.println("kg, the cost is RM" + cost);
   	}
   	else if (weight == 0) 
   	{
   		cost = cost * 0;
   
   	}
	return cost;
}
public static double computeInternationalCost (double weight) {
	 grams = weight * 1000;
	 if (grams <=250)
	 {cost = 41.20;
		 System.out.print("For a parcel weight of " + weight);
       	 System.out.println("kg, the cost is RM" + cost);
	 }
	 else if (grams > 250 && weight <= 20)
	 {
		 cost =(Math.ceil((grams - 250)/250)*5.20) + 41.20;
		 System.out.print("For a parcel weight of " + weight);
       	 System.out.println("kg, the cost is RM" + cost);
	 }
	 else if (grams == 0)
	 {numOfIParcels--;
		 cost = 0;
	 }
	 return cost;
 }
public static void displayFinalOutput (int numOfIParcels, int numOfDParcels, int rejectedParcels, double totalAmount) {
	if (numOfDParcels == 0 && numOfIParcels == 0 && i == 0)
	{
		System.out.print("Number of rejected parcels is " + rejectedParcels);
		System.out.print("\n No parcels to send today!");
	}
	else{
System.out.println("Number of rejected parcels is " + rejectedParcels);
System.out.println("Number of Domestic parcels is " + numOfDParcels);
System.out.println("Number of International parcels is " + numOfIParcels);
System.out.println("Number of total parcels is" + (numOfDParcels+numOfIParcels));
System.out.println("With total amount of " + totalAmount);
}
}
}