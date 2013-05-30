package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.OriginalDataB;
/**
 * An abstract implementation of {@link OriginalDataB} exporter description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataBCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends OriginalDataB> getModelType() {
        return OriginalDataB.class;
    }
    @Override public Class<OriginalDataBCsvFormat> getFormat() {
        return OriginalDataBCsvFormat.class;
    }
}