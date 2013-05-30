package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.DataA;
/**
 * {@code [in->padding(pseud#1491010616)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment2 implements Result<DataA> {
    private final Result<DataA> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment2(Result<DataA> out) {
        this.out = out;
    }
    @Override public void add(DataA result) {
        this.out.add(result);
    }
}