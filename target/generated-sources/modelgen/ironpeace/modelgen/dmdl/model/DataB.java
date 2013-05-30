package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.LongOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.DataBInput;
import ironpeace.modelgen.dmdl.io.DataBOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * DataBを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(DataBInput.class)@ModelOutputLocation(DataBOutput.class)@PropertyOrder({
            "userid", "data_b_0", "data_b_1"}) public class DataB implements DataModel<DataB>, Writable {
    private final StringOption userid = new StringOption();
    private final LongOption dataB0 = new LongOption();
    private final LongOption dataB1 = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.userid.setNull();
        this.dataB0.setNull();
        this.dataB1.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(DataB other) {
        this.userid.copyFrom(other.userid);
        this.dataB0.copyFrom(other.dataB0);
        this.dataB1.copyFrom(other.dataB1);
    }
    /**
     * useridを返す。
     * @return userid
     * @throws NullPointerException useridの値が<code>null</code>である場合
     */
    public Text getUserid() {
        return this.userid.get();
    }
    /**
     * useridを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setUserid(Text value) {
        this.userid.modify(value);
    }
    /**
     * <code>null</code>を許すuseridを返す。
     * @return userid
     */
    public StringOption getUseridOption() {
        return this.userid;
    }
    /**
     * useridを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setUseridOption(StringOption option) {
        this.userid.copyFrom(option);
    }
    /**
     * data_b_0を返す。
     * @return data_b_0
     * @throws NullPointerException data_b_0の値が<code>null</code>である場合
     */
    public long getDataB0() {
        return this.dataB0.get();
    }
    /**
     * data_b_0を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataB0(long value) {
        this.dataB0.modify(value);
    }
    /**
     * <code>null</code>を許すdata_b_0を返す。
     * @return data_b_0
     */
    public LongOption getDataB0Option() {
        return this.dataB0;
    }
    /**
     * data_b_0を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataB0Option(LongOption option) {
        this.dataB0.copyFrom(option);
    }
    /**
     * data_b_1を返す。
     * @return data_b_1
     * @throws NullPointerException data_b_1の値が<code>null</code>である場合
     */
    public long getDataB1() {
        return this.dataB1.get();
    }
    /**
     * data_b_1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataB1(long value) {
        this.dataB1.modify(value);
    }
    /**
     * <code>null</code>を許すdata_b_1を返す。
     * @return data_b_1
     */
    public LongOption getDataB1Option() {
        return this.dataB1;
    }
    /**
     * data_b_1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataB1Option(LongOption option) {
        this.dataB1.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=data_b");
        result.append(", userid=");
        result.append(this.userid);
        result.append(", dataB0=");
        result.append(this.dataB0);
        result.append(", dataB1=");
        result.append(this.dataB1);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + userid.hashCode();
        result = prime * result + dataB0.hashCode();
        result = prime * result + dataB1.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        DataB other = (DataB) obj;
        if(this.userid.equals(other.userid) == false) {
            return false;
        }
        if(this.dataB0.equals(other.dataB0) == false) {
            return false;
        }
        if(this.dataB1.equals(other.dataB1) == false) {
            return false;
        }
        return true;
    }
    /**
     * useridを返す。
     * @return userid
     * @throws NullPointerException useridの値が<code>null</code>である場合
     */
    public String getUseridAsString() {
        return this.userid.getAsString();
    }
    /**
     * useridを設定する。
     * @param userid0 設定する値
     */
    @SuppressWarnings("deprecation") public void setUseridAsString(String userid0) {
        this.userid.modify(userid0);
    }
    @Override public void write(DataOutput out) throws IOException {
        userid.write(out);
        dataB0.write(out);
        dataB1.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        userid.readFields(in);
        dataB0.readFields(in);
        dataB1.readFields(in);
    }
}