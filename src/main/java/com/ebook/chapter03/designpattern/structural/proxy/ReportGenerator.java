package com.ebook.chapter03.designpattern.structural.proxy;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/20
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public interface ReportGenerator {
    void displayReportTemplate(String reportFormat,int reportEntries);
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
