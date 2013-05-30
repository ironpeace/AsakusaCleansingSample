package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.OriginalDataCsvFormat;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(OriginalData.class, "ironpeace/cs/output/", 
                    OriginalDataCsvFormat.class, Naming0001.class, Ordering0001.class)});
    }
}