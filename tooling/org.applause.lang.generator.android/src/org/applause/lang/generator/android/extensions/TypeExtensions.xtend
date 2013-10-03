package org.applause.lang.generator.android.extensions

import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.NamedElement
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.applauseDsl.DataSource

class TypeExtensions extends org.applause.lang.base.TypeExtensions {
	
	def fileName(NamedElement it) {
		fqn.toFilePath + ".xtend"
	}

	def converterFileName(NamedElement it) {
		fqn.toFilePath + 'JSONConverter.xtend'
	}
	
	def serverFileName(NamedElement it) {
		fqn.toFilePath + 'Server.xtend'
	}
	
	def communicatorFileName(NamedElement it) {
		fqn.toFilePath + 'Communicator.xtend'
	}
	
	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}	

	def dispatch fqn(Entity it) {
		if (!namespace.nullOrEmpty)
			namespace + '.entities.' + typeName
		else
			typeName
	}
	
	def dispatch fqn(ListItemCellDeclaration it) {
		if (!namespace.nullOrEmpty)
			namespace + '.ui.' + typeName
		else
			typeName
	}
	
	def dispatch fqn(DataSource it) {
		if (!namespace.nullOrEmpty)
			namespace + '.datasource.' + typeName
		else
			typeName
	}
	
	def dispatch String typeName(ListItemCellDeclaration it) {
		name + 'ViewHolder'
	}

	def dispatch String typeName(DataSource it) {
		name
	}
	
	
}