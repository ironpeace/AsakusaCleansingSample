package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.OriginalDataA;
/**
 * An abstract implementation of {@link OriginalDataA} importer description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataACsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends OriginalDataA> getModelType() {
        return OriginalDataA.class;
    }
    @Override public Class<OriginalDataACsvFormat> getFormat() {
        return OriginalDataACsvFormat.class;
    }
}