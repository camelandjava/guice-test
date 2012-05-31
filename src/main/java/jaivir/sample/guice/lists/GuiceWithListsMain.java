package jaivir.sample.guice.lists;


import java.util.ArrayList;
import jaivir.sample.guice.lists.guicemodule.*;
import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 *
 */
public class GuiceWithListsMain {

	private static ArrayList<InstructionSet> instructionList;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new OperationsModule());
		InstructionsProcessor opsController = injector.getInstance(InstructionsProcessor.class);
		setupInstructionList();
		opsController.processInstructions(instructionList);
	}
	
	private static void setupInstructionList(){
		
		InstructionSet instructionSet1 = new InstructionSet();
		instructionSet1.setJournalName("NPG-> ");
		instructionSet1.addOperationToOperationsList("enrich");

		InstructionSet instructionSet2 = new InstructionSet();
		instructionSet2.setJournalName("Sciam-> ");
		instructionSet2.addOperationToOperationsList("enrich");
		instructionSet2.addOperationToOperationsList("transform");

		instructionList  = new ArrayList<InstructionSet>();
	    instructionList.add(instructionSet1);
	    instructionList.add(instructionSet2);

	}

}	
