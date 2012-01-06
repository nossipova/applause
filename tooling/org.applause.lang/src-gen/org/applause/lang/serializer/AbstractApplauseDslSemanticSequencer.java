package org.applause.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Application;
import org.applause.lang.applauseDsl.CollectionIterator;
import org.applause.lang.applauseDsl.CollectionLiteral;
import org.applause.lang.applauseDsl.ComplexProviderConstruction;
import org.applause.lang.applauseDsl.Constant;
import org.applause.lang.applauseDsl.ContentProvider;
import org.applause.lang.applauseDsl.CustomView;
import org.applause.lang.applauseDsl.DetailsView;
import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.ExternalOpen;
import org.applause.lang.applauseDsl.Model;
import org.applause.lang.applauseDsl.ObjectReference;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.Property;
import org.applause.lang.applauseDsl.SectionCell;
import org.applause.lang.applauseDsl.SimpleProviderConstruction;
import org.applause.lang.applauseDsl.SimpleType;
import org.applause.lang.applauseDsl.StringConcat;
import org.applause.lang.applauseDsl.StringLiteral;
import org.applause.lang.applauseDsl.StringReplace;
import org.applause.lang.applauseDsl.StringSplit;
import org.applause.lang.applauseDsl.StringUrlConform;
import org.applause.lang.applauseDsl.TabbarButton;
import org.applause.lang.applauseDsl.TableView;
import org.applause.lang.applauseDsl.TypeDescription;
import org.applause.lang.applauseDsl.ViewCall;
import org.applause.lang.applauseDsl.ViewHeader;
import org.applause.lang.applauseDsl.ViewSection;
import org.applause.lang.services.ApplauseDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractApplauseDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ApplauseDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApplauseDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApplauseDslPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule() ||
				   context == grammarAccess.getTabBarApplicationRule()) {
					sequence_TabBarApplication(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.COLLECTION_ITERATOR:
				if(context == grammarAccess.getCollectionIteratorRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_CollectionIterator(context, (CollectionIterator) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.COLLECTION_LITERAL:
				if(context == grammarAccess.getCollectionExpressionRule() ||
				   context == grammarAccess.getCollectionLiteralRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_CollectionLiteral(context, (CollectionLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.COMPLEX_PROVIDER_CONSTRUCTION:
				if(context == grammarAccess.getProviderConstructionRule()) {
					sequence_ProviderConstruction(context, (ComplexProviderConstruction) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.CONTENT_PROVIDER:
				if(context == grammarAccess.getContentProviderRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_ContentProvider(context, (ContentProvider) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.CUSTOM_VIEW:
				if(context == grammarAccess.getCustomViewRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_CustomView(context, (CustomView) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.DETAILS_VIEW:
				if(context == grammarAccess.getDetailsViewRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getSectionedViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_DetailsView(context, (DetailsView) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.EXTERNAL_OPEN:
				if(context == grammarAccess.getExternalOpenRule() ||
				   context == grammarAccess.getViewActionRule()) {
					sequence_ExternalOpen(context, (ExternalOpen) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.OBJECT_REFERENCE:
				if(context == grammarAccess.getNestedObjectReferenceRule()) {
					sequence_NestedObjectReference(context, (ObjectReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCollectionExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getObjectReferenceRule() ||
				   context == grammarAccess.getScalarExpressionRule()) {
					sequence_ObjectReference(context, (ObjectReference) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SECTION_CELL:
				if(context == grammarAccess.getSectionCellRule()) {
					sequence_SectionCell(context, (SectionCell) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SIMPLE_PROVIDER_CONSTRUCTION:
				if(context == grammarAccess.getProviderConstructionRule()) {
					sequence_ProviderConstruction(context, (SimpleProviderConstruction) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_SimpleType(context, (SimpleType) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_CONCAT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getScalarExpressionRule() ||
				   context == grammarAccess.getStringFunctionRule()) {
					sequence_StringFunction(context, (StringConcat) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getScalarExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_REPLACE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getScalarExpressionRule() ||
				   context == grammarAccess.getStringFunctionRule()) {
					sequence_StringFunction(context, (StringReplace) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_SPLIT:
				if(context == grammarAccess.getCollectionExpressionRule() ||
				   context == grammarAccess.getCollectionFunctionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_CollectionFunction(context, (StringSplit) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.STRING_URL_CONFORM:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getScalarExpressionRule() ||
				   context == grammarAccess.getStringFunctionRule()) {
					sequence_StringFunction(context, (StringUrlConform) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.TABBAR_BUTTON:
				if(context == grammarAccess.getTabbarButtonRule()) {
					sequence_TabbarButton(context, (TabbarButton) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.TABLE_VIEW:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getSectionedViewRule() ||
				   context == grammarAccess.getTableViewRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_TableView(context, (TableView) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.TYPE_DESCRIPTION:
				if(context == grammarAccess.getTypeDescriptionRule()) {
					sequence_TypeDescription(context, (TypeDescription) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.VIEW_CALL:
				if(context == grammarAccess.getViewActionRule() ||
				   context == grammarAccess.getViewCallRule()) {
					sequence_ViewCall(context, (ViewCall) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.VIEW_HEADER:
				if(context == grammarAccess.getViewHeaderRule()) {
					sequence_ViewHeader(context, (ViewHeader) semanticObject); 
					return; 
				}
				else break;
			case ApplauseDslPackage.VIEW_SECTION:
				if(context == grammarAccess.getViewSectionRule()) {
					sequence_ViewSection(context, (ViewSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=ScalarExpression delimiter=ScalarExpression)
	 */
	protected void sequence_CollectionFunction(EObject context, StringSplit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_SPLIT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_SPLIT__VALUE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_SPLIT__DELIMITER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_SPLIT__DELIMITER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0(), semanticObject.getDelimiter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (collection=CollectionExpression name=ID)
	 */
	protected void sequence_CollectionIterator(EObject context, CollectionIterator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.COLLECTION_ITERATOR__COLLECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.COLLECTION_ITERATOR__COLLECTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0(), semanticObject.getCollection());
		feeder.accept(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (items+=ScalarExpression items+=ScalarExpression*)
	 */
	protected void sequence_CollectionLiteral(EObject context, CollectionLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ScalarExpression)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         parameter=Parameter? 
	 *         resolver?='resolves'? 
	 *         type=[Type|ID] 
	 *         many?='[]'? 
	 *         url=ScalarExpression 
	 *         selection=ScalarExpression
	 *     )
	 */
	protected void sequence_ContentProvider(EObject context, ContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=Parameter? objclass=STRING)
	 */
	protected void sequence_CustomView(EObject context, CustomView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=Parameter? title=ScalarExpression header=ViewHeader? sections+=ViewSection*)
	 */
	protected void sequence_DetailsView(EObject context, DetailsView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID extends=[Entity|ID]? properties+=Property*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=ScalarExpression
	 */
	protected void sequence_ExternalOpen(EObject context, ExternalOpen semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.EXTERNAL_OPEN__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.EXTERNAL_OPEN__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (application=Application elements+=ModelElement*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=[VariableDeclaration|ID] tail=NestedObjectReference?)
	 */
	protected void sequence_NestedObjectReference(EObject context, ObjectReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=[VariableDeclaration|ID] tail=NestedObjectReference?)
	 */
	protected void sequence_ObjectReference(EObject context, ObjectReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=TypeDescription name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.PARAMETER__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.PARAMETER__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (derived?='derived'? description=TypeDescription name=ID)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (provider=[ContentProvider|ID] argument=Expression?)
	 */
	protected void sequence_ProviderConstruction(EObject context, ComplexProviderConstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ProviderConstruction(EObject context, SimpleProviderConstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=CellType 
	 *         iterator=CollectionIterator? 
	 *         text=ScalarExpression? 
	 *         details=ScalarExpression? 
	 *         image=ScalarExpression? 
	 *         query=ScalarExpression? 
	 *         action=ViewAction?
	 *     )
	 */
	protected void sequence_SectionCell(EObject context, SectionCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID platformType=STRING)
	 */
	protected void sequence_SimpleType(EObject context, SimpleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.MODEL_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.SIMPLE_TYPE__PLATFORM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.SIMPLE_TYPE__PLATFORM_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0(), semanticObject.getPlatformType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     values+=ScalarExpression+
	 */
	protected void sequence_StringFunction(EObject context, StringConcat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=ScalarExpression match=ScalarExpression replacement=ScalarExpression)
	 */
	protected void sequence_StringFunction(EObject context, StringReplace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__MATCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__MATCH));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__REPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_REPLACE__REPLACEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0(), semanticObject.getMatch());
		feeder.accept(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0(), semanticObject.getReplacement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ScalarExpression
	 */
	protected void sequence_StringFunction(EObject context, StringUrlConform semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_URL_CONFORM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_URL_CONFORM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID splash=STRING? buttons+=TabbarButton*)
	 */
	protected void sequence_TabBarApplication(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=ScalarExpression icon=ScalarExpression view=ViewCall)
	 */
	protected void sequence_TabbarButton(EObject context, TabbarButton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__TITLE));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__ICON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__ICON));
			if(transientValues.isValueTransient(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplauseDslPackage.Literals.TABBAR_BUTTON__VIEW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0(), semanticObject.getIcon());
		feeder.accept(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0(), semanticObject.getView());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content=Parameter? title=ScalarExpression sections+=ViewSection*)
	 */
	protected void sequence_TableView(EObject context, TableView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] many?='[]'?)
	 */
	protected void sequence_TypeDescription(EObject context, TypeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (view=[View|ID] provider=ProviderConstruction?)
	 */
	protected void sequence_ViewCall(EObject context, ViewCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=ScalarExpression? subtitle=ScalarExpression? details=ScalarExpression? image=ScalarExpression?)
	 */
	protected void sequence_ViewHeader(EObject context, ViewHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=ScalarExpression? cells+=SectionCell+)
	 */
	protected void sequence_ViewSection(EObject context, ViewSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
