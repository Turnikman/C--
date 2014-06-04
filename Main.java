package Lab7;

import java.util.*;

// class Employee
public class Employee {

	private float itsNumber;
	private String itsSurname;
	private String itsSex;
	private float itsAge;
	private float itsWeight;
	private int itsSalary;
	private EmployeePosition itsPosition = EmployeePosition.values()[0];
	private boolean itsSmoke;

	public Employee() {
		itsNumber = 1;
		itsSurname = "Shtanko";
		itsSex = "man";
		itsAge = 19;
		itsWeight = 70;
		itsSalary = 220000;
		itsPosition = EmployeePosition.director;
		itsSmoke = false;
	}

	public Employee(float N, String Sur, String Sx, float A, float W, int Sal,
			EmployeePosition P, boolean S) {
		SetData(N, Sur, Sx, A, W, Sal, P, S);
	}

	public final void SetData(float N, String Sur, String Sx, float A, float W,
			int Sal, EmployeePosition P, boolean S) {
		if (!TestNumber(N)) {
			throw new RuntimeException();
		}
		itsNumber = N;
		itsSurname = Sur;
		itsSex = Sx;
		itsAge = A;
		itsWeight = W;
		itsSalary = Sal;
		itsPosition = P;
		itsSmoke = S;
	}

	public final void Show() {
		System.out.println("Number : " + itsNumber + "\n" + "Surname : "
				+ itsSurname + "\n" + "Sex :     " + itsSex + "\n"
				+ "Age    : " + itsAge + "\n" + "Weight : " + itsWeight + "\n"
				+ "Salary : " + itsSalary + "\n" + "Position  : " + itsPosition
				+ "\n" + "Smoke   : " + itsSmoke + "\n");
	}

	public final void Input() {
		float N;
		String Sur;
		String Sx;
		float A;
		float W;
		int Sal;
		EmployeePosition P;
		boolean S;

		Scanner s = new Scanner(System.in);

		System.out.print("Number: ");
		N = Float.parseFloat(s.nextLine());
	
		System.out.print("Surname: ");
		Sur = String.valueOf(s.nextLine());
		System.out.print("Sex:");
		Sx = String.valueOf(s.nextLine());
		System.out.print("Age:");
		A = Float.parseFloat(s.nextLine());
		System.out.print("Weight:");
		W = Float.parseFloat(s.nextLine());
		System.out.print("Salary : ");
		Sal = Integer.parseInt(s.nextLine());
		System.out
				.print("Positin(director, developer, programmer, manager, accountant ): ");
		P = EmployeePosition.valueOf(s.nextLine().toString());
		System.out.println("Smoke?:");
		S = Boolean.parseBoolean(s.nextLine());
		s.close();

		itsNumber = N;
		itsSurname = Sur;
		itsSex = Sx;
		itsAge = A;
		itsWeight = W;
		itsSalary = Sal;
		itsPosition = P;
		itsSmoke = S;

	}

	public final String ToStr() {
		String result;
		result = itsNumber + ";" + itsSurname + ";" + itsSex + ";" + itsAge
				+ ";" + itsWeight + ";" + itsSalary + ";" + itsPosition + ";"
				+ itsSmoke;
		return result;
	}

	private static float NumberMin = 1;
	private static float NumberMax = 999;

	private static boolean TestNumber(float pNumber) {
		return pNumber >= NumberMin && pNumber <= NumberMax;
	}

	public final float getNumber() {
		return itsNumber;
	}

	public final void setNumber(float value) {
		if (!TestNumber(value)) {
			throw new RuntimeException();
		}
		itsNumber = value;
	}

	public final String getSurname() {
		return itsSurname;
	}

	public final void setSurname(String value) {
		itsSurname = value;
	}

	public final String getSex() {
		return itsSex;
	}

	public final void setSex(String value) {
		itsSex = value;
	}

	public final float getAge() {
		return itsAge;
	}

	public final void setAge(float value) {
		itsAge = value;
	}

	public final float getWeight() {
		return itsWeight;
	}

	public final void setWeight(float value) {
		itsWeight = value;
	}

	public final int getSalary() {
		return itsSalary;
	}

	public final void setSalary(int value) {
		itsSalary = value;
	}

	public final EmployeePosition getPosition() {
		return itsPosition;
	}

	public final void setPosition(EmployeePosition value) {
		itsPosition = value;
	}

	public final boolean getSmoke() {
		return itsSmoke;
	}

	public final void setSmoke(boolean value) {
		itsSmoke = value;
	}

	public static Employee OpIncrement(Employee obj) {
		obj.itsAge++;
		obj.itsSalary++;
		obj.itsWeight++;
		return obj;
	}

	public static Employee OpAddition(Employee obj1, Employee obj2) {
		Employee result = new Employee();
		result.itsAge = obj1.itsAge + obj2.itsAge;
		result.itsSalary = obj1.itsSalary + obj2.getSalary();
		result.itsWeight = obj1.itsWeight + obj2.itsWeight;
		return result;
	}

	public static boolean OpLessThan(Employee obj1, Employee obj2) {
		boolean result;
		result = obj1.itsAge < obj2.itsAge;
		return result;
	}

	public static boolean OpGreaterThan(Employee obj1, Employee obj2) {
		boolean result;
		result = obj1.itsAge > obj2.itsAge;
		return result;
	}
}
