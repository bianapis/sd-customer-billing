package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBillingReportingBaseWithIdAndRoot
 */
public class CustomerBillingReportingBaseWithIdAndRoot   {
  private String customerBillingReportingReference = null;

  private String customerBillingTransactionReference = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String billedProductServiceActionDescription = null;

  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private String billingStatement = null;

  private String billingAmount = null;

  private String paymentDueDate = null;

  private String paymentDetails = null;

  private String paymentTransactionReference = null;

  private String customerBillingTransactionInvoiceStatus = null;

  private Object customerBillingReportingResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBillingReportingReference
  **/

  public String getCustomerBillingReportingReference() {
    return customerBillingReportingReference;
  }

  public void setCustomerBillingReportingReference(String customerBillingReportingReference) {
    this.customerBillingReportingReference = customerBillingReportingReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBillingTransactionReference
  **/

  public String getCustomerBillingTransactionReference() {
    return customerBillingTransactionReference;
  }

  public void setCustomerBillingTransactionReference(String customerBillingTransactionReference) {
    this.customerBillingTransactionReference = customerBillingTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return billedProductServiceActionDescription
  **/

  public String getBilledProductServiceActionDescription() {
    return billedProductServiceActionDescription;
  }

  public void setBilledProductServiceActionDescription(String billedProductServiceActionDescription) {
    this.billedProductServiceActionDescription = billedProductServiceActionDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name 
   * @return billingParty
  **/

  public String getBillingParty() {
    return billingParty;
  }

  public void setBillingParty(String billingParty) {
    this.billingParty = billingParty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return billingAddress
  **/

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return billingPeriod
  **/

  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return billingStatement
  **/

  public String getBillingStatement() {
    return billingStatement;
  }

  public void setBillingStatement(String billingStatement) {
    this.billingStatement = billingStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return billingAmount
  **/

  public String getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return paymentDueDate
  **/

  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return paymentDetails
  **/

  public String getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(String paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBillingTransactionInvoiceStatus
  **/

  public String getCustomerBillingTransactionInvoiceStatus() {
    return customerBillingTransactionInvoiceStatus;
  }

  public void setCustomerBillingTransactionInvoiceStatus(String customerBillingTransactionInvoiceStatus) {
    this.customerBillingTransactionInvoiceStatus = customerBillingTransactionInvoiceStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerBillingReportingResult
  **/

  public Object getCustomerBillingReportingResult() {
    return customerBillingReportingResult;
  }

  public void setCustomerBillingReportingResult(Object customerBillingReportingResult) {
    this.customerBillingReportingResult = customerBillingReportingResult;
  }


}

