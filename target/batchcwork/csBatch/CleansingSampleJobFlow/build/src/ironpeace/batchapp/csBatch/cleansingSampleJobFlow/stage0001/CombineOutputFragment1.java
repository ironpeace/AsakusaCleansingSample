package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
/**
 * {@code odList->CleansingSampleOperator.groupedA(operator#328588635)}へのシャッフル処理を担当するプログラムの断片。
 */
@SuppressWarnings("deprecation") public final class CombineOutputFragment1 implements Result<OriginalDataA> {
    private final TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector;
    private final ShuffleKey key = new ShuffleKey();
    private final ShuffleValue value = new ShuffleValue();
    /**
     * インスタンスを生成する。
     * @param collector 実際の出力先
     */
    public CombineOutputFragment1(TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector) {
        this.collector = collector;
    }
    @Override public void add(OriginalDataA result) {
        this.key.setPort1(result);
        this.value.setPort1(result);
        try {
            this.collector.write(this.key, this.value);
        }
        catch(Exception exception) {
            throw new Result.OutputException(exception);
        }
    }
}