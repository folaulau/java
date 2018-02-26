package loop;


public class ForLoop {

	
	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop();
		forLoop.testOuterBreak();
		forLoop.testOuterContinue();
	}
	
	
	public void testOuterBreak() {
		for (int r = 0; r < 2; r++) {
			System.out.println("new outer");
			outer: for (int i = 0; i < 5; i++) {
				for (int x = 0; x < 5; x++) {
					System.out.println("i: " + i + ", x: " + x);
					if (i > 3) {
						System.out.println("break outer");
						break outer;
					}
				}
			}
		}
	}

	public void testOuterContinue() {
		for (int r = 0; r < 2; r++) {
			System.out.println("new outer");
			outer: for (int i = 0; i < 5; i++) {
				for (int x = 0; x < 10; x++) {
					System.out.println("i: " + i + ", x: " + x);
					if (x > i) {
						System.out.println("continue outer");
						continue outer;
					}
				}
			}

		}
	}

}
