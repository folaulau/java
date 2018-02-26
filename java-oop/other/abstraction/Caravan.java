package abstraction;

public class Caravan extends Car{

	public Caravan(int speed, boolean condition, int gas, int oil, String direction) {
		super(speed, condition, gas, oil, direction);
	}
	
	@Override
	boolean isConditionGood() {
		if(gas > 0 && oil > 0 && condition == true){
			System.out.println(this.getClass().getName()+" is ready to go!");
			return true;
		}
		return false;
	}
	@Override
	boolean start() {
		if(this.isConditionGood()){
			System.out.println(this.getClass().getName()+" starting!");
			return true;
		}else{
			System.err.println(this.getClass().getName()+" could not get started!");
			return false;
		}
			
	}

	@Override
	boolean run() {
		
		if(isConditionGood() && speed > 0){
			System.out.println(this.getClass().getName()+" running at "+speed+" mph...");
			return true;
		}else{
			System.out.println(this.getClass().getName()+" not running due to low speed of "+speed+" mph");
			return false;
		}
		
	}

	@Override
	boolean reverse() {
		System.out.println(this.getClass().getName()+" reversing!");
		return true;
	}

	@Override
	boolean turn(String turn) {
		System.out.println(this.getClass().getName()+" turn "+turn);
		if(turn.equals(RIGHT) && direction.equals(NORTH)){
			direction = EAST;
		}else if(turn.equals(LEFT) && direction.equals(NORTH)){
			direction = WEST;
		}else if(turn.equals(RIGHT) && direction.equals(SOUTH)){
			direction = WEST;
		}else if(turn.equals(LEFT) && direction.equals(SOUTH)){
			direction = EAST;
		}else if(turn.equals(RIGHT) && direction.equals(WEST)){
			direction = NORTH;
		}else if(turn.equals(LEFT) && direction.equals(WEST)){
			direction = SOUTH;
		}else if(turn.equals(RIGHT) && direction.equals(EAST)){
			direction = SOUTH;
		}else if(turn.equals(LEFT) && direction.equals(EAST)){
			direction = NORTH;
		}else{
			return false;
		}
		return true;
	}

	@Override
	boolean speedUp(int speed) {
		System.out.println(this.getClass().getName()+" speeding up to "+speed+" mph");
		this.speed = speed;
		return true;
	}

	@Override
	boolean slowDown(int speed) {
		System.out.println(this.getClass().getName()+" slowing down to "+speed+" mph");
		this.speed = speed;
		return true;
	}

	@Override
	boolean stop() {
		System.out.println(this.getClass().getName()+" stopped!");
		speed = 0;
		return true;
		
	}



}
