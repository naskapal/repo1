import java.util.Scanner;
public class method {
	public static int numOfDParcels, numOfIParcels;
	public static double weight, totalAmount, grams;
	public static char dest;
	public static boolean check;
	static Scanner sc1 = new Scanner(System.in), sc2 = new Scanner(System.in);
	//declaring variables
public static void introductionMessage () { //displaying the introduction message
	System.out.println("Welcome");
	System.out.println("With this program, you can calculate the total cost of posting numbers of parcels");
}
public static double getParcelWeight () { //method that capturing the weight from user input
	System.out.print("\nEnter the parcel weight in kg : ");
	weight = sc1.nextDouble();
	while (weight < 0) //if "weight" less than 0
	{
		System.out.print("You must enter non-negative number");
		System.out.print("\nEnter the parcel weight in kg : ");
		weight = sc1.nextDouble();//print these lines and recapture the user input
	}
	return weight;
}
public static char getParcelDestination () { //method that capturing the destination from user input
	System.out.print("\nEnter destination : <D>omestic or <I>nternational?");
	dest = sc2.next().charAt(0);
	while (dest != 'D' && dest != 'd' && dest != 'i' && dest != 'I') //while "dest" is not equals 'D','d''I' or 'i'
	{
		System.out.print("You must enter 'd', 'D', 'i', 'I' only");
		System.out.print("\nEnter destination : <D>omestic or <I>nternational?");
		dest = sc2.next().charAt(0);//print these lines and recapture the user input
	}
	return dest;
}
public static boolean validParcelDestination (char dest, double weight) { //method that used to validate the parcel weight for specified destination
	if ((dest == 'I' || dest == 'i') &&  weight > 20 )
	{
		System.out.print("\nSorry, you can't send parcels weighing more than 20 kg oversea");
		check = false;
	}
	else if ((dest == 'D' || dest == 'd') && weight > 30)
	{
		System.out.print("\nSorry, you can't send parcels weighing more than 30 kg within Malaysia");
		check = false;
		
	}
	else
	{
	check = true;
	}
	return check;
}
public static double computeDomesticCost (double weight) { //method that used to compute the cost of domestic parcels
   	if (weight == 0) 
   	{
   		totalAmount = 0;
   		numOfDParcels--;
   	}
   	else if (weight > 0 && weight <1)
	{
   		totalAmount = 5.50;
	}
	else if (weight >=1 && weight<5) 
   	{
   		totalAmount = weight * 6.50;
   	}
   	else if (weight >=5 && weight <= 30) 
   	{
   		totalAmount = weight * 8.00;
   		
   	}
   	System.out.print("\nFor a parcel weight of " + weight);
	System.out.printf("kg, the cost is RM%.2f\n" , totalAmount);
	return totalAmount;
}
public static double computeInternationalCost (double weight) { //method that used to compute the cost of international parcels
	 grams = weight * 1000;
	 if (grams == 0 && weight > 20)
	 {
		 numOfIParcels--;
		 totalAmount = 0;
	 }
	 else if (grams <=250)
	 {
		 totalAmount = 41.20;
	 }
	 else if (grams > 250)
	 {
		 totalAmount =(Math.ceil((grams - 250)/250)*5.20) + 41.20;
		 
	 }System.out.print("\nFor a parcel weight of " + weight);
   	 System.out.printf("kg, the cost is RM%.2f\n" , totalAmount);
	 return totalAmount;
 }
public static void displayFinalOutput (int numOfIParcels, int numOfDParcels, int rejectedParcels, double totalAmount) { //method that used to print the final message
	if (numOfDParcels == 0 && numOfIParcels == 0)
	{
		if (rejectedParcels > 0)
		{
		System.out.print("Number of rejected parcels is " + rejectedParcels);
		}
		System.out.print("\n No parcels to send today!");
	}
	else{
System.out.println("Number of rejected parcels is " + rejectedParcels);
System.out.println("Number of Domestic parcels is " + numOfDParcels);
System.out.println("Number of International parcels is " + numOfIParcels);
System.out.println("Number of total parcels is " + (numOfDParcels+numOfIParcels));
System.out.printf("With total amount of RM%.2f\n" , totalAmount);
}
}
}