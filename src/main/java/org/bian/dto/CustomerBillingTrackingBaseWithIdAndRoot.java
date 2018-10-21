package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBillingTrackingBaseWithIdAndRoot
 */
public class CustomerBillingTrackingBaseWithIdAndRoot   {
  private String customerBillingTrackingActivityReference = null;

  private String customerBillingTransactionReference = null;

  private String customerReference = null;

  private String customerBillingInvoiceReference = null;

  private String billingAmount = null;

  private String paymentDueDate = null;

  private String paymentDetails = null;

  private String paymentTransactionReference = null;

  private String customerBillingTransactionInvoiceStatus = null;

  private Object customerBillingTrackingActivityResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBillingTrackingActivityReference
  **/

  public String getCustomerBillingTrackingActivityReference() {
    return customerBillingTrackingActivityReference;
  }

  public void setCustomerBillingTrackingActivityReference(String customerBillingTrackingActivityReference) {
    this.customerBillingTrackingActivityReference = customerBillingTrackingActivityReference;
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
   * @return customerBillingInvoiceReference
  **/

  public String getCustomerBillingInvoiceReference() {
    return customerBillingInvoiceReference;
  }

  public void setCustomerBillingInvoiceReference(String customerBillingInvoiceReference) {
    this.customerBillingInvoiceReference = customerBillingInvoiceReference;
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
   * @return customerBillingTrackingActivityResult
  **/

  public Object getCustomerBillingTrackingActivityResult() {
    return customerBillingTrackingActivityResult;
  }

  public void setCustomerBillingTrackingActivityResult(Object customerBillingTrackingActivityResult) {
    this.customerBillingTrackingActivityResult = customerBillingTrackingActivityResult;
  }


}

