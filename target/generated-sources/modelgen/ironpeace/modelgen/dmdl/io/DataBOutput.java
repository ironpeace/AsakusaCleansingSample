package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.DataB;
import java.io.IOException;
/**
 * <code>data_b</code>をTSVなどのレコード形式で出力する。
 */
public final class DataBOutput implements ModelOutput<DataB> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public DataBOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(DataB model) throws IOException {
        emitter.emit(model.getUseridOption());
        emitter.emit(model.getDataB0Option());
        emitter.emit(model.getDataB1Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}