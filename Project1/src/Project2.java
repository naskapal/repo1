import java.util.Scanner;
public class Project2 {
	private static Scanner sc1; //used to prevent resource leak
	private static Scanner sc2; //used to prevent resource leak

	public static void main(String[] args){
 double i = 1; // stands for initiator, this variable is used as a starter for loop
 int cd = 0; //counter for domestic parcels
 int ci = 0; //counter for international parcels
 int ct = 0; //counter for total, both for international and domestic parcels
 double cost = 0; //cost of the parcel
 double tcost = 0; //total cost of the parcel
 double grams = 0; //variable that converted from kilograms, to grams, are stored in here
 {
 while (i>0) //while the "i" is more than zero
 {	sc1 = new Scanner(System.in); //make a new scanner named "sc1"
	 System.out.print("Enter the parcel weight in kg :	");
	 double weight = sc1.nextDouble(); //create a variable named "weight" that captured from "sc1"
	 i = weight; //"i" value is changed to be same with "weight", this is used to prevent unlimited loops
	 if (ct == 0 && weight == 0) //if "counter total" is equals zero, and "weight" is equals zero
		{
			System.out.println("No parcels to send today!"); //print this line
		}
	 else if (weight == 0) //else, if ONLY "weight" is equals zero
	 {
		 
	 System.out.println("Number of domestic parcels is " + cd);
	 System.out.println("Number of international parcels is " + ci);
	 System.out.println("Total number of parcels is " + ct);
	 System.out.println("With total amount of  RM" + tcost);
	 //print these lines
	 }
	 else if (weight !=0) //else, if "weight" is not equals 0
	 {
	 sc2 = new Scanner(System.in); // create new scanner named "sc2"
		 System.out.print("<D>omestic or <I>nternational? "); //print this line
		 char dest = sc2.next().charAt(0); //create variable named "dest" that captured from first letter of "sc2"
		 if (dest == 'D' || dest == 'd') //if the destination is 'D' or 'd' (alternatively, this can be changed using equalsIgnoreCase)
		 { cd = cd + 1; //counter for domestic, is added by one
		 if (weight >0 && weight <1) //if "weight" is more than zero, and less than 1
		 	{ 	cost = 5.50; //cost is always 5.50
		 		System.out.print("For a parcel weight of " + weight);
	       	 	System.out.println("kg, the cost is RM" + cost);//and print these lines
		 	}
		 	else if (weight >=1 && weight <5) //if "weight" is more than one and less than 5
		 	{
		 		cost = weight * 6.50; //"cost" is "weight" multiplied by 6.50
	       		System.out.print("For a parcel weight of " + weight);
	       	 	System.out.println("kg, the cost is RM" + cost); //and print these lines
		 	}
		 	else if (weight >=5) //if "weight" is more than or exactly five
		 	{
		 		cost = weight * 8.00; //"cost" is "weight" multiplied by 8
	       		System.out.print("For a parcel weight of " + weight);
	       	 	System.out.println("kg, the cost is RM" + cost); //print these lines
		 	}
		 	else if (weight == 0)  //if "weight" is equals zero
		 	{
		 		cd = cd - 1; //counter of "domestic" is substract by one
		 		cost = cost * 0; //"cost" is multiplied by 0 (which is 0)
		 	}
			 
		 }else if (dest == 'I' || dest == 'i') //if input in "dest" is equals 'I' or 'i'
		 {	   ci = ci + 1; //counter for "international" is added 1
		 grams = weight * 1000; //because of the price in international shipping is in grams, I convert the "weight", which was in kilogram, into "grams"
			 if (grams <=250) //if "grams" is less than or equals 250
			 {
				 cost = 41.20; //"cost" is 41.20
				 System.out.print("For a parcel weight of " + weight); 
		       	 System.out.println("kg, the cost is RM" + cost); //print these lines
			 }
			 else if (grams > 250) //else, if "grams" is more than 250 
			 {
				 cost =(Math.ceil((grams - 250)/250)*5.20) + 41.20; // "cost" is grams subtracted by 250, divided by 50, and then rounded up, then multiplied by 5.20, and added by 41.20
				 System.out.print("For a parcel weight of " + weight);
		       	 System.out.println("kg, the cost is RM" + cost); //and print these lines
			 }
			 else if (grams == 0) //else, if "grams" is equals 0
			 {
				 ci = ci - 1; // counter for "international" is subtracted by 1
				 cost = 0; //and the cost is 0
			 }
		 }
		 ct = cd + ci; //counter for "total" is obtained by adding counter for "domestic" and counter for "international"
		 tcost = cost;
		}
 }
 }
 }
}
	
