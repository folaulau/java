package abstraction;

public abstract class Car {
	// states
	int speed;
	boolean condition;
	int gas;
	int oil;
	String direction;
	
	public static final String NORTH = "north";
	public static final String SOUTH = "south";
	public static final String WEST = "west";
	public static final String EAST = "east";
	
	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	
	public Car() {
		this(0,false,0,0,null);
	}
	
	public Car(int speed, boolean condition, int gas, int oil, String direction) {
		super();
		this.speed = speed;
		this.condition = condition;
		this.gas = gas;
		this.oil = oil;
		this.direction = direction;
	}
	
	// behaviors
	abstract boolean isConditionGood();
	abstract boolean start();
	abstract boolean run();
	abstract boolean speedUp(int speed);
	abstract boolean reverse();
	abstract boolean slowDown(int speed);
	abstract boolean stop();
	abstract boolean turn(String turn);
	
}
