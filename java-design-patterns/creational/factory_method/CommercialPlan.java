package factory_method;

public class CommercialPlan extends Plan {

	public static final String PlanType = "CommercialPlan";
	
	public CommercialPlan() {
		System.out.println(PlanType);
	}
	
	@Override
	void getRate() {
		rate = 7.50;
	}

}
