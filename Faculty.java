import java.text.DecimalFormat;

public class Faculty extends Employee implements Cloneable {
	enum Level {
		ASSISTANT_PROFESSOR,
		ASSOCIATE_PROFESSOR,
		FULL; 
	}
	private Level prof;
	private Education edu;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
	
    
    public void setEdu(Education e){
    	edu = e;
    }
    
	Faculty() {
		super();
		edu = new Education();
	}
	
	Faculty(String l_name, String f_name, String Id, char gen, int month, int day, int year, String d, String m, int r, Level pro) {
		super(l_name, f_name, Id, gen, month, day, year);
		this.setProfessor(pro); 
		edu = new Education(d,m,r);
		
	}
	
	public Level getProfessor() {
		return prof;
	}
	
	public void setProfessor(Level pro) {
		this.prof = pro;
	}
	
	public double monthlyEarning() {
		if(prof == Level.ASSISTANT_PROFESSOR) {
			return FACULTY_MONTHLY_SALARY;
		}
		else if(prof == Level.ASSOCIATE_PROFESSOR) {
			return FACULTY_MONTHLY_SALARY*1.5;
		}
		else {
			return FACULTY_MONTHLY_SALARY*2.0;
		}
		
	}		
	
	public String toString() {
		return super.toString() + "\n" +  "  " + "Tingkat: " + prof + "\n" + "  " + "Gelar: " + edu.getDegree() +
		"\n" + "  " + "Besar: " + edu.getMajor() + "\n" + "  " + "Riset: " + edu.getResearch() + "\n" + "  " + 
		"Gaji Bulanan: " + "$" + df2.format(monthlyEarning());
	}
	  
	public Object clone() throws CloneNotSupportedException
	{
		Faculty e = (Faculty)super.clone();
		edu = (Education) edu.clone();
		e.setEdu(edu);
		return e; 
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
