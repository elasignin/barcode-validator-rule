package com.ingramcontent.consolidated.labels.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BarcodeValidator implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String barcodeShip;
	private java.lang.String barcode;
	private java.lang.String toteBarcode;

	private boolean doNotPrint;

	public BarcodeValidator() {
	}

	public java.lang.String getBarcodeShip() {
		return this.barcodeShip;
	}

	public void setBarcodeShip(java.lang.String barcodeShip) {
		this.barcodeShip = barcodeShip;
	}

	public java.lang.String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(java.lang.String barcode) {
		this.barcode = barcode;
	}

	public java.lang.String getToteBarcode() {
		return this.toteBarcode;
	}

	public void setToteBarcode(java.lang.String toteBarcode) {
		this.toteBarcode = toteBarcode;
	}

	public boolean isDoNotPrint() {
		return this.doNotPrint;
	}

	public void setDoNotPrint(boolean doNotPrint) {
		this.doNotPrint = doNotPrint;
	}

	public BarcodeValidator(java.lang.String barcodeShip,
			java.lang.String barcode, java.lang.String toteBarcode,
			boolean doNotPrint) {
		this.barcodeShip = barcodeShip;
		this.barcode = barcode;
		this.toteBarcode = toteBarcode;
		this.doNotPrint = doNotPrint;
	}

}