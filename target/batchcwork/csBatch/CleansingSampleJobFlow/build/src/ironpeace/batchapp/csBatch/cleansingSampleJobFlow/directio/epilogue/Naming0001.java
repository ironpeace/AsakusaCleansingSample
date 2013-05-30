package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 * A naming output "od" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "originaldata.csv"));
    }
    @Override public void set(Object rawObject) {
        OriginalData object = (OriginalData) rawObject;
    }
}