package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
/**
 * An abstract implementation of {@link OriginalDataB} importer description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataBCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends OriginalDataB> getModelType() {
        return OriginalDataB.class;
    }
    @Override public Class<OriginalDataBCsvFormat> getFormat() {
        return OriginalDataBCsvFormat.class;
    }
}