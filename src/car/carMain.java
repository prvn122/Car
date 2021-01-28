package car;

public class carMain {
	public static void main(String[] args) {
		car myCar = new car("ford","endevour","red",8);
		System.out.println(myCar.getBrand());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getNumOfSeat());
		
	}

}
