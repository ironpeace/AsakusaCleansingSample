package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
/**
 * {@code [in->padding(pseud#1202547531)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<OriginalDataB> {
    private final Result<OriginalDataB> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<OriginalDataB> out) {
        this.out = out;
    }
    @Override public void add(OriginalDataB result) {
        this.out.add(result);
    }
}