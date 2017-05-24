
public class Client {
	
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
		}

	public void sendRequest(UserModel acc){
		filterManager.filterRequest(acc);
		}
}
