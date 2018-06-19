package com.eshare.zkcfg.webservice;

import com.eshare.zkcfg.webservice.response.CIMB3RdPartyEchoRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyEchoRs;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyInquiryRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyInquiryRs;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyPaymentRq;
import com.eshare.zkcfg.webservice.response.CIMB3RdPartyPaymentRs;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/*****
 * @Author zengxiangcai
 * Created at 2018/6/13
 * @Email zengxiangcai@yishufu.com
 *
 ****/


@WebService
public interface BillPaymentWS {

    @WebMethod(operationName = "inqueryOperation",action = "zxc.action")
    @WebResult(name = "inquirySoapOut",partName = "inquirySoapOutpart")
    CIMB3RdPartyInquiryRs inquiry(@WebParam(name = "inquiryabc",partName = "inquiryPart") CIMB3RdPartyInquiryRq request);

    @WebMethod
    CIMB3RdPartyPaymentRs payment(CIMB3RdPartyPaymentRq request);

    @WebMethod
    CIMB3RdPartyEchoRs echoTest(CIMB3RdPartyEchoRq request);
}
