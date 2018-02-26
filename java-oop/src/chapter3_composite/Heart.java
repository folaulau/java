package chapter3_composite;

public class Heart {

	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String type;
	private Body body;

	public Heart(final String type, final Body body) {
		super();
		this.type = type;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Heart [type=" + this.type + ", body=" + this.body + "]";
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(final Body body) {
		this.body = body;
	}

}
