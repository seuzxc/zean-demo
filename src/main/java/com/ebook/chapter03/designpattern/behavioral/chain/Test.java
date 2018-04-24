package com.ebook.chapter03.designpattern.behavioral.chain;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/23
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url ="https://www.shshhe.com/banka/form?bankCode=03070000&bankName=%E5%B9%B3%E5%AE%89%E9%93%B6%E8%A1%8C&bankURL=https%3A%2F%2Fc.pingan.com%2Fca%2Findex%3Fsign%3D1e5d16bfec8effe4cf349a71ace066fa%26versionNo%3DR10310%26scc%3D950000763%26channel%3DWX%26onlineSQFlag%3DN%26isDisplayRecommend%3DN%26isDisplaySales%3DN%26ccp%3D1a2a3a4a5a7a8a9a10a11a12a13a15a16a20a21a30ap3at4&m=f3de8e70bd0fa4cf1cec69ef5d0f0c01&qd=&cy=&mode=&uid=&token=";
        String decode = URLDecoder.decode(url, "UTF-8");
        System.err.println(decode);
//
//        String url2 = "https://www.shshhe.com/banka/form?bankCode=03030000&bankName=%E5%85%89%E5%A4%A7%E9%93%B6%E8%A1%8C&bankURL=https%3A%2F%2Fxyk.cebbank.com%2Fcebmms%2Fapply%2Fps%2Fcard-list.htm%3Flevel%3D124%26pro_code%3DFHTG067632SJ296SHCY&m=f3de8e70bd0fa4cf1cec69ef5d0f0c01&qd=&cy=&mode=&uid=&token=";
//
//        String decode2 = URLDecoder.decode(url2, "UTF-8");
//        System.err.println("\n" + decode2);
    }
}
