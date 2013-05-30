package ironpeace.operator;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.Joineddata;
import javax.annotation.Generated;
/**
 * {@link CleansingSampleOperator}に関する演算子実装クラス。
 */
@Generated("OperatorImplementationClassGenerator:0.0.1") public class CleansingSampleOperatorImpl extends 
        CleansingSampleOperator {
    /**
     * インスタンスを生成する。
     */
    public CleansingSampleOperatorImpl() {
        return;
    }
    @Override public Joineddata joinDataAandB(DataA dataA, DataB dataB) {
        throw new UnsupportedOperationException("マスタ結合演算子は組み込みの方法で処理されます");
    }
}