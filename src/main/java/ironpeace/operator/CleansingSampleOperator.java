package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.Joineddata;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import ironpeace.modelgen.dmdl.model.OriginalDataB;

import java.util.List;

import com.asakusafw.runtime.core.Result;
import com.asakusafw.vocabulary.model.Key;
import com.asakusafw.vocabulary.operator.GroupSort;
import com.asakusafw.vocabulary.operator.MasterJoin;

public abstract class CleansingSampleOperator {

	@GroupSort
	public void groupedA(
			@Key(group="userid")
			List<OriginalDataA> odList,
			Result<DataA> result
			){
		DataA dataA = new DataA();

		long a0 = 0;
		long a1 = 0;

		for(OriginalDataA od : odList){
			if(201204 <= od.getTerm() && od.getTerm() < 201303){
				a0 += od.getDataA();
			}else if(201104 <= od.getTerm() && od.getTerm() < 201203){
				a1 += od.getDataA();
			}else{
				//do nothing
			}
		}
		
		dataA.setUserid(odList.get(0).getUserid());
		dataA.setDataA0(a0);
		dataA.setDataA1(a1);
		
		result.add(dataA);
	}

	@GroupSort
	public void groupedB(
			@Key(group="userid")
			List<OriginalDataB> odList,
			Result<DataB> result
			){
		DataB dataB = new DataB();

		long b0 = 0;
		long b1 = 0;

		for(OriginalDataB od : odList){
			if(201204 <= od.getTerm() && od.getTerm() < 201303){
				b0 += od.getDataB();
			}else if(201104 <= od.getTerm() && od.getTerm() < 201203){
				b1 += od.getDataB();
			}else{
				//do nothing
			}
		}
		
		dataB.setUserid(odList.get(0).getUserid());
		dataB.setDataB0(b0);
		dataB.setDataB1(b1);
		
		result.add(dataB);
	}
	
	@MasterJoin
	public abstract Joineddata joinDataAandB(DataA dataA, DataB dataB);

}
