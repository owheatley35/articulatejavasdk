package articulatesdk.components;

import articulatesdk.ArticulateComponent;
import articulatesdk.ComponentType;

public class BoxImageComponent extends ArticulateComponent {

    /**
     * Box Image Component - `box-image`
     * <p>
     * Generates a large Image with a caption.
     *
     * @param imageUrl Image URL as String
     * @param imageCaption Caption to display below the image
     * @param imageAltText Alternative text to display when the image is not available
     */
    public BoxImageComponent(final String imageUrl, final String imageCaption, final String imageAltText) {
        super(ComponentType.BOX_IMAGE);
        this.addComponentValue(ComponentKeyConstants.IMAGE_URL, imageUrl);
        this.addComponentValue(ComponentKeyConstants.IMAGE_CAPTION, imageCaption);
        this.addComponentValue(ComponentKeyConstants.IMAGE_ALT_TEXT, imageAltText);
    }
}
