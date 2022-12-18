package articulatesdk;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArticulateTemplateBuilder {

    // Constant Keys
    private static final String LANGUAGE_KEY = "language";
    private static final String VERSION_KEY = "version";
    private static final String COMPONENTS_KEY = "components";
    private static final String PAGE_CONFIG_KEY = "page-config";
    private static final String PAGE_TITLE_KEY = "page-title";
    private static final String PAGE_DESCRIPTION_KEY = "page-description";

    // Constant Values
    private static final String ARTICULATE_VALUE = "articulate";
    private final List<ArticulateComponent> components = new ArrayList<>();
    private String articulateVersion;
    private PageConfiguration pageConfiguration;

    public ArticulateTemplateBuilder(String articulateVersion) {
        this.articulateVersion = articulateVersion;
        this.pageConfiguration = new PageConfiguration();

    }

    public ArticulateTemplateBuilder(String articulateVersion, PageConfiguration pageConfiguration) {
        this.articulateVersion = articulateVersion;
        this.pageConfiguration = pageConfiguration;
    }

    public void setArticulateVersion(final String articulateVersion) {
        this.articulateVersion = articulateVersion;
    }

    public void setPageConfiguration(final PageConfiguration pageConfiguration) {
        this.pageConfiguration = pageConfiguration;
    }

    public void addComponent(final ArticulateComponent articulateComponent) {
        this.components.add(articulateComponent);
    }

    public void addComponents(final List<ArticulateComponent> articulateComponent) {
        this.components.addAll(articulateComponent);
    }

    public ArticulateTemplate build() {
        final JSONObject json = new JSONObject();

        try {
            // Initial Requirements
            json.put(PAGE_CONFIG_KEY, new JSONObject()
                    .put(PAGE_TITLE_KEY, this.pageConfiguration.getPageTitle())
                    .put(PAGE_DESCRIPTION_KEY, this.pageConfiguration.getPageDescription())
            );
            json.put(VERSION_KEY, this.articulateVersion);
            json.put(LANGUAGE_KEY, ARTICULATE_VALUE);

            // Components
            List<JSONObject> componentsJsonList = new ArrayList<>(Collections.emptyList());

            components.forEach((ArticulateComponent component) -> {
                componentsJsonList.add(component.renderAsJson());
            });

            json.put(COMPONENTS_KEY, componentsJsonList);
        } catch (JSONException ignored) {}

        return new ArticulateTemplate(json);
    }
}
