package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBillingRemindersBaseWithRoot
 */
public class CustomerBillingRemindersBaseWithRoot   {
  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private String billingStatement = null;

  private String billingAmount = null;

  private String paymentDueDate = null;

  private String customerBillingTransactionInvoiceStatus = null;

  private Object customerBillingReminderActivityResult = null;


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
   * @return customerBillingReminderActivityResult
  **/

  public Object getCustomerBillingReminderActivityResult() {
    return customerBillingReminderActivityResult;
  }

  public void setCustomerBillingReminderActivityResult(Object customerBillingReminderActivityResult) {
    this.customerBillingReminderActivityResult = customerBillingReminderActivityResult;
  }


}

