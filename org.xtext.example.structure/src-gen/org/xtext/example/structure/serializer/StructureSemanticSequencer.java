/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.structure.services.StructureGrammarAccess;
import org.xtext.example.structure.structure.Carpeta;
import org.xtext.example.structure.structure.Content;
import org.xtext.example.structure.structure.Raiz;
import org.xtext.example.structure.structure.StructurePackage;

@SuppressWarnings("all")
public class StructureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StructureGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StructurePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StructurePackage.CARPETA:
				sequence_Carpeta(context, (Carpeta) semanticObject); 
				return; 
			case StructurePackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case StructurePackage.RAIZ:
				sequence_Raiz(context, (Raiz) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Carpeta returns Carpeta
	 *
	 * Constraint:
	 *     (path=STRING? name=STRING childs+=Carpeta* files+=[Content|ID]*)
	 */
	protected void sequence_Carpeta(ISerializationContext context, Carpeta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Content returns Content
	 *
	 * Constraint:
	 *     (name=ID ext=Extension? text=STRING)
	 */
	protected void sequence_Content(ISerializationContext context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Raiz returns Raiz
	 *
	 * Constraint:
	 *     (name=ID carpetas+=Carpeta* contents+=Content*)
	 */
	protected void sequence_Raiz(ISerializationContext context, Raiz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
