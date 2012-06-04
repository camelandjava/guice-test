package jaivir.sample.guice.lists2.operation;

/**
 * Class performs a simple operation
 * 
 * @author j.singh
 *
 */
public class AppendNprotIntro implements Operation{
	
	public String execute(String param){
		
		return param+": Nature Protocols is an interactive online ...";
	}
}