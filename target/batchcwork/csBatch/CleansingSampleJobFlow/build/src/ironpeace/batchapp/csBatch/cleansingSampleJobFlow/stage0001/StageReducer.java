package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.Rendezvous;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import com.asakusafw.runtime.flow.SegmentedReducer;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
/**
 * ステージ1の処理を担当するレデュースプログラム。
 */
@SuppressWarnings("deprecation") public final class StageReducer extends SegmentedReducer<ShuffleKey, ShuffleValue, 
        NullWritable, NullWritable> {
    private RuntimeResourceManager runtimeResourceManager;
    private StageOutputDriver outputs;
    private ReduceFragment3 rendezvous;
    private ReduceFragment4 rendezvous0;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        this.outputs = new StageOutputDriver(context);
        final Result<DataA> output = outputs.getResultSink("result0");
        this.rendezvous = new ReduceFragment3(output);
        final Result<DataB> output0 = outputs.getResultSink("result10");
        this.rendezvous0 = new ReduceFragment4(output0);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.outputs.close();
        this.outputs = null;
        this.rendezvous = null;
        this.rendezvous0 = null;
    }
    @Override protected Rendezvous<ShuffleValue> getRendezvous(ShuffleKey nextKey) {
        switch(nextKey.getSegmentId()) {
            case 1:
                return this.rendezvous;
            case 2:
                return this.rendezvous0;
            default:
                throw new AssertionError();
        }
    }
}