package Inheritance;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	PeakSeasonBooking ps=new PeakSeasonBooking();
	Leanseason ls=new Leanseason();
	System.out.println("\tMelCoW to Ladak Hotel");
	System.out.println("Enter the number of persons: ");
	ps.setPersons(Integer.parseInt(br.readLine()));
	System.out.println("Enter the number of days");
	ps.setTotal_Days(Integer.parseInt(br.readLine()));
	System.out.println("Enter the room type");
	ps.setRoom_Type(br.readLine());
	System.out.println("Enter the tariff for single person");
	ps.setTariff(Double.parseDouble(br.readLine()));
	System.out.println("Enter the month");
	ps.setMonth(Integer.parseInt(br.readLine()));
	if(ps.getMonth()==4 || ps.getMonth()==5 || ps.getMonth()==6 || ps.getMonth()==9 || ps.getMonth()==11 || ps.getMonth()==12) {
		System.out.println("Enter the peakCharge");
		ps.setPeakCharges(Integer.parseInt(br.readLine()));
		System.out.println(ps.roomBooking(ps.getPersons(), ps.getTotal_Days(), ps.getTariff(),ps.getRoom_Type(),ps.getMonth(), ps.getPeakCharges()));
	}
	else {
		System.out.println("Enter the discount");
		ls.setDiscount(Integer.parseInt(br.readLine()));
		System.out.println(ls.roomBooking(ps.getPersons(), ps.getTotal_Days(), ps.getTariff(),ps.getRoom_Type(),ps.getMonth(),ls.getDiscount()));
	}
	System.out.println("Thankyou for Booking");
	}
}
