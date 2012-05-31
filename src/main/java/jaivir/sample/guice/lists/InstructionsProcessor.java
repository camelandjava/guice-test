/**
 *
 */
package jaivir.sample.guice.lists;


import jaivir.sample.guice.lists.operation.*;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/**
 * Class processes a list of instruction sets.To do so it 
 * a. unwraps an outer list that contains individual instruction set
 * b. unwraps operations list from within each instruction set
 *  
 * @author j.singh
 *
 */
public class InstructionsProcessor {
	
	private Logger log = Logger.getLogger(this.getClass());
	private  final EnrichContent enrichContent;
	private  final TransformContent transformContent;
	
	
	@Inject
	private InstructionsProcessor(EnrichContent enrichContent,TransformContent transformContent){
		this.enrichContent = enrichContent;
		this.transformContent = transformContent;
	}

	
	public void processInstructions(ArrayList<InstructionSet> instructionList) {

		Iterator<InstructionSet> instructionListItr = instructionList.iterator();
		
		while(instructionListItr.hasNext()) {
			
			int counter = 1;
			
			InstructionSet instructionSet = instructionListItr.next();
			String initialString = instructionSet.getJournalName();
			log.info("initialString Stage"+ counter++ +": "+ initialString);
			
			
			Iterator<String> operationItr = instructionSet.getOperationsList().iterator();
			
			while(operationItr.hasNext()) {
				
				String op = operationItr.next();
				
				if(op.equalsIgnoreCase("enrich"))
					initialString = enrichContent.execute(initialString);
				else if(op.equalsIgnoreCase("transform"))
					initialString = transformContent.execute(initialString);
				
				log.info("initialString Stage"+ counter++ +": "+ initialString);
				
			}
			
			
		}

		
	}
}
