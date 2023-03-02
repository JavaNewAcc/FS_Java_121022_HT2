package secondlesson;

public class TaskOne {

	public static void main(String[] args) {
		System.out.println("Завдання №1:");
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;

		double p = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		System.out.println("Площа трикутника складає: " + area);
	}
}
