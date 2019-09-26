package Inheritance;

public class Leanseason extends Booking {
int discount;
int month;
public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}
public double roomBooking(int persons, int total_Days, double tariff, String roomType ,int month,int discount) {
	
	double value1=super.roomBooking(persons,total_Days,tariff,roomType);
	double v=value1-(value1*discount/100);
	return v;
}
}
