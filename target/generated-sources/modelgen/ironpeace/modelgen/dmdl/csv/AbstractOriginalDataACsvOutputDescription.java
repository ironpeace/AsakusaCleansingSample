package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
/**
 * An abstract implementation of {@link OriginalDataA} exporter description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataACsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends OriginalDataA> getModelType() {
        return OriginalDataA.class;
    }
    @Override public Class<OriginalDataACsvFormat> getFormat() {
        return OriginalDataACsvFormat.class;
    }
}