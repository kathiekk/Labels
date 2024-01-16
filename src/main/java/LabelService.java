import labelFactories.LabelFactory;
import labels.Label;

public class LabelService {
    private LabelFactory labelFactory;

    public LabelService(LabelFactory labelFactory) {
        this.labelFactory = labelFactory;
    }

    public Label createLabel() {
        return labelFactory.createLabel();
    }
}