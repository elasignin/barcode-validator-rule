package com.ingramcontent.consolidated.labels.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BarcodeDetail implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.ingramcontent.consolidated.labels.model.BarcodeValidator barcodeValidator;
	private com.ingramcontent.consolidated.labels.model.ToteInformation toteInformation;

	public BarcodeDetail() {
	}

	public com.ingramcontent.consolidated.labels.model.BarcodeValidator getBarcodeValidator() {
		return this.barcodeValidator;
	}

	public void setBarcodeValidator(
			com.ingramcontent.consolidated.labels.model.BarcodeValidator barcodeValidator) {
		this.barcodeValidator = barcodeValidator;
	}

	public com.ingramcontent.consolidated.labels.model.ToteInformation getToteInformation() {
		return this.toteInformation;
	}

	public void setToteInformation(
			com.ingramcontent.consolidated.labels.model.ToteInformation toteInformation) {
		this.toteInformation = toteInformation;
	}

	public BarcodeDetail(
			com.ingramcontent.consolidated.labels.model.BarcodeValidator barcodeValidator,
			com.ingramcontent.consolidated.labels.model.ToteInformation toteInformation) {
		this.barcodeValidator = barcodeValidator;
		this.toteInformation = toteInformation;
	}

}