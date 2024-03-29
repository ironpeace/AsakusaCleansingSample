package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.OriginalData;
import java.io.IOException;
/**
 * <code>original_data</code>をTSVなどのレコード形式で出力する。
 */
public final class OriginalDataOutput implements ModelOutput<OriginalData> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public OriginalDataOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(OriginalData model) throws IOException {
        emitter.emit(model.getUseridOption());
        emitter.emit(model.getDataA0Option());
        emitter.emit(model.getDataA1Option());
        emitter.emit(model.getDataB0Option());
        emitter.emit(model.getDataB1Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}