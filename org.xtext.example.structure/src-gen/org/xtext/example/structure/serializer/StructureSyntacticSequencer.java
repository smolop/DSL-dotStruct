/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.structure.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.structure.services.StructureGrammarAccess;

@SuppressWarnings("all")
public class StructureSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StructureGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Carpeta_CommaKeyword_5_q;
	protected AbstractElementAlias match_Carpeta_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_Carpeta___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q;
	protected AbstractElementAlias match_Carpeta___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StructureGrammarAccess) access;
		match_Carpeta_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getCarpetaAccess().getCommaKeyword_5());
		match_Carpeta_SemicolonKeyword_7_q = new TokenAlias(false, true, grammarAccess.getCarpetaAccess().getSemicolonKeyword_7());
		match_Carpeta___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCarpetaAccess().getLeftParenthesisKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getCarpetaAccess().getRightParenthesisKeyword_6_2()));
		match_Carpeta___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCarpetaAccess().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getCarpetaAccess().getRightSquareBracketKeyword_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Carpeta_CommaKeyword_5_q.equals(syntax))
				emit_Carpeta_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Carpeta_SemicolonKeyword_7_q.equals(syntax))
				emit_Carpeta_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Carpeta___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q.equals(syntax))
				emit_Carpeta___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Carpeta___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q.equals(syntax))
				emit_Carpeta___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     childs+=Carpeta ']' (ambiguity) '(' files+=[Content|ID]
	 *     childs+=Carpeta ']' (ambiguity) ('(' ')')? ';'? (rule end)
	 *     name=STRING '/' ('[' ']')? (ambiguity) '(' files+=[Content|ID]
	 *     name=STRING '/' ('[' ']')? (ambiguity) ('(' ')')? ';'? (rule end)
	 */
	protected void emit_Carpeta_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     childs+=Carpeta ']' ','? ('(' ')')? (ambiguity) (rule end)
	 *     files+=[Content|ID] ')' (ambiguity) (rule end)
	 *     name=STRING '/' ('[' ']')? ','? ('(' ')')? (ambiguity) (rule end)
	 */
	protected void emit_Carpeta_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     childs+=Carpeta ']' ','? (ambiguity) ';'? (rule end)
	 *     name=STRING '/' ('[' ']')? ','? (ambiguity) ';'? (rule end)
	 */
	protected void emit_Carpeta___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING '/' (ambiguity) ','? '(' files+=[Content|ID]
	 *     name=STRING '/' (ambiguity) ','? ('(' ')')? ';'? (rule end)
	 */
	protected void emit_Carpeta___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
