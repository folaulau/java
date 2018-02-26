package proxy;

public class Fund implements Payment{

	public Fund() {
		// connect to bank to prepare charge
		loadProfileFromBank();
	}
	
	private void loadProfileFromBank() {
		try {
			// This process takes alot of resources.
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException - loadProfileFromBank - msg: "+e.getLocalizedMessage());
		}
	}
	
	@Override
	public void prep() {
		System.out.println("prep fund...");
	}
	
	@Override
	public void charge() {
		System.out.println("charge fund...");
	}

}
