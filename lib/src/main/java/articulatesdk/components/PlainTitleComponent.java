package articulatesdk.components;

import articulatesdk.ArticulateComponent;
import articulatesdk.ComponentType;

public class PlainTitleComponent extends ArticulateComponent {
    public PlainTitleComponent(final String titleText) {
        super(ComponentType.PLAIN_TITLE);
        this.addComponentValue(ComponentKeyConstants.TITLE_TEXT, titleText);
    }
}
