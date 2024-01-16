package labelFactories;

import labels.Label;
import labels.ProxyLabel;

public class ProxyLabelFactory implements LabelFactory {
    public Label createLabel() {
        return new ProxyLabel();
    }
}
