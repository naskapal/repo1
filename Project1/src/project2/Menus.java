package project2;
import java.util.*;
public class Menus {
	Scanner sc1 = new Scanner(System.in);
	parcel parcel1 = new parcel();
	parcelList newParcel = new parcelList();
	public void menu1() {
		boolean valid;
		System.out.print("\nInput the parcel weight in kg :\t");
		parcel1.setWeight(sc1.nextDouble());
		System.out.print("\nDomestic or International ?\t");
		parcel1.setDestination(sc1.next().charAt(0));
		valid = newParcel.addParcel(parcel1);
		if (valid == true)
		{
			System.out.print("\nAddition Success!");
		}
		else
		{
			System.out.print("\nAddition Failed");
		}
		}
	public void menu2() {
		newParcel.allParcels();
	}
	public void menu3() {
		newParcel.getMaxCostParcel();
		newParcel.getMinCostParcel();
	}
	public void menu4() {
		newParcel.summaryParcels();
	}
}
