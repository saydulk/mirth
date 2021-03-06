/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * http://www.mirthcorp.com
 *
 * The software in this package is published under the terms of the MPL
 * license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */

package com.mirth.connect.model.converters;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;


public class HL7V3Serializer implements IXMLSerializer<String> {
	
	private boolean stripNamespaces = true;

	public static Map<String, String> getDefaultProperties() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("stripNamespaces", "true");
		return map;
	}
	
	public HL7V3Serializer(Map hl7v3Properties) {
		if (hl7v3Properties != null && hl7v3Properties.get("stripNamespaces") != null) {
			this.stripNamespaces = Boolean.parseBoolean((String) hl7v3Properties.get("stripNamespaces"));
		}
	}
	
	public String toXML(String source) throws SerializerException {
		return sanitize(source);
	}


	public String fromXML(String source) throws SerializerException {
		return sanitize(source);
	}
	
	// cleans up the XML
	public String sanitize(String source) {
		return source;
	}

	public Map<String, String> getMetadata() throws SerializerException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("version", "3.0"); //TODO: Update this to real version codes
		map.put("type", "HL7v3-Message");
		map.put("source", "");
		return map;
	}

	public Map<String, String> getMetadataFromDocument(Document doc) throws SerializerException {
		Map<String, String> map = getMetadata();
		map.put("type",doc.getDocumentElement().getNodeName());
		return map;
	}


	public Map<String, String> getMetadataFromEncoded(String source) throws SerializerException {
		return getMetadata();
	}

	public Map<String, String> getMetadataFromXML(String xmlSource) throws SerializerException {
		return getMetadata();
	}
}
