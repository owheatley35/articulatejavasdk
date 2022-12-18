package articulatesdk.components;

import articulatesdk.ArticulateComponent;
import articulatesdk.ComponentType;

public class SubTitleComponent extends ArticulateComponent {
    public SubTitleComponent(final String titleText) {
        super(ComponentType.SUB_TITLE);
        this.addComponentValue(ComponentKeyConstants.TITLE_TEXT, titleText);
    }
}
