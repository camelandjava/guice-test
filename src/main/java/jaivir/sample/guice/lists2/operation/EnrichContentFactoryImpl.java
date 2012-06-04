package jaivir.sample.guice.lists2.operation;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class EnrichContentFactoryImpl implements EnrichContentFactory {
	
	private Logger log = Logger.getLogger(this.getClass());
	public ArrayList<Operation> operationsList;
	
	public EnrichContent create(String journalName) throws Exception{
	
		if(journalName.equalsIgnoreCase("Nprot")){
			
			operationsList = new ArrayList<Operation>(); 
			operationsList.add(new AppendNprotIntro());
			operationsList.add(new AppendNprotPrice());
			
		}	
		else if(journalName.equalsIgnoreCase("Sciam")){
			
			operationsList = new ArrayList<Operation>();
			operationsList.add(new AppendSciamIntro());
			operationsList.add(new AppendSciamPrice());
			operationsList.add(new AppendSciamSubscriptionPrice());
			
		}	
		
		if(operationsList!= null)
			log.info("operationsList size"+ operationsList.size());
		else 
			throw new Exception ("Invalid journal name was passed: "+ journalName);
		
		return new EnrichContent(operationsList);
	}

}
