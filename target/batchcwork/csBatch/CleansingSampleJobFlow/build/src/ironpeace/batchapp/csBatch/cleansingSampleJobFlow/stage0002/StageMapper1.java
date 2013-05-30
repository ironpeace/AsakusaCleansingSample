package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import ironpeace.modelgen.dmdl.model.DataB;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code [in->padding(pseud#1562645223){owner=FlowBlock&#64;1511627065}]}の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper1 extends Mapper<NullWritable, DataB, ShuffleKey, 
        ShuffleValue> {
    private DataB cache = new DataB();
    private RuntimeResourceManager runtimeResourceManager;
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        final MapOutputFragment2 shuffle0 = new MapOutputFragment2(context);
        this.line = new MapFragment1(shuffle0);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}