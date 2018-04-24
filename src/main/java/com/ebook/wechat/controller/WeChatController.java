package com.ebook.wechat.controller;

import com.ebook.chapter01.log.LogService;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/23
 * @Email zengxiangcai@yishufu.com
 * 微信公众号
 ****/
@RequestMapping("/wechat")
@RestController
public class WeChatController {

    private static final Logger logger = LogManager.getLogger(LogService.class);

    @RequestMapping("/message")
    public String autoMessage(HttpServletRequest request) {
        //微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp，nonce参数
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");

        try {
            logger.info("signature=" + signature + "|timestamp=" + timestamp);
        } catch (Exception e) {
            logger.error("err", e);
        }
        return echostr;
    }
}
