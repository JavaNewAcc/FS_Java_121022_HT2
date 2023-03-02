package secondlesson;

public class TaskThree {

	public static void main(String[] args) {
		System.out.println("Завдання №3:");
		double fuelPrice = 1.2;
		double consumption = 8;
		int dist = 120;

		double fuelValue = dist * (consumption / 100) * fuelPrice;
		System.out.println("Загальна вартість палива, витраченого на поїздку, складе: " + fuelValue + " USD");
	}
}