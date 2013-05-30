package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.Joineddata;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>joineddata</code>を読み出す
 */
public final class JoineddataInput implements ModelInput<Joineddata> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public JoineddataInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(Joineddata model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getUseridOption());
        parser.fill(model.getDataA0Option());
        parser.fill(model.getDataA1Option());
        parser.fill(model.getDataB0Option());
        parser.fill(model.getDataB1Option());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}