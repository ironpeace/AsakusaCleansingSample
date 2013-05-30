package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractOriginalDataACsvInputDescription;

public class OriginalDataAfromCSV extends AbstractOriginalDataACsvInputDescription {

	@Override
	public String getBasePath() {
		return "ironpeace/cs/input/";
	}

	@Override
	public String getResourcePattern() {
		return "originaldataA_*.csv";
	}

}
