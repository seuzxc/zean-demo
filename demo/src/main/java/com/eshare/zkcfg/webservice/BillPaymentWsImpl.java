package com.eshare.zkcfg.webservice;

import com.eshare.zkcfg.webservice.response.CIMB3RdPartyEchoRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyEchoRs;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyInquiryRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyInquiryRs;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyPaymentRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyPaymentRs;
import javax.jws.WebService;

/*****
 * @Author zengxiangcai
 * Created at 2018/6/13
 * @Email zengxiangcai@yishufu.com
 *
 ****/


@WebService(targetNamespace = "http://localhost/BillPaymentWS", name = "BillPaymentServiceSoap", serviceName = "BillPaymentService")
public class BillPaymentWsImpl implements BillPaymentWS {


    @Override
    public CIMB3RdPartyInquiryRs inquiry(CIMB3RdPartyInquiryRq request) {
        return new CIMB3RdPartyInquiryRs();
    }

    @Override
    public CIMB3RdPartyPaymentRs payment(CIMB3RdPartyPaymentRq request) {
        return new CIMB3RdPartyPaymentRs();
    }

    @Override
    public CIMB3RdPartyEchoRs echoTest(CIMB3RdPartyEchoRq request) {
        return new CIMB3RdPartyEchoRs();
    }
}
