package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.DataB;
/**
 * {@code [in->padding(pseud#1562645223)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<DataB> {
    private final Result<DataB> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<DataB> out) {
        this.out = out;
    }
    @Override public void add(DataB result) {
        this.out.add(result);
    }
}