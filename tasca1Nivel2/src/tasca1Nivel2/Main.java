package tasca1Nivel2;

public class Main {
	public static void main(String[] args) {

		System.out.println("Mark: " + Car.mark);
		System.out.println("Model: " + Car.model);

		Car.model = "Camry";
		System.out.println("Updated model: " + Car.model);

		Car car = new Car(150);
		System.out.println("Power: " + car.power);

		Car.brake();

		car.accelerate();
	}
}
