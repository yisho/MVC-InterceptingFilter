import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	   private List<Filter> filterList = new ArrayList<Filter>();
	   private Target target;

	   
	   public void addFilter(Filter filter){
	      filterList.add(filter);
	   }
	   
	   public void clearFilter(){
		   filterList.clear();
	   }
	   
	   public void execute(UserModel acc){
	      for(Filter filter : filterList) {
	         filter.execute(acc);
	      }
	      target.execute(acc);
	   }

	   public void setTarget(Target target){
	      this.target = target;
	   }
	}