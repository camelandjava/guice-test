package jaivir.sample.guice.lists2.operation;

/**
 * Class performs a simple operation
 * 
 * @author j.singh
 *
 */
public class AppendSciamPrice implements Operation{
	
	public String execute(String param){
		
		return param+" Price: $5.99";
	}
}