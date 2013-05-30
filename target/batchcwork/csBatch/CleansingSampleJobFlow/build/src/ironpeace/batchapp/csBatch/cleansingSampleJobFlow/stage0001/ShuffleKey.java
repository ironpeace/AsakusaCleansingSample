package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#1シャッフルで利用するKeyクラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleKey implements SegmentedWritable {
    /**
     * シャッフルフェーズを通した演算子のポート番号。
     */
    public int portId = -1;
    @Override public int getSegmentId() {
        return this.portId;
    }
    /**
     * CleansingSampleOperator.groupedA#odListが利用するキー (userid)
     */
    public StringOption groupElem0Term1 = new StringOption();
    /**
     * CleansingSampleOperator.groupedB#odListが利用するキー (userid)
     */
    public StringOption groupElem1Term1 = new StringOption();
    /**
     * CleansingSampleOperator.groupedA#odListのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort1(OriginalDataA source) {
        this.portId = 1;
        this.groupElem0Term1.copyFrom(source.getUseridOption());
    }
    /**
     * CleansingSampleOperator.groupedB#odListのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort2(OriginalDataB source) {
        this.portId = 2;
        this.groupElem1Term1.copyFrom(source.getUseridOption());
    }
    /**
     * 指定のキーのグループ情報をこのオブジェクトに複製する
     * @param original コピーするキー
     */
    public void copyGroupFrom(ShuffleKey original) {
        this.portId = original.portId;
        if(this.portId < 0) {
            return;
        }
        switch(this.portId) {
            case 1:
                this.groupElem0Term1.copyFrom(original.groupElem0Term1);
                break;
            case 2:
                this.groupElem1Term1.copyFrom(original.groupElem1Term1);
                break;
            default:
                throw new AssertionError(this.portId = original.portId);
        }
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.portId) {
            case 1:
                out.writeInt(1);
                this.groupElem0Term1.write(out);
                break;
            case 2:
                out.writeInt(2);
                this.groupElem1Term1.write(out);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.portId = in.readInt();
        switch(this.portId) {
            case 1:
                this.groupElem0Term1.readFields(in);
                break;
            case 2:
                this.groupElem1Term1.readFields(in);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
}