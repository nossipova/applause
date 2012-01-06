package org.applause.lang.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.applause.lang.applauseDsl.VariableDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

public class VariableDeclarationScope extends AbstractScope {

	protected final EObject context;

	public VariableDeclarationScope(IScope scope, EObject context) {
		super(scope, true);
		Preconditions.checkNotNull(context);
		this.context = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		Iterable<VariableDeclaration> declarations = Iterables.filter(context.eContents(), VariableDeclaration.class);
		return scopedElementsFor(declarations);
	}

}
