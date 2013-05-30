package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ArrayListBuffer;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import ironpeace.operator.CleansingSampleOperatorImpl;
/**
 * {@code [odList->CleansingSampleOperator.groupedA(operator#328588635)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment3 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<DataA> result;
    private ArrayListBuffer<OriginalDataA> list = new ArrayListBuffer<OriginalDataA>();
    private CleansingSampleOperatorImpl op = new CleansingSampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param result {@code CleansingSampleOperator.groupedA#result}への出力
     */
    public ReduceFragment3(Result<DataA> result) {
        this.result = result;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.list.begin();
    }
    @Override public void end() {
        this.list.end();
        this.op.groupedA(this.list, this.result);
        this.list.shrink();
    }
    private void process0001(OriginalDataA value) {
        if(this.list.isExpandRequired()) {
            this.list.expand(new OriginalDataA());
            this.list.advance().copyFrom(value);
        }
        else {
            this.list.advance().copyFrom(value);
        }
    }
}