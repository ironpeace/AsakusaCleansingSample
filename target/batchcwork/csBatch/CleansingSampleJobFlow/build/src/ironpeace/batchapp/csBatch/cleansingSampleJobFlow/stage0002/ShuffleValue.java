package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import com.asakusafw.runtime.flow.SegmentedWritable;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#2シャッフルで利用する値クラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleValue implements SegmentedWritable {
    /**
     * セグメント番号。
     */
    public int segmentId = -1;
    @Override public int getSegmentId() {
        return this.segmentId;
    }
    /**
     * CleansingSampleOperator.joinDataAandB#dataAが利用するモデル (1)。
     */
    public DataA port0001 = new DataA();
    /**
     * CleansingSampleOperator.joinDataAandB#dataBが利用するモデル (2)。
     */
    public DataB port0002 = new DataB();
    /**
     * CleansingSampleOperator.joinDataAandB#dataAのモデルオブジェクトを返す。
     */
    public DataA getPort1() {
        if(this.segmentId != 1) throw new AssertionError();
        return this.port0001;
    }
    /**
     * CleansingSampleOperator.joinDataAandB#dataAで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort1(DataA model) {
        this.segmentId = 1;
        this.port0001.copyFrom(model);
    }
    /**
     * CleansingSampleOperator.joinDataAandB#dataBのモデルオブジェクトを返す。
     */
    public DataB getPort2() {
        if(this.segmentId != 2) throw new AssertionError();
        return this.port0002;
    }
    /**
     * CleansingSampleOperator.joinDataAandB#dataBで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort2(DataB model) {
        this.segmentId = 2;
        this.port0002.copyFrom(model);
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.segmentId) {
            case 1:
                out.writeInt(1);
                this.port0001.write(out);
                break;
            case 2:
                out.writeInt(2);
                this.port0002.write(out);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.segmentId = in.readInt();
        switch(this.segmentId) {
            case 1:
                this.port0001.readFields(in);
                break;
            case 2:
                this.port0002.readFields(in);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
}