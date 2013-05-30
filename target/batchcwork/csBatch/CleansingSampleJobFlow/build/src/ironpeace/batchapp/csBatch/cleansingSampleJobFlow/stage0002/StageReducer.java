package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.Rendezvous;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import com.asakusafw.runtime.flow.SegmentedReducer;
import com.asakusafw.runtime.flow.VoidResult;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.OriginalData;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
/**
 * ステージ2の処理を担当するレデュースプログラム。
 */
@SuppressWarnings("deprecation") public final class StageReducer extends SegmentedReducer<ShuffleKey, ShuffleValue, 
        NullWritable, NullWritable> {
    private RuntimeResourceManager runtimeResourceManager;
    private StageOutputDriver outputs;
    private ReduceFragment3 rendezvous;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        this.outputs = new StageOutputDriver(context);
        final Result<OriginalData> output = outputs.getResultSink("result0");
        final MapFragment4 line = new MapFragment4(output);
        this.rendezvous = new ReduceFragment3(line, new VoidResult<DataB>());
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.outputs.close();
        this.outputs = null;
        this.rendezvous = null;
    }
    @Override protected Rendezvous<ShuffleValue> getRendezvous(ShuffleKey nextKey) {
        switch(nextKey.getSegmentId()) {
            case 1:
            case 2:
                return this.rendezvous;
            default:
                throw new AssertionError();
        }
    }
}