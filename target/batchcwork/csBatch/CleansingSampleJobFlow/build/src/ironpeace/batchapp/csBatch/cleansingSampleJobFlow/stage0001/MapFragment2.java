package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
/**
 * {@code [in->padding(pseud#1884473012)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment2 implements Result<OriginalDataA> {
    private final Result<OriginalDataA> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment2(Result<OriginalDataA> out) {
        this.out = out;
    }
    @Override public void add(OriginalDataA result) {
        this.out.add(result);
    }
}