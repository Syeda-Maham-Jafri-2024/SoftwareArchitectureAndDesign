public interface IReportGenerator
{
    void GenerateReport(string data);
}

public class PDFReportGenerator : IReportGenerator
{
    public void GenerateReport(string data)
    {
        // Generate PDF report
    }
}

public class ExcelReportGenerator : IReportGenerator
{
    public void GenerateReport(string data)
    {
        // Generate Excel report
    }
}

public class HTMLReportGenerator : IReportGenerator
{
    public void GenerateReport(string data)
    {
        // Generate HTML report
    }
}

public class ReportService
{
    private readonly IReportGenerator reportGenerator;
    
    public ReportService(IReportGenerator reportGenerator)
    {
        this.reportGenerator = reportGenerator;
    }
    
    public void GenerateReport(string data)
    {
        reportGenerator.GenerateReport(data);
    }
}

// Client code
IReportGenerator reportGenerator = new PDFReportGenerator(); // Or new ExcelReportGenerator(), new HTMLReportGenerator()
ReportService reportService = new ReportService(reportGenerator);
reportService.GenerateReport("Report data");
