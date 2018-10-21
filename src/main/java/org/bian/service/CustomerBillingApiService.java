/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBillingApiService {

	CustomerBillingInvoiceBaseWithIdAndRoot executePostInvoices(String crReferenceId, CustomerBillingInvoiceWithBase request);
	
	CustomerBillingInvoiceBaseWithIdAndRoot executePutInvoices(String crReferenceId, String bqReferenceId, CustomerBillingInvoiceWithBase request);
	
	CustomerBillingPaymentsBaseWithIdAndRoot executePostPayments(String crReferenceId, CustomerBillingPaymentsBaseWithRoot request);
	
	CustomerBillingPaymentsBaseWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, CustomerBillingPaymentsBaseWithRoot request);
	
	CustomerBillingRecordResponse record(String crReferenceId, CustomerBillingRecordRequest request);
	
	CustomerBillingBillingBaseWithIdAndRoot requestPost(CustomerBillingBillingBaseWithRoot request);
	
	CustomerBillingRemindersBaseWithIdAndRoot requestPostReminders(String crReferenceId, CustomerBillingRemindersBaseWithRoot request);
	
	CustomerBillingRemindersBaseWithIdAndRoot requestPutReminders(String crReferenceId, String bqReferenceId, CustomerBillingRemindersBaseWithRoot request);
	
	CustomerBillingBillingBaseWithIdAndRoot requestPut(String crReferenceId, CustomerBillingBillingBaseWithRoot request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerBillingBillingBaseWithIdAndRoot retrieve(String crReferenceId);
	
	CustomerBillingInvoiceBaseWithIdAndRoot retrieveInvoices(String crReferenceId, String bqReferenceId);
	
	CustomerBillingPaymentsBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	CustomerBillingRemindersBaseWithIdAndRoot retrieveReminders(String crReferenceId, String bqReferenceId);
	
	CustomerBillingReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	CustomerBillingTrackingBaseWithIdAndRoot retrieveTrackings(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CustomerBillingBillingBaseWithIdAndRoot update(String crReferenceId, CustomerBillingBillingBaseWithRoot request);
	
}
