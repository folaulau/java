package factory_method;

public class InstitutionalPlan extends Plan {
	public static final String PlanType = "InstitutionalPlan";
	
	public InstitutionalPlan() {
		System.out.println(PlanType);
	}
	
	@Override
	void getRate() {
		rate = 5.50;
	}

}
