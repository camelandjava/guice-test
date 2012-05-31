package jaivir.sample.guice.lists.operation;

public class AppendIntroAndPrice implements EnrichContent{
	
	public String execute(String param){
		
		return param+" Journal Intro appended sucessfully" +
				" ## Price: Journals range in price. Please " +
				"check individual journal";
	}
}