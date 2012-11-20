package project2;

public class Main {
	public static void main (String [] args) {
		boolean check;
parcel parcel1 = new parcel(2, 'd');
parcel1.setWeight(-1);
parcel1.setDestination('d');
parcel1.getCost();
check = parcel1.validateParcelWeight(parcel1.getParcelWeight(), parcel1.getDestination());
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