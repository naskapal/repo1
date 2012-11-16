	import java.util.Scanner;
public class Project3 {

		private static Scanner sc1;
		private static Scanner sc2;

		public static void main(String[] args){
	 double i = 1;
	 int cd = 0;
	 int ci = 0;
	 int ct = 0;
	 double cost = 0;
	 double tcost = 0;
	 double grams = 0;
	 double weight;
	 int rp = 0;
	 char dest;
	 {
	 while (i != 0)
	 {	sc1 = new Scanner(System.in);
		 System.out.print("Enter the parcel weight in kg :	");
		 weight = sc1.nextDouble();
		 i = weight;
		 while (weight < 0)
		 {	rp++;
			 System.out.println("You must enter non-negative number");
			 System.out.print("Enter the parcel weight in kg : ");
			 weight = sc1.nextDouble();
		 }
		 if (ct == 0 && weight == 0)
			{	System.out.println("Number of rejected parcels is " + rp);
				System.out.println("No parcels to send today!");
			}
		 else if (weight == 0)
		 {
		 System.out.println("Number of rejected parcels is " + rp);	 
		 System.out.println("Number of domestic parcels is " + cd);
		 System.out.println("Number of international parcels is " + ci);
		 System.out.println("Total number of parcels is " + ct);
		 System.out.println("With total amount of  RM" + tcost);
		 
		 }
		 else if (weight !=0)
		 {
		 sc2 = new Scanner(System.in);
			 System.out.print("Domestic or International? ");
			 dest = sc2.next().charAt(0);
			 while (dest != 'd' && dest != 'D' && dest != 'i' && dest != 'I')
			 {
				 System.out.println("Please enter 'D', 'd', 'I', or 'i' only");
				 System.out.print("Domestic or International?");
				 dest = sc2.next().charAt(0);
			 }
			 if (dest == 'D' || dest == 'd')
			 { cd = cd + 1;
			 if (weight >0 && weight <1)
			 	{ 	cost = 5.50;
			 		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.println("kg, the cost is RM" + cost);
			 	}
			 	else if (weight >=1 && weight <5)
			 	{
			 		cost = weight * 6.50;
		       		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.println("kg, the cost is RM" + cost);
			 	}
			 	else if (weight >=5 && weight <= 30)
			 	{
			 		cost = weight * 8.00;
		       		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.println("kg, the cost is RM" + cost);
			 	}
			 	else if (weight >30)
			 	{cd--;
			 	 rp++;
			 	 System.out.println("Sorry, you can't send parcel weighing more than 30.00 kg within Malaysia");
			 	}
			 	else if (weight == 0)
			 	{
			 		cd = cd - 1;
			 		ct = ct - 1;
			 		cost = cost * 0;
			 	}
				 
			 }else if (dest == 'I' || dest == 'i')
			 {	   ci = ci + 1;
			 grams = weight * 1000;
				 if (grams <=250)
				 {
					 cost = 41.20;
					 System.out.print("For a parcel weight of " + weight);
			       	 System.out.println("kg, the cost is RM" + cost);
				 }
				 else if (grams > 250 && weight <= 20)
				 {
					 cost =(Math.ceil((grams - 250)/250)*5.20) + 41.20;
					 System.out.print("For a parcel weight of " + weight);
			       	 System.out.println("kg, the cost is RM" + cost);
				 }else if (weight > 20)
				 {	ci--;
					 rp++;
					 System.out.println("Sorry, you can't send parcel weighing more than 20.00 kg oversea");
				 }
				 else if (grams == 0)
				 {
					 ci = ci - 1;
					 ct = ct - 1;
					 cost = 0;
				 }
			 }
			 ct = cd + ci;
			 tcost = tcost + cost;
			}
	 }
	 }
	 }
	}
