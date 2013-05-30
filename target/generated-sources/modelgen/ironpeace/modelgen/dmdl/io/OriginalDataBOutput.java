package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
import java.io.IOException;
/**
 * <code>original_data_b</code>をTSVなどのレコード形式で出力する。
 */
public final class OriginalDataBOutput implements ModelOutput<OriginalDataB> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public OriginalDataBOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(OriginalDataB model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getUseridOption());
        emitter.emit(model.getTermOption());
        emitter.emit(model.getDataBOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}