/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerBillingApiController {

	@Autowired
	CustomerBillingApiService service;
	
	@BQ("invoices")
	@Process.ExecutePost
	public BianResponse<CustomerBillingInvoiceBaseWithIdAndRoot> executePostInvoices(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingInvoiceWithBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostInvoices(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("invoices")
	@Process.ExecutePut
	public BianResponse<CustomerBillingInvoiceBaseWithIdAndRoot> executePutInvoices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBillingInvoiceWithBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutInvoices(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.ExecutePost
	public BianResponse<CustomerBillingPaymentsBaseWithIdAndRoot> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingPaymentsBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.ExecutePut
	public BianResponse<CustomerBillingPaymentsBaseWithIdAndRoot> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBillingPaymentsBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CustomerBillingRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<CustomerBillingBillingBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<CustomerBillingBillingBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@BQ("reminders")
	@Process.RequestPost
	public BianResponse<CustomerBillingRemindersBaseWithIdAndRoot> requestPostReminders(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingRemindersBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.requestPostReminders(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reminders")
	@Process.RequestPut
	public BianResponse<CustomerBillingRemindersBaseWithIdAndRoot> requestPutReminders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBillingRemindersBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.requestPutReminders(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<CustomerBillingBillingBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingBillingBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.Retrieve
	public BianResponse<CustomerBillingBillingBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("invoices")
	@Process.Retrieve
	public BianResponse<CustomerBillingInvoiceBaseWithIdAndRoot> retrieveInvoices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInvoices(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Process.Retrieve
	public BianResponse<CustomerBillingPaymentsBaseWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@BQ("reminders")
	@Process.Retrieve
	public BianResponse<CustomerBillingRemindersBaseWithIdAndRoot> retrieveReminders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReminders(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<CustomerBillingReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("trackings")
	@Process.Retrieve
	public BianResponse<CustomerBillingTrackingBaseWithIdAndRoot> retrieveTrackings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTrackings(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Process.Update
	public BianResponse<CustomerBillingBillingBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBillingBillingBaseWithRoot> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
