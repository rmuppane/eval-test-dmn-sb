package com.redhat;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Document implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String docName;
	private java.util.List<java.math.BigDecimal> footNoteCodes;

	public Document() {
	}

	public java.lang.String getDocName() {
		return this.docName;
	}

	public void setDocName(java.lang.String docName) {
		this.docName = docName;
	}

	public java.util.List<java.math.BigDecimal> getFootNoteCodes() {
		return this.footNoteCodes;
	}

	public void setFootNoteCodes(
			java.util.List<java.math.BigDecimal> footNoteCodes) {
		this.footNoteCodes = footNoteCodes;
	}

	public Document(java.lang.String docName,
			java.util.List<java.math.BigDecimal> footNoteCodes) {
		this.docName = docName;
		this.footNoteCodes = footNoteCodes;
	}

}