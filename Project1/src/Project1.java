import java.util.Scanner;	//common java class that used to read input from keyboard
public class Project1 {
    
    private static Scanner sc1; //used to prevent resource leak

	public static void main(String[] args) {
    	double i = 1;
    	int c = 0; //c is used for counting the number of parcels inputed c stands for "counter"
    	double cost = 0;
    	double tcost = 0;
       while (i>0)
       {c++;
       {sc1 = new Scanner(System.in);
       	System.out.print("Enter parcel weight in kg :	");
       	double weight = sc1.nextDouble();
       	i = weight; //syntax used for preventing unlimited loops
       	if(weight >0 && weight <1) //if weight is more than 0(kg) and weight is less than 1(kg)
       	{
       		cost = 5.50;
       		System.out.print("For a parcel weight of " + weight);
       	 	System.out.println("kg, the cost is RM" + cost);
       	}
       	else if (weight >=1 && weight<5) //if weight is more than 1(kg)and less than 5(kg)
       	{
       		cost = weight * 6.50;
       		System.out.print("For a parcel weight of " + weight);
       	 	System.out.println("kg, the cost is RM" + cost);
       	}
       	else if (weight >=5) //if weight is more or exactly 5(kg)
       	{
       		cost = weight * 8.00;
       		System.out.print("For a parcel weight of " + weight);
       	 	System.out.println("kg, the cost is RM" + cost);
       	}
       	else if (weight == 0) //if weight inputed equals 0
       	{
       		cost = cost * 0;
       		c--; //used for preventing 0 is counted as delivered parcel
       	}
       	tcost = tcost + cost;
       }
       
      
}if (c==0) //if counter equals 0
{
	System.out.println("No parcels to send today!");
}
else
{
       System.out.println("Total number of parcels is " + c);
       System.out.println("With total amount of RM" + tcost);
}
}
}