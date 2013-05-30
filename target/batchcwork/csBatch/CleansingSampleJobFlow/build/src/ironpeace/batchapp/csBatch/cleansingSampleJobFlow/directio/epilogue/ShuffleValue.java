package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputValue;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.OriginalDataCsvFormat;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 */
public final class ShuffleValue extends AbstractDirectOutputValue {
    /**
     * Creates a new instance.
     */
    public ShuffleValue() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(OriginalData.class, "ironpeace/cs/output/", 
                    OriginalDataCsvFormat.class, Naming0001.class, Ordering0001.class)});
    }
}