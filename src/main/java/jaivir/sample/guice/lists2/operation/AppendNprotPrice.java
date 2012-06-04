package jaivir.sample.guice.lists2.operation;

/**
 * Class performs a simple operation
 * 
 * @author j.singh
 *
 */
public class AppendNprotPrice implements Operation{
	
	public String execute(String param){
		
		return param+" Price: $10.99";
	}
}