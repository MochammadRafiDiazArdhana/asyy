import java.text.DecimalFormat;

public class Staff extends Employee {
	private double hourly_rate;
    private static DecimalFormat df2 = new DecimalFormat("#.00");

	
	Staff() {
		super();
		hourly_rate = 0.0;
	}
	
	Staff(String l_name, String f_name, String Id, char gen, int month, int day, int year, double h_rate) {
		super(l_name, f_name, Id, gen, month, day, year); 
		this.setHourlyRate(h_rate);
	}
	
	public double getHourlyrate() {
		return hourly_rate;
	}
	
	public void setHourlyRate(double h_rate) {
		this.hourly_rate = h_rate;
	}
	 
	public double monthlyEarning() {
		return hourly_rate*160;
	} 
	
	public String toString() {
		return super.toString() + "\n" + "  " + "Tarif per jam: " + "$" + df2.format(getHourlyrate()) + "\n" + "  " + 
		"Gaji bulanan: " + "$" + df2.format(monthlyEarning());
	}

	@Override
	public int compareTo(Employee other) {
			if (getLastName().compareTo(other.getLastName()) > 0)
			{ 
				return -1;
			}
			if (getLastName().compareTo(other.getLastName()) < 0)
			{ 
				return 1;
			}
			else 
			return 0;
	}

	
	
}
