package articulatesdk.components;

import articulatesdk.ArticulateComponent;
import articulatesdk.ComponentType;

public class ParagraphComponent extends ArticulateComponent {
    public ParagraphComponent(final String paragraphString) {
        super(ComponentType.PARAGRAPH_ONE);
        this.addComponentValue(ComponentKeyConstants.PARAGRAPH_TEXT, paragraphString);
    }
}
