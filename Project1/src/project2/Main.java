package project2;
import java.util.*;
public class Main {
	static parcel myclass = new parcel();
static Scanner sc1 = new Scanner(System.in);
static Scanner sc2 = new Scanner(System.in);
static boolean check;
static double weight;
static char dest;
	public static void main (String [] args) {
parcel parcel1 = new parcel();
System.out.print("Input the parcel weight : ");
weight = sc1.nextDouble();
parcel1.setWeight(weight);
System.out.print("\nInput the destination : ");
dest = sc2.next().charAt(0);
parcel1.setDestination(dest);
myclass.parcel(weight, dest);
parcel1.getCost();
check = parcel.validateParcelWeight(parcel1.getParcelWeight(), parcel1.getDestination());
if (check == true)
{
System.out.println(parcel1.toString());
}
else
{
	System.out.print("");
}
}
}