package Inheritance;
public class Booking{
	double total_tariff;
	private int persons;
	private int total_Days;
	private double tariff;
	private String room_Type;
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoom_Type() {
		return room_Type;
	}
	public void setRoom_Type(String room_Type) {
		this.room_Type = room_Type;
	}
	double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
		
		total_tariff= persons*total_Days*tariff;
		
		return total_tariff;
		}
}
