package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.flow.SegmentedWritable;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#2シャッフルで利用するKeyクラス。
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
     * CleansingSampleOperator.joinDataAandB#dataAが利用するキー (userid)
     */
    public StringOption groupElem0Term1 = new StringOption();
    /**
     * CleansingSampleOperator.joinDataAandB#dataAのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort1(DataA source) {
        this.portId = 1;
        this.groupElem0Term1.copyFrom(source.getUseridOption());
    }
    /**
     * CleansingSampleOperator.joinDataAandB#dataBのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort2(DataB source) {
        this.portId = 2;
        this.groupElem0Term1.copyFrom(source.getUseridOption());
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
            case 2:
                this.groupElem0Term1.copyFrom(original.groupElem0Term1);
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
                this.groupElem0Term1.write(out);
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
                this.groupElem0Term1.readFields(in);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
}