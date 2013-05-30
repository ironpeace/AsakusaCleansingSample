package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.Joineddata;
/**
 * {@code 
         * [dataA->CleansingSampleOperator.joinDataAandB(operator#1696446139), dataB->CleansingSampleOperator.joinDataAandB(operator#1696446139)]
         * }の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment3 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<Joineddata> joined;
    private final Result<DataB> missed;
    private boolean sawMaster;
    private DataA cache = new DataA();
    private Joineddata cache0 = new Joineddata();
    /**
     * インスタンスを生成する。
     * @param joined {@code CleansingSampleOperator.joinDataAandB#joined}への出力
     * @param missed {@code CleansingSampleOperator.joinDataAandB#missed}への出力
     */
    public ReduceFragment3(Result<Joineddata> joined, Result<DataB> missed) {
        this.joined = joined;
        this.missed = missed;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            case 2:
                this.process0002(value.getPort2());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.sawMaster = false;
    }
    @Override public void end() {
    }
    private void process0001(DataA value) {
        if(this.sawMaster == false) {
            this.cache.copyFrom(value);
            this.sawMaster = true;
        }
    }
    private void process0002(DataB value) {
        if(this.sawMaster) {
            this.cache0.reset();
            this.cache0.setUseridOption(this.cache.getUseridOption());
            this.cache0.setDataA0Option(this.cache.getDataA0Option());
            this.cache0.setDataA1Option(this.cache.getDataA1Option());
            this.cache0.setDataB0Option(value.getDataB0Option());
            this.cache0.setDataB1Option(value.getDataB1Option());
            this.joined.add(this.cache0);
        }
        else {
            this.missed.add(value);
        }
    }
}