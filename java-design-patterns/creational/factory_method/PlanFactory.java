package factory_method;

public class PlanFactory {
	public Plan getPlan(String planType){
		if(planType==null){
			return null;
		}else if(planType.equals(CommercialPlan.PlanType)){
			return new CommercialPlan();
		}else if(planType.equals(DomesticPlan.PlanType)){
			return new DomesticPlan();
		}else if(planType.equals(InstitutionalPlan.PlanType)){
			return new InstitutionalPlan();
		}else{
			return null;
		}
	}
}
