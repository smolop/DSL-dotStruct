/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.structure.ui.internal.StructureActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StructureExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StructureActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StructureActivator.getInstance().getInjector(StructureActivator.ORG_XTEXT_EXAMPLE_STRUCTURE_STRUCTURE);
	}
	
}
