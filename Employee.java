
public class Employee {
	private int hoursWorked;
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void addHours(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHours() {
		return hoursWorked;
	}
	public void resetHours() {
		hoursWorked = 0;
	}
	public double calculatePay() {
		return 0;
	}
}
