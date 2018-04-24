package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/24
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class RequestorChainFactory {

    public static SupportHandler getHandlerChain() {
        AbstractSupportHandler technicalSupport = new TechnicalSupportHandler(
            SupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupport = new BillingSupportHandler(SupportHandler.BILLING);
        AbstractSupportHandler generalSupport = new GeneralSupportHandler(SupportHandler.GENERAL);
        technicalSupport.setNextHandler(billingSupport);
        billingSupport.setNextHandler(generalSupport);
        return technicalSupport;
    }
}
