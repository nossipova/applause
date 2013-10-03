package org.applause.lang.generator.ios.extensions

import org.applause.lang.applauseDsl.ElvisExpression
import org.applause.lang.applauseDsl.EntityMemberCall
import org.applause.lang.applauseDsl.StringLiteral

class ExpressionExtensions {

	def dispatch String asString(StringLiteral it, String entityVariableName) {
		value
	}

	def dispatch String asString(EntityMemberCall it, String entityVariableName) {
		(if (entityVariableName != null) entityVariableName + '.' else '') + head.name
	}

	def dispatch String asString(ElvisExpression it, String entityVariableName) {
		leftOperand.asString(entityVariableName) + if(rightOperand != null) {
			' ?: ' + rightOperand.asString(entityVariableName)
		} else
			''
	}

	def dispatch String asString(Void it, String entityVariableName) {
		''
	}
}
