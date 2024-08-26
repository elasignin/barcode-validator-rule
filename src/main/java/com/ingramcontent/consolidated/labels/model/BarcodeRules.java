package com.ingramcontent.consolidated.labels.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BarcodeRules implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private boolean usesCustomerSuppliedBarcode;
	private boolean usesBookmarcSuppliedBarcode;
	private java.lang.String length;

	public BarcodeRules() {
	}

	public java.lang.String getLength() {
		return this.length;
	}

	public void setLength(java.lang.String length) {
		this.length = length;
	}

	public boolean isUsesCustomerSuppliedBarcode() {
		return this.usesCustomerSuppliedBarcode;
	}

	public void setUsesCustomerSuppliedBarcode(
			boolean usesCustomerSuppliedBarcode) {
		this.usesCustomerSuppliedBarcode = usesCustomerSuppliedBarcode;
	}

	public boolean isUsesBookmarcSuppliedBarcode() {
		return this.usesBookmarcSuppliedBarcode;
	}

	public void setUsesBookmarcSuppliedBarcode(
			boolean usesBookmarcSuppliedBarcode) {
		this.usesBookmarcSuppliedBarcode = usesBookmarcSuppliedBarcode;
	}

	public BarcodeRules(boolean usesCustomerSuppliedBarcode,
			boolean usesBookmarcSuppliedBarcode, java.lang.String length) {
		this.usesCustomerSuppliedBarcode = usesCustomerSuppliedBarcode;
		this.usesBookmarcSuppliedBarcode = usesBookmarcSuppliedBarcode;
		this.length = length;
	}

}