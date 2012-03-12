package org.applause.pbxproj.lang.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class PbxprojLinker extends LazyLinker {

	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		// doLinkModel(model, diagnosticsConsumer);
	}
}
