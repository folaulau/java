package chapter3_composite;

public class Body {
	private String type;
	private int age;
	private Heart heart;

	public Body(final String type, final int age, final Heart heart) {
		super();
		this.type = type;
		this.age = age;
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "Body [type=" + this.type + ", age=" + this.age + ", heart=" + this.heart + "]";
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public Heart getHeart() {
		return this.heart;
	}

	public void setHeart(final Heart heart) {
		this.heart = heart;
	}

}
