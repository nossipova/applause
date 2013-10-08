package org.applause.lang.generator.android.extensions

import org.applause.lang.applauseDsl.RESTURL
import org.applause.lang.applauseDsl.RESTURLText
import org.applause.lang.applauseDsl.RESTURLVariable

class RESTURLExtensions {

	def toURLString(RESTURL it) {
		'/' + parts.map[
			switch it {
				RESTURLText: text
				RESTURLVariable: '{' + parameterReference.name + '}'
			}].join('/')
	}
}
