package org.applause.lang.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import java.util.Collections;

import org.applause.lang.applauseDsl.Entity;
import org.applause.lang.applauseDsl.ObjectReference;
import org.applause.lang.applauseDsl.TypeDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class NestedDeclarationScope extends AbstractScope {

	private final ObjectReference container;

	public NestedDeclarationScope(IScope scope, ObjectReference container) {
		super(scope, true);
		this.container = container;
	}

	@Override
	public IScope getParent() {
		return IScope.NULLSCOPE;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		TypeDescription outerType = TypeUtil.getTypeOf(container.getObject());
		if (outerType.getType() instanceof Entity) {
			Entity entity = (Entity) outerType.getType();
			return scopedElementsFor(entity.getProperties());
		} else {
			return Collections.emptyList();
		}
	}

}
