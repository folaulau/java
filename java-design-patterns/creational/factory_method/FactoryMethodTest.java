package factory_method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();

		Plan domesticPlan = planFactory.getPlan(DomesticPlan.PlanType);
		domesticPlan.getRate();
		domesticPlan.calculateBill(10);
		Plan commercialPlan = planFactory.getPlan(CommercialPlan.PlanType);
		commercialPlan.getRate();
		commercialPlan.calculateBill(10);
		Plan institutionalPlan = planFactory.getPlan(InstitutionalPlan.PlanType);
		institutionalPlan.getRate();
		institutionalPlan.calculateBill(10);
	}

}
