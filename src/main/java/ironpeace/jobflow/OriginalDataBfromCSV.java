package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractOriginalDataBCsvInputDescription;

public class OriginalDataBfromCSV extends
		AbstractOriginalDataBCsvInputDescription {

	@Override
	public String getBasePath() {
		return "ironpeace/cs/input/";
	}

	@Override
	public String getResourcePattern() {
		return "originaldataB_*.csv";
	}

}
