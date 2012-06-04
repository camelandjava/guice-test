package jaivir.sample.guice.lists2.guicemodule;

import com.google.inject.AbstractModule;
import jaivir.sample.guice.lists2.operation.*;

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
		
		bind(EnrichContentFactory.class).to(EnrichContentFactoryImpl.class);
		bind(TransformContent.class).to (TransformToHtml.class);
		
		
	}
}