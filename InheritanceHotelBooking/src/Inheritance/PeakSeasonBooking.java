package Inheritance;

public class PeakSeasonBooking extends Booking {
	int month;
	int peakCharges;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	
	double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int peakCharges){
		double value  = peakCharges*super.roomBooking(persons, total_Days, tariff,  roomType);
		return value;
	}
	}
