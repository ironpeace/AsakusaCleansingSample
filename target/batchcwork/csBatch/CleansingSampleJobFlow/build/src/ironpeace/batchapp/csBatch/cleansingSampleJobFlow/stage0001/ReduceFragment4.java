package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ArrayListBuffer;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
import ironpeace.operator.CleansingSampleOperatorImpl;
/**
 * {@code [odList->CleansingSampleOperator.groupedB(operator#1699295490)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment4 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<DataB> result;
    private ArrayListBuffer<OriginalDataB> list = new ArrayListBuffer<OriginalDataB>();
    private CleansingSampleOperatorImpl op = new CleansingSampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param result {@code CleansingSampleOperator.groupedB#result}への出力
     */
    public ReduceFragment4(Result<DataB> result) {
        this.result = result;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 2:
                this.process0002(value.getPort2());
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
        this.op.groupedB(this.list, this.result);
        this.list.shrink();
    }
    private void process0002(OriginalDataB value) {
        if(this.list.isExpandRequired()) {
            this.list.expand(new OriginalDataB());
            this.list.advance().copyFrom(value);
        }
        else {
            this.list.advance().copyFrom(value);
        }
    }
}