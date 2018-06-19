package com.ebook.chapter03.designpattern.structural.proxy;

/*****
 * @Author zean
 * Created at 2018/4/20
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ReportGeneratorImplProxy implements ReportGenerator {

    private ReportGenerator reportGenerator;
    private String accessRole;

    public ReportGeneratorImplProxy(String accessRole) {
        //this.reportGenerator = generator;
        this.accessRole = accessRole;
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {
        System.err.println(
            "ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat
                + " format with " + reportEntries + "entries");
    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        if(reportGenerator == null){
            reportGenerator = new ReportGeneratorImpl();
        }
        reportGenerator.generateComplexReport(reportFormat,reportEntries);
    }

    @Override
    public void generateSensitiveReport() {
        if(!"Manager".equals(accessRole)){
            System.err.println( "You are not authorized to access sensitive reports.");
            return;
        }
        if(reportGenerator==null){
            reportGenerator = new ReportGeneratorImpl();
        }
        reportGenerator.generateSensitiveReport();
    }
}
