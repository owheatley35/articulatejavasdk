package articulatesdk.components;

import articulatesdk.ArticulateComponent;
import articulatesdk.ComponentType;

public class HeaderOneComponent extends ArticulateComponent {

    public HeaderOneComponent(final String headerText,
                              final String imageUrl,
                              final String imageCaption,
                              final String imageAltText,
                              final String subHeaderText,
                              final String subParaText,
                              final String articleType) {
        super(ComponentType.HEADER_ONE);
        this.addComponentValue(ComponentKeyConstants.HEADER_TEXT, headerText);
        this.addComponentValue(ComponentKeyConstants.ARTICLE_TYPE, articleType);
        this.addComponentValue(ComponentKeyConstants.IMAGE_URL, imageUrl);
        this.addComponentValue(ComponentKeyConstants.IMAGE_CAPTION, imageCaption);
        this.addComponentValue(ComponentKeyConstants.IMAGE_ALT_TEXT, imageAltText);
        this.addComponentValue(ComponentKeyConstants.SUBHEADER_TEXT, subHeaderText);
        this.addComponentValue(ComponentKeyConstants.SUB_PARA_TEXT, subParaText);
    }
}
