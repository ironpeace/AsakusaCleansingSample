package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.DataA;
import java.io.IOException;
/**
 * <code>data_a</code>をTSVなどのレコード形式で出力する。
 */
public final class DataAOutput implements ModelOutput<DataA> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public DataAOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(DataA model) throws IOException {
        emitter.emit(model.getUseridOption());
        emitter.emit(model.getDataA0Option());
        emitter.emit(model.getDataA1Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}