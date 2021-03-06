package interfaces;

public interface FileReader {
	void scanDir(String path);
	interfaces.ReportSummary parseSummary();
	interfaces.TestCase parseNextTest();
	
	boolean hasNextTest();
	void setFlag(String flag);
	void setOption(String option, String value);
}