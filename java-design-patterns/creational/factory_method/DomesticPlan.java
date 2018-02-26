package factory_method;

public class DomesticPlan extends Plan {
	public static final String PlanType = "DomesticPlan";
	
	public DomesticPlan() {
		System.out.println(PlanType);
	}
	
	@Override
	void getRate() {
		rate = 3.50;
	}

}
