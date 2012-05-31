package jaivir.sample.guice.lists.guicemodule;

import com.google.inject.AbstractModule;
import jaivir.sample.guice.lists.operation.*;

/**
 * This class is a guice module. A module is a collection of bindings. 
 * Guice uses bindings to map types to their implementations. 
 *   
 * @author j.singh
 *
 */
public class OperationsModule extends AbstractModule {
	
	@Override
	protected void configure(){
		
		bind(EnrichContent.class).to(AppendIntroAndPrice.class);
		bind(TransformContent.class).to (TransformToHtml.class);
		
		
	}
}