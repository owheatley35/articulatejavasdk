package articulatesdk;

import org.json.JSONObject;

public class ArticulateTemplate {
    private final JSONObject templateJson;
    private final String renderedTemplateString;

    public ArticulateTemplate(final JSONObject templateJson) {
        this.templateJson = templateJson;
        this.renderedTemplateString = templateJson.toString();
    }

    public String getRenderedTemplateString() {
        return this.renderedTemplateString;
    }

    public JSONObject getTemplateJson() {
        return this.templateJson;
    }
}
