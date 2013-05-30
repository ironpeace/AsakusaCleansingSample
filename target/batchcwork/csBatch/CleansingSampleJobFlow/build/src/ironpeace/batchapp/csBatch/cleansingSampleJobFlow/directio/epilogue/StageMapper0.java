package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 */
public final class StageMapper0 extends AbstractDirectOutputMapper<OriginalData> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}