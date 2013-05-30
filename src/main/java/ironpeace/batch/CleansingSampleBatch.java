package ironpeace.batch;

import ironpeace.jobflow.CleansingSampleJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="csBatch")
public class CleansingSampleBatch extends BatchDescription {

	@Override
	protected void describe() {
		run(CleansingSampleJobFlow.class).soon();
	}

}
