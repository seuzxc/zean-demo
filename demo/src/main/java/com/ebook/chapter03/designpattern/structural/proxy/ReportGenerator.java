package com.ebook.chapter03.designpattern.structural.proxy;

/*****
 * @Author zean
 * Created at 2018/4/20
 * @Email zxc200706@hotmail.com
 *
 ****/

public interface ReportGenerator {
    void displayReportTemplate(String reportFormat,int reportEntries);
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
