import java.util.Scanner;
public class Project3 {

		private static Scanner sc1 = new Scanner(System.in), sc2 = new Scanner(System.in);//create a new Scanner

		public static void main(String[] args){
	 double i = 1; //"i" stands for initiator, this is my own variable to initiate my while loop
	 int cd = 0; //"cd" stands for counter domestic
	 int ci = 0;//"ci" stands for counter international
	 int ct = 0;//"ct" stands for counter total
	 double cost = 0; //"cost" , as it says
	 double tcost = 0;//"tcost" stands for total cost
	 double grams = 0;//variab;le that used to store the converted kilograms
	 double weight;//"weight", as it says
	 int rp = 0;//"rp", stands for rejected parcels
	 char dest;//"dest" stands for destination
	 {
	 while (i != 0) //while "i" is not equals 0
	 { 
		 System.out.print("Enter the parcel weight in kg :	"); //print this line
		 weight = sc1.nextDouble(); //sc1 that inputed from user are stored to "weight"
		 i = weight; //"i" value changed to "weight"
		 while (weight < 0)//while "weight" less than 0
		 {	
			 System.out.println("You must enter non-negative number");
			 System.out.print("Enter the parcel weight in kg : ");//and print these lines
			 weight = sc1.nextDouble();//and then recapture the user input, then store to weight
		 }
		 if (ct == 0 && weight == 0)//if "ct" and "weight" equals 0
			{	System.out.println("Number of rejected parcels is " + rp);
				System.out.println("No parcels to send today!");//print these lines
			}
		 else if (weight == 0) //if ONLY "weight" equals 0
		 {
		 System.out.println("Number of rejected parcels is " + rp);	 
		 System.out.println("Number of domestic parcels is " + cd);
		 System.out.println("Number of international parcels is " + ci);
		 System.out.println("Total number of parcels is " + ct);
		 System.out.printf("With total amount of  RM%.2f\n" , tcost); //print these lines
		 
		 }
		 else if (weight !=0) //if "weight" not equals 0
		 {
			 System.out.print("Domestic or International? "); //print these lines
			 dest = sc2.next().charAt(0); //captured input from user are stored to "dest"
			 while (dest != 'd' && dest != 'D' && dest != 'i' && dest != 'I') //while "dest" is not equals 'I','i','D', or'd'
			 {
				 System.out.println("Please enter 'D', 'd', 'I', or 'i' only");
				 System.out.print("Domestic or International?");//print these lines
				 dest = sc2.next().charAt(0);//recapture and re store the user input to "dest"
			 }
			 if (dest == 'D' || dest == 'd') //if "dest" equals 'D' or 'd'
			 { 
				 cd = cd + 1; //"cd" is added by 1
			 if (weight >0 && weight <1) //if "weight" more than 0 and "weight less than one
			 	{ 	cost = 5.50; //"cost" is 5.50
			 		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.printf("kg, the cost is RM%.2f\n" , cost);//print these lines
			 	}
			 	else if (weight >=1 && weight <5) //else if "weight" equals or more than 1 and less than 5
			 	{
			 		cost = weight * 6.50;//"cost" is "weight" multiplied by 6.50
		       		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.printf("kg, the cost is RM%.2f\n" , cost);//and print these lines
			 	}
			 	else if (weight >=5 && weight <= 30) //if "weight" is equals or more than 5 and equals or less than 30
			 	{
			 		cost = weight * 8.00;//"cost" is "weight" multiplied by 8.00
		       		System.out.print("For a parcel weight of " + weight);
		       	 	System.out.printf("kg, the cost is RM%.2f\n" , cost);//and print these lines
			 	}
			 	else if (weight >30) //else if "weight" is more than 30
			 	{cd--; //"cd" is subtracted by 1
			 	 rp++;//"rp" is added by 1
			 	 System.out.println("Sorry, you can't send parcel weighing more than 30.00 kg within Malaysia");
			 	}//and print this line
			 	else if (weight == 0) //else if "weight" equals 0
			 	{
			 		cd = cd - 1;//"cd" is subtracted by 1
			 		ct = ct - 1;//"ct" is subtracted by 1
			 		cost = cost * 0; //"cost" is multiplied by 0
			 	}
				 
			 }else if (dest == 'I' || dest == 'i') //else, if dest equals 'I' or 'i'
			 {	   ci = ci + 1;//"ci"added by 1
			 grams = weight * 1000; //as it says
				 if (grams <=250) //if "grams" is less or equals than 250
				 {
					 cost = 41.20; //"cost" is 41.20
					 System.out.print("For a parcel weight of " + weight);
			       	 System.out.printf("kg, the cost is RM%.2f\n" , cost); //and print these lines
				 }
				 else if (grams > 250 && weight <= 20) //else if "grams" is more than 250 and "weight" is less or equals than 20
				 {
					 cost =(Math.ceil((grams - 250)/250)*5.20) + 41.20; //"cost" is obtained from grams subtracted by 250, divided by 250, and then rounded up, multiplied by 5.20, and then added by 41.20
					 System.out.print("For a parcel weight of " + weight);
			       	 System.out.printf("kg, the cost is RM%.2f\n" , cost); //and print these lines
				 }else if (weight > 20)//else if "weight" is more than 20
				 {	
					 ci--;//"ci" subtracted by 1
					 rp++;//"rp" added by 1
					 System.out.println("Sorry, you can't send parcel weighing more than 20.00 kg oversea");//print this line
				 }
				 else if (grams == 0) //else if "grams" equals 0
				 {
					 ci = ci - 1;//"ci" subtracted by 1
					 ct = ct - 1;//"ct" subtracted by 1
					 cost = 0;//"cost" is 0
				 }
			 }
			 ct = cd + ci;//"ct" is obtained from adding "cd" and "ci"
			 tcost = tcost + cost;//"tcost" is obtained from adding "tcost" and cost
			}
	 }
	 }
	 }
	}
