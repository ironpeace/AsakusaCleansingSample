package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.Joineddata;
import java.io.IOException;
/**
 * <code>joineddata</code>をTSVなどのレコード形式で出力する。
 */
public final class JoineddataOutput implements ModelOutput<Joineddata> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public JoineddataOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(Joineddata model) throws IOException {
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