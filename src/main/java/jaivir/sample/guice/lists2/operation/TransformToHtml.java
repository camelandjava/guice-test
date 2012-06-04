package jaivir.sample.guice.lists2.operation;

public class TransformToHtml implements TransformContent{
	
	public String execute(String param){
		return "<!DOCTYPE html> <html> <body> <h1>Journal Info:</h1> <p>" +
				param+ "</p> </body> </html>";
	}
}