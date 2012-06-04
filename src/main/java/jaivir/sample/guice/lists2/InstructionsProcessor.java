/**
 *
 */
package jaivir.sample.guice.lists2;


import jaivir.sample.guice.lists2.operation.*;
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
	private  final EnrichContentFactory enrichContentFactory;
	private  final TransformContent transformContent;
	
	
	@Inject
	private InstructionsProcessor(EnrichContentFactory enrichContentFactory,TransformContent transformContent){
		this.enrichContentFactory = enrichContentFactory;
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
				
				try {
					if(op.equalsIgnoreCase("enrich")){
						Operation ec = enrichContentFactory.create(initialString);
						initialString = ec.execute(initialString);
					}	
					else if(op.equalsIgnoreCase("transform")){
						initialString = transformContent.execute(initialString);
					}
				} catch(Exception e){
					log.error(e);
				}
				
				log.info("initialString Stage"+ counter++ +": "+ initialString);
				
			}
			
			
		}

		
	}
}
