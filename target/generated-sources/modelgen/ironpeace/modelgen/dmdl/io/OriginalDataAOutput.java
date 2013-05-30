package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import java.io.IOException;
/**
 * <code>original_data_a</code>をTSVなどのレコード形式で出力する。
 */
public final class OriginalDataAOutput implements ModelOutput<OriginalDataA> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public OriginalDataAOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(OriginalDataA model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getUseridOption());
        emitter.emit(model.getTermOption());
        emitter.emit(model.getDataAOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}