
public class FilterManager {
	FilterChain filterChain;
	
	   public FilterManager(Target target){
	      filterChain = new FilterChain();
	      filterChain.setTarget(target);
	   }
	   public void setFilter(Filter filter){
	      filterChain.addFilter(filter);
	   }
	   
	   public void clear(){
		   filterChain.clearFilter();
	   }

	   public void filterRequest(UserModel acc){
	      filterChain.execute(acc);
	   }
}
