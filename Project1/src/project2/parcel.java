package project2;

public class parcel {
private double weight, cost;
private char destination;

public parcel (double a, char b) {
	if (weight <0)
	{
		System.out.println("You must enter non-negative value");
	}
	else
	{
		weight = a;
	}
	if ((destination != 'D' || destination != 'd') || (destination != 'I' || destination != 'i'))
	{
		System.out.println("You must enter 'D', 'd', 'I', or 'i' only");
	}
	else
	{
		destination = b;
	}
}
public double getParcelWeight () {
	return weight;
}
public char getDestination () {
	return destination;
}
public void setWeight (double a) {
	weight = a;
}
public void setDestination (char b) {
	destination = b;
}
public double getCost () {
	if (destination == 'D' || destination == 'd')
	{
		cost = computeDomesticCost();
	}
	else if (destination == 'I' || destination == 'i')
	{
		cost = computeInternationalCost();
	}
	return cost;
}
private double computeDomesticCost () {
	if (weight < 1)
	{
		cost = 5.50;
	}
	else if (weight < 5)
	{
		cost = weight * 6.50;
	}
	else if (weight <= 30)
	{
		cost = weight * 8.00;
	}
	return cost;
}
private double computeInternationalCost() {
	double grams;
	grams = weight * 1000;
	if (grams <= 250)
	{
		cost = 41.20;
	}
	else if (weight <= 20)
	{
		cost = (Math.ceil((grams - 250)/250)*5.20) + 41.20;
	}
	return cost;
}
public static boolean validateParcelWeight (double weight, char destination) {
	boolean check;
	if ((destination == 'I' || destination == 'i') &&  weight > 20 )
	{
		System.out.println("Sorry, you can't send parcels weighing more than 20 kg oversea");
		check = false;
	}
	else if ((destination == 'D' || destination == 'd') && weight > 30)
	{
		System.out.println("Sorry, you can't send parcels weighing more than 30 kg within Malaysia");
		check = false;
		
	}
	else
	{
	check = true;
	}
	return check;
}
public String toString () {
	String dest;
	if (destination == 'D' || destination == 'd')
	{
		dest = "a domestic ";
	}
	else
	{
		dest = "an international ";
	}
		return dest + weight + "kg parcel, with cost " + cost ;
}
}
