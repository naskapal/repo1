package project2;
import java.util.*;
public class Main {
static Scanner sc1 = new Scanner(System.in);
static Scanner sc2 = new Scanner(System.in);
static boolean check;
static double weight;
static char destination;
	public static void main (String [] args) {
System.out.print("Input the parcel weight : ");
weight = sc1.nextDouble();
parcel.setWeight(weight);
System.out.print("\nInput the destination : ");
destination = sc2.next().charAt(0);
parcel.setDestination(destination);
parcel.validator(weight, destination);
parcel parcel1 = new parcel(weight, destination);
parcel.getCost();
check = parcel.validateParcelWeight(parcel1.getParcelWeight(), parcel1.getDestination());
if (check == true)
{
	if (weight < 0)
	{
		System.out.print("");
	}
	else
	{
System.out.println(parcel1.toString());
	}
}
else
{
	System.out.print(" ");
}
}
}