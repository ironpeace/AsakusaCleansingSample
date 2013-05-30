package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.LongOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.OriginalDataInput;
import ironpeace.modelgen.dmdl.io.OriginalDataOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * original_dataを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(OriginalDataInput.class)@ModelOutputLocation(OriginalDataOutput.class)@
        PropertyOrder({"userid", "data_a_0", "data_a_1", "data_b_0", "data_b_1"}) public class OriginalData implements 
        DataModel<OriginalData>, Writable {
    private final StringOption userid = new StringOption();
    private final LongOption dataA0 = new LongOption();
    private final LongOption dataA1 = new LongOption();
    private final LongOption dataB0 = new LongOption();
    private final LongOption dataB1 = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.userid.setNull();
        this.dataA0.setNull();
        this.dataA1.setNull();
        this.dataB0.setNull();
        this.dataB1.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(OriginalData other) {
        this.userid.copyFrom(other.userid);
        this.dataA0.copyFrom(other.dataA0);
        this.dataA1.copyFrom(other.dataA1);
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
     * dataA0を返す。
     * @return dataA0
     * @throws NullPointerException dataA0の値が<code>null</code>である場合
     */
    public long getDataA0() {
        return this.dataA0.get();
    }
    /**
     * dataA0を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataA0(long value) {
        this.dataA0.modify(value);
    }
    /**
     * <code>null</code>を許すdataA0を返す。
     * @return dataA0
     */
    public LongOption getDataA0Option() {
        return this.dataA0;
    }
    /**
     * dataA0を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataA0Option(LongOption option) {
        this.dataA0.copyFrom(option);
    }
    /**
     * dataA1を返す。
     * @return dataA1
     * @throws NullPointerException dataA1の値が<code>null</code>である場合
     */
    public long getDataA1() {
        return this.dataA1.get();
    }
    /**
     * dataA1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataA1(long value) {
        this.dataA1.modify(value);
    }
    /**
     * <code>null</code>を許すdataA1を返す。
     * @return dataA1
     */
    public LongOption getDataA1Option() {
        return this.dataA1;
    }
    /**
     * dataA1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataA1Option(LongOption option) {
        this.dataA1.copyFrom(option);
    }
    /**
     * dataB0を返す。
     * @return dataB0
     * @throws NullPointerException dataB0の値が<code>null</code>である場合
     */
    public long getDataB0() {
        return this.dataB0.get();
    }
    /**
     * dataB0を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataB0(long value) {
        this.dataB0.modify(value);
    }
    /**
     * <code>null</code>を許すdataB0を返す。
     * @return dataB0
     */
    public LongOption getDataB0Option() {
        return this.dataB0;
    }
    /**
     * dataB0を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataB0Option(LongOption option) {
        this.dataB0.copyFrom(option);
    }
    /**
     * dataB1を返す。
     * @return dataB1
     * @throws NullPointerException dataB1の値が<code>null</code>である場合
     */
    public long getDataB1() {
        return this.dataB1.get();
    }
    /**
     * dataB1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataB1(long value) {
        this.dataB1.modify(value);
    }
    /**
     * <code>null</code>を許すdataB1を返す。
     * @return dataB1
     */
    public LongOption getDataB1Option() {
        return this.dataB1;
    }
    /**
     * dataB1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataB1Option(LongOption option) {
        this.dataB1.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=original_data");
        result.append(", userid=");
        result.append(this.userid);
        result.append(", dataA0=");
        result.append(this.dataA0);
        result.append(", dataA1=");
        result.append(this.dataA1);
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
        result = prime * result + dataA0.hashCode();
        result = prime * result + dataA1.hashCode();
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
        OriginalData other = (OriginalData) obj;
        if(this.userid.equals(other.userid) == false) {
            return false;
        }
        if(this.dataA0.equals(other.dataA0) == false) {
            return false;
        }
        if(this.dataA1.equals(other.dataA1) == false) {
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
        dataA0.write(out);
        dataA1.write(out);
        dataB0.write(out);
        dataB1.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        userid.readFields(in);
        dataA0.readFields(in);
        dataA1.readFields(in);
        dataB0.readFields(in);
        dataB1.readFields(in);
    }
}