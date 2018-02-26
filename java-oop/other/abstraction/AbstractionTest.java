package abstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		Car caravan = new Caravan(40,true,80,80,Car.SOUTH);
		caravan.start();
		caravan.run();
		caravan.slowDown(20);
		caravan.speedUp(60);
		caravan.stop();
		caravan.reverse();
	}

}
