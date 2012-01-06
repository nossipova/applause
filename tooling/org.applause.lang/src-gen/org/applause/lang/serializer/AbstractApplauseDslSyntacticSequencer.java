package org.applause.lang.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.applause.lang.services.ApplauseDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractApplauseDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ApplauseDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TabBarApplication_ApplicationKeyword_0_1_or_TabbarApplicationKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ApplauseDslGrammarAccess) access;
		match_TabBarApplication_ApplicationKeyword_0_1_or_TabbarApplicationKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTabBarApplicationAccess().getApplicationKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0_0()));
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
			if(match_TabBarApplication_ApplicationKeyword_0_1_or_TabbarApplicationKeyword_0_0.equals(syntax))
				emit_TabBarApplication_ApplicationKeyword_0_1_or_TabbarApplicationKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'application' | 'tabbarApplication'
	 */
	protected void emit_TabBarApplication_ApplicationKeyword_0_1_or_TabbarApplicationKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
