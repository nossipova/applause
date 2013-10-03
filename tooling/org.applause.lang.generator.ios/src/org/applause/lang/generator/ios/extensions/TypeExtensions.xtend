package org.applause.lang.generator.ios.extensions

import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.applauseDsl.NamedElement

class TypeExtensions extends org.applause.lang.base.TypeExtensions {

	def dispatch moduleFileNameFQN(NamedElement element) {
		element.fqn.toFilePath + ".m"
	}

	def dispatch moduleFileNameFQN(Entity entity) {
		entity.fqn.toFilePath + ".m"
	}

	def dispatch moduleFileName(NamedElement element) {
		element.typeName.toFilePath + ".m"
	}

	def dispatch moduleFileName(Entity entity) {
		entity.name.toFilePath + ".m"
	}

	def dispatch headerFileNameFQN(NamedElement element) {
		element.fqn.toFilePath + ".h"
	}

	def dispatch headerFileNameFQN(Entity entity) {
		entity.fqn.toFilePath + ".h"
	}

	def dispatch headerFileName(NamedElement element) {
		element.typeName.toFilePath + ".h"
	}

	def dispatch headerFileName(Entity entity) {
		entity.name.toFilePath + ".h"
	}

	override toFilePath(String path) {
		path.replaceAll("\\.", "/")
	}

	def dispatch String typeName(ListItemCellDeclaration it) {
		name
	}

	def dispatch String typeName(DataSource it) {
		name + 'MappingProvider'
	}

}
