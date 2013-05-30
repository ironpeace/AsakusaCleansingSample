package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractOriginalDataCsvOutputDescription;

public class OriginalDataToCSV extends AbstractOriginalDataCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "ironpeace/cs/output/";
	}

	@Override
	public String getResourcePattern() {
		return "originaldata.csv";
	}
}
