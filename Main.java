import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws CloneNotSupportedException
    {


		Employee emp [] = new Employee[9];

		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapita", "Steven", "456", 'F', 7, 6, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "PhD", "Engineering", 3, Faculty.Level.FULL));
		emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "PhD","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));

		System.out.println("Part A: informasi Pegawai");

		for (int i=0; i < emp.length; i++)
		{
			System.out.println(emp[i]+ "\n");
		}

		System.out.println("Part B: Total Gaji Bulanan untuk Staf Paruh Waktu");

		double total_part_time = 0.0;

		for (int i=0; i < emp.length; i++)
		{
			if(emp[i] instanceof Partime)
			{
				total_part_time += emp[i].monthlyEarning();
			}
		}
		System.out.println("  " + "$" + total_part_time + "\n");

		System.out.println("Part C: Total Gaji Bulanan untuk Semua Karyawan");

		double total_salary = 0.0;
		for (int i=0; i< emp.length; i++)
		{
			total_salary += emp[i].monthlyEarning();
		}
		System.out.println("  " + "$" + total_salary + "\n");

	
    }
}
