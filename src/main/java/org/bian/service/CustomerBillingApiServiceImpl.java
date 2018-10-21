/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBillingApiServiceImpl implements CustomerBillingApiService {

	public CustomerBillingInvoiceBaseWithIdAndRoot executePostInvoices(String crReferenceId, CustomerBillingInvoiceWithBase request){
		return JsonReader.read("executePost-CustomerBillingInvoiceBaseWithIdAndRoot.json",new TypeReference<CustomerBillingInvoiceBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingInvoiceBaseWithIdAndRoot executePutInvoices(String crReferenceId, String bqReferenceId, CustomerBillingInvoiceWithBase request){
		return JsonReader.read("executePut-CustomerBillingInvoiceBaseWithIdAndRoot.json",new TypeReference<CustomerBillingInvoiceBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingPaymentsBaseWithIdAndRoot executePostPayments(String crReferenceId, CustomerBillingPaymentsBaseWithRoot request){
		return JsonReader.read("executePost-CustomerBillingPaymentsBaseWithIdAndRoot.json",new TypeReference<CustomerBillingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingPaymentsBaseWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, CustomerBillingPaymentsBaseWithRoot request){
		return JsonReader.read("executePut-CustomerBillingPaymentsBaseWithIdAndRoot.json",new TypeReference<CustomerBillingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingRecordResponse record(String crReferenceId, CustomerBillingRecordRequest request){
		return JsonReader.read("record-CustomerBillingRecordResponse.json",new TypeReference<CustomerBillingRecordResponse>(){});
	}
	
	public CustomerBillingBillingBaseWithIdAndRoot requestPost(CustomerBillingBillingBaseWithRoot request){
		return JsonReader.read("requestPost-CustomerBillingBillingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingBillingBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingRemindersBaseWithIdAndRoot requestPostReminders(String crReferenceId, CustomerBillingRemindersBaseWithRoot request){
		return JsonReader.read("requestPost-CustomerBillingRemindersBaseWithIdAndRoot.json",new TypeReference<CustomerBillingRemindersBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingRemindersBaseWithIdAndRoot requestPutReminders(String crReferenceId, String bqReferenceId, CustomerBillingRemindersBaseWithRoot request){
		return JsonReader.read("requestPut-CustomerBillingRemindersBaseWithIdAndRoot.json",new TypeReference<CustomerBillingRemindersBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingBillingBaseWithIdAndRoot requestPut(String crReferenceId, CustomerBillingBillingBaseWithRoot request){
		return JsonReader.read("requestPut-CustomerBillingBillingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingBillingBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerBillingBillingBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerBillingBillingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingBillingBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingInvoiceBaseWithIdAndRoot retrieveInvoices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBillingInvoiceBaseWithIdAndRoot.json",new TypeReference<CustomerBillingInvoiceBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingPaymentsBaseWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBillingPaymentsBaseWithIdAndRoot.json",new TypeReference<CustomerBillingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingRemindersBaseWithIdAndRoot retrieveReminders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBillingRemindersBaseWithIdAndRoot.json",new TypeReference<CustomerBillingRemindersBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBillingReportingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingReportingBaseWithIdAndRoot>(){});
	}
	
	public CustomerBillingTrackingBaseWithIdAndRoot retrieveTrackings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBillingTrackingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingTrackingBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerBillingBillingBaseWithIdAndRoot update(String crReferenceId, CustomerBillingBillingBaseWithRoot request){
		return JsonReader.read("update-CustomerBillingBillingBaseWithIdAndRoot.json",new TypeReference<CustomerBillingBillingBaseWithIdAndRoot>(){});
	}
	
}
