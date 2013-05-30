package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.DataB;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
/**
 * {@code dataB->CleansingSampleOperator.joinDataAandB(operator#1696446139)}へのシャッフル処理を担当するプログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapOutputFragment2 implements Result<DataB> {
    private final TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector;
    private final ShuffleKey key = new ShuffleKey();
    private final ShuffleValue value = new ShuffleValue();
    /**
     * インスタンスを生成する。
     * @param collector 実際の出力先
     */
    public MapOutputFragment2(TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector) {
        this.collector = collector;
    }
    @Override public void add(DataB result) {
        this.key.setPort2(result);
        this.value.setPort2(result);
        try {
            this.collector.write(this.key, this.value);
        }
        catch(Exception exception) {
            throw new Result.OutputException(exception);
        }
    }
}