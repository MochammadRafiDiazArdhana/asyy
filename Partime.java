
public class Partime extends Staff {
	private double hours_worked;
	
	Partime() {
		super();
		hours_worked = 0.0;
	}
	
	Partime(String l_name, String f_name, String Id, char gen, int month, int day, int year, double h_rate, double h_work) {
		super(l_name, f_name, Id, gen, month, day, year, h_rate);
		this.setHoursWorked(h_work);
	}
	
	public double getHoursWorked() {
		return hours_worked;
	}
	
	public void setHoursWorked(double h_worked) {
		this.hours_worked = h_worked;
	}
	
	public double monthlyEarning() {
		return super.getHourlyrate()*hours_worked*4;
	}
	
	public String toString() {
		return super.toString() + "\n"  + "  " + "Jam kerja per minggu: " + hours_worked; 
	}

}
