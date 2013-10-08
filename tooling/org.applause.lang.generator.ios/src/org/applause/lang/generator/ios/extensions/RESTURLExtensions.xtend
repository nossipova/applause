package org.applause.lang.generator.ios.extensions

import org.applause.lang.applauseDsl.RESTURL
import org.applause.lang.applauseDsl.RESTURLText
import org.applause.lang.applauseDsl.RESTURLVariable

class RESTURLExtensions {

	def toURLString(RESTURL it) {
		if(!parts.filter(RESTURLVariable).nullOrEmpty) {
			'[NSString stringWithFormat:@"/' + parts.map[
				switch it {
					RESTURLText: text
					RESTURLVariable: '%@'
				}].join('/') + '", ' + parts.filter(RESTURLVariable).map[parameterReference.name].join(', ') + '];'
		} else {
			'@"/' + parts.filter(RESTURLText).map[text].join('/') + '";'
		}
	}
}
