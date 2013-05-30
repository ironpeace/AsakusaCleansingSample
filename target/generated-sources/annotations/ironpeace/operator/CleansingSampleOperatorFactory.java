package ironpeace.operator;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowBoundary;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.flow.graph.ShuffleKey;
import com.asakusafw.vocabulary.flow.processor.InputBuffer;
import com.asakusafw.vocabulary.operator.CoGroup;
import com.asakusafw.vocabulary.operator.MasterJoin;
import ironpeace.modelgen.dmdl.model.DataA;
import ironpeace.modelgen.dmdl.model.DataB;
import ironpeace.modelgen.dmdl.model.Joineddata;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
/**
 * {@link CleansingSampleOperator}に関する演算子ファクトリークラス。
 * @see CleansingSampleOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1") public class CleansingSampleOperatorFactory {
    /**
     */
    public static final class JoinDataAandB implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<Joineddata> joined;
        /**
         * 結合に失敗したデータ
         */
        public final Source<DataB> missed;
        JoinDataAandB(Source<DataA> dataA, Source<DataB> dataB) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(MasterJoin.class);
            builder.declare(CleansingSampleOperator.class, CleansingSampleOperatorImpl.class, "joinDataAandB");
            builder.declareParameter(DataA.class);
            builder.declareParameter(DataB.class);
            builder.addInput("dataA", dataA, new ShuffleKey(Arrays.asList(new String[]{"userid"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addInput("dataB", dataB, new ShuffleKey(Arrays.asList(new String[]{"userid"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addOutput("joined", Joineddata.class);
            builder.addOutput("missed", dataB);
            builder.addAttribute(FlowBoundary.SHUFFLE);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("dataA", dataA);
            this.$.resolveInput("dataB", dataB);
            this.joined = this.$.resolveOutput("joined");
            this.missed = this.$.resolveOutput("missed");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public CleansingSampleOperatorFactory.JoinDataAandB as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param dataA
     * @param dataB
     * @return 生成した演算子オブジェクト
     * @see CleansingSampleOperator#joinDataAandB(DataA, DataB)
     */
    public CleansingSampleOperatorFactory.JoinDataAandB joinDataAandB(Source<DataA> dataA, Source<DataB> dataB) {
        return new CleansingSampleOperatorFactory.JoinDataAandB(dataA, dataB);
    }
    /**
     */
    public static final class GroupedA implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<DataA> result;
        GroupedA(Source<OriginalDataA> odList) {
            OperatorDescription.Builder builder0 = new OperatorDescription.Builder(CoGroup.class);
            builder0.declare(CleansingSampleOperator.class, CleansingSampleOperatorImpl.class, "groupedA");
            builder0.declareParameter(List.class);
            builder0.declareParameter(Result.class);
            builder0.addInput("odList", odList, new ShuffleKey(Arrays.asList(new String[]{"userid"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder0.addOutput("result", DataA.class);
            builder0.addAttribute(FlowBoundary.SHUFFLE);
            builder0.addAttribute(ObservationCount.DONT_CARE);
            builder0.addAttribute(InputBuffer.EXPAND);
            this.$ = builder0.toResolver();
            this.$.resolveInput("odList", odList);
            this.result = this.$.resolveOutput("result");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName0 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public CleansingSampleOperatorFactory.GroupedA as(String newName0) {
            this.$.setName(newName0);
            return this;
        }
    }
    /**
     * @param odList
     * @return 生成した演算子オブジェクト
     * @see CleansingSampleOperator#groupedA(List, Result)
     */
    public CleansingSampleOperatorFactory.GroupedA groupedA(Source<OriginalDataA> odList) {
        return new CleansingSampleOperatorFactory.GroupedA(odList);
    }
    /**
     */
    public static final class GroupedB implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<DataB> result;
        GroupedB(Source<OriginalDataB> odList) {
            OperatorDescription.Builder builder1 = new OperatorDescription.Builder(CoGroup.class);
            builder1.declare(CleansingSampleOperator.class, CleansingSampleOperatorImpl.class, "groupedB");
            builder1.declareParameter(List.class);
            builder1.declareParameter(Result.class);
            builder1.addInput("odList", odList, new ShuffleKey(Arrays.asList(new String[]{"userid"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder1.addOutput("result", DataB.class);
            builder1.addAttribute(FlowBoundary.SHUFFLE);
            builder1.addAttribute(ObservationCount.DONT_CARE);
            builder1.addAttribute(InputBuffer.EXPAND);
            this.$ = builder1.toResolver();
            this.$.resolveInput("odList", odList);
            this.result = this.$.resolveOutput("result");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName1 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public CleansingSampleOperatorFactory.GroupedB as(String newName1) {
            this.$.setName(newName1);
            return this;
        }
    }
    /**
     * @param odList
     * @return 生成した演算子オブジェクト
     * @see CleansingSampleOperator#groupedB(List, Result)
     */
    public CleansingSampleOperatorFactory.GroupedB groupedB(Source<OriginalDataB> odList) {
        return new CleansingSampleOperatorFactory.GroupedB(odList);
    }
}