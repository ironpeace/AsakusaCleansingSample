package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
import ironpeace.operator.CleansingSampleOperatorFactory;
import ironpeace.operator.CleansingSampleOperatorFactory.GroupedA;
import ironpeace.operator.CleansingSampleOperatorFactory.GroupedB;
import ironpeace.operator.CleansingSampleOperatorFactory.JoinDataAandB;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Project;

@JobFlow(name="CleansingSampleJobFlow")
public class CleansingSampleJobFlow extends FlowDescription {
	
	final In<OriginalDataA> odA;
	final In<OriginalDataB> odB;
	final Out<OriginalData> od;
	final CoreOperatorFactory cp = new CoreOperatorFactory();
	
	public CleansingSampleJobFlow(
			@Import(name="a", description=OriginalDataAfromCSV.class)
			In<OriginalDataA> odA,
			@Import(name="b", description=OriginalDataBfromCSV.class)
			In<OriginalDataB> odB,
			@Export(name="od", description=OriginalDataToCSV.class)
			Out<OriginalData> od
			){
		this.odA = odA;
		this.odB = odB;
		this.od = od;
	}

	@Override
	protected void describe() {
		
		CleansingSampleOperatorFactory op
			= new CleansingSampleOperatorFactory();
		
		GroupedA groupedA = op.groupedA(odA);
		
		GroupedB groupedB = op.groupedB(odB);
		
		JoinDataAandB joinedData
			= op.joinDataAandB(groupedA.result, groupedB.result);
		cp.stop(joinedData.missed);
		
		Project<OriginalData> originaldata
			= cp.project(joinedData.joined, OriginalData.class);
		
		this.od.add(originaldata);
	}

}
