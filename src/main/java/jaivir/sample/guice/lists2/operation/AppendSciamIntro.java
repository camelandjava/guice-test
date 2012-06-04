package jaivir.sample.guice.lists2.operation;

/**
 * Class performs a simple operation
 * 
 * @author j.singh
 *
 */
public class AppendSciamIntro implements Operation{
	
	public String execute(String param){
		
		return param+": Scientific American - Get your science news from the most trusted source!";
	}
}