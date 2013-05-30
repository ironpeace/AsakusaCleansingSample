package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.LongOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.OriginalDataAInput;
import ironpeace.modelgen.dmdl.io.OriginalDataAOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * OriginalDataAを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(OriginalDataAInput.class)@ModelOutputLocation(OriginalDataAOutput.class)@
        PropertyOrder({"keycode", "userid", "term", "data_a"}) public class OriginalDataA implements DataModel<
        OriginalDataA>, Writable {
    private final IntOption keycode = new IntOption();
    private final StringOption userid = new StringOption();
    private final IntOption term = new IntOption();
    private final LongOption dataA = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.userid.setNull();
        this.term.setNull();
        this.dataA.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(OriginalDataA other) {
        this.keycode.copyFrom(other.keycode);
        this.userid.copyFrom(other.userid);
        this.term.copyFrom(other.term);
        this.dataA.copyFrom(other.dataA);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public int getKeycode() {
        return this.keycode.get();
    }
    /**
     * keycodeを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycode(int value) {
        this.keycode.modify(value);
    }
    /**
     * <code>null</code>を許すkeycodeを返す。
     * @return keycode
     */
    public IntOption getKeycodeOption() {
        return this.keycode;
    }
    /**
     * keycodeを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setKeycodeOption(IntOption option) {
        this.keycode.copyFrom(option);
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
     * termを返す。
     * @return term
     * @throws NullPointerException termの値が<code>null</code>である場合
     */
    public int getTerm() {
        return this.term.get();
    }
    /**
     * termを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setTerm(int value) {
        this.term.modify(value);
    }
    /**
     * <code>null</code>を許すtermを返す。
     * @return term
     */
    public IntOption getTermOption() {
        return this.term;
    }
    /**
     * termを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setTermOption(IntOption option) {
        this.term.copyFrom(option);
    }
    /**
     * dataAを返す。
     * @return dataA
     * @throws NullPointerException dataAの値が<code>null</code>である場合
     */
    public long getDataA() {
        return this.dataA.get();
    }
    /**
     * dataAを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataA(long value) {
        this.dataA.modify(value);
    }
    /**
     * <code>null</code>を許すdataAを返す。
     * @return dataA
     */
    public LongOption getDataAOption() {
        return this.dataA;
    }
    /**
     * dataAを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataAOption(LongOption option) {
        this.dataA.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=original_data_a");
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", userid=");
        result.append(this.userid);
        result.append(", term=");
        result.append(this.term);
        result.append(", dataA=");
        result.append(this.dataA);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + keycode.hashCode();
        result = prime * result + userid.hashCode();
        result = prime * result + term.hashCode();
        result = prime * result + dataA.hashCode();
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
        OriginalDataA other = (OriginalDataA) obj;
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.userid.equals(other.userid) == false) {
            return false;
        }
        if(this.term.equals(other.term) == false) {
            return false;
        }
        if(this.dataA.equals(other.dataA) == false) {
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
        keycode.write(out);
        userid.write(out);
        term.write(out);
        dataA.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        userid.readFields(in);
        term.readFields(in);
        dataA.readFields(in);
    }
}