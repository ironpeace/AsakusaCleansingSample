package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.Joineddata;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 * {@code [in->project(operator#1908393212)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment4 implements Result<Joineddata> {
    private final Result<OriginalData> out;
    private OriginalData cache = new OriginalData();
    /**
     * インスタンスを生成する。
     * @param out {@code project#out}への出力
     */
    public MapFragment4(Result<OriginalData> out) {
        this.out = out;
    }
    @Override public void add(Joineddata result) {
        this.cache.reset();
        this.cache.setUseridOption(result.getUseridOption());
        this.cache.setDataA0Option(result.getDataA0Option());
        this.cache.setDataA1Option(result.getDataA1Option());
        this.cache.setDataB0Option(result.getDataB0Option());
        this.cache.setDataB1Option(result.getDataB1Option());
        this.out.add(this.cache);
    }
}