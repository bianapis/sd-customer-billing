package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBillingPaymentsBaseWithIdAndRoot
 */
public class CustomerBillingPaymentsBaseWithIdAndRoot   {
  private String customerBillingPaymentsReference = null;

  private String customerBillingTransactionReference = null;

  private String customerReference = null;

  private String billingAmount = null;

  private String paymentDueDate = null;

  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private String customerBillingTransactionInvoiceStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBillingPaymentsReference
  **/

  public String getCustomerBillingPaymentsReference() {
    return customerBillingPaymentsReference;
  }

  public void setCustomerBillingPaymentsReference(String customerBillingPaymentsReference) {
    this.customerBillingPaymentsReference = customerBillingPaymentsReference;
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
   * @return paymentTransaction
  **/

  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
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


}

