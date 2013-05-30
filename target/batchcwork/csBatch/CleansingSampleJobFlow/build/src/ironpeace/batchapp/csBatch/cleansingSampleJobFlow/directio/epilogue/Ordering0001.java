package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 * An ordering output "od" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        OriginalData object = (OriginalData) rawObject;
    }
}