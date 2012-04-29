package org.applause.pbxproj.lang.naming;

import org.applause.pbxproj.lang.pbxproj.BuildConfiguration;
import org.applause.pbxproj.lang.pbxproj.BuildFileReference;
import org.applause.pbxproj.lang.pbxproj.FileReference;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

public class PbxprojQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Inject
	IQualifiedNameConverter qualifiedNameConverter;

	public QualifiedName qualifiedName(FileReference obj) {
		return qualifiedNameConverter.toQualifiedName(obj.getName());
	}

	public QualifiedName qualifiedName(BuildFileReference obj) {
		return qualifiedNameConverter.toQualifiedName(obj.getName());
	}

	public QualifiedName qualifiedName(BuildConfiguration obj) {
		return qualifiedNameConverter.toQualifiedName(obj.getName());
	}
}
