package articulatesdk;

import org.json.JSONException;
import org.json.JSONObject;

public class ArticulateComponent implements JsonRenderable {

    private static final String TYPE_KEY = "type";
    private static final String CONTENT_KEY = "content";

    private final ComponentType type;
    private JSONObject content = new JSONObject();

    public ArticulateComponent(final ComponentType type) {
        this.type = type;
    }

    protected void addComponentValue(final String key, final String value) {
        try {
            this.content.put(key, value);
        } catch (JSONException ignored) {}
    }

    public JSONObject renderAsJson() {
        JSONObject json = new JSONObject();

        try {
            json.put(TYPE_KEY, this.type.getFormattedToken());
            json.put(CONTENT_KEY, this.content);
        } catch (JSONException ignored) {}

        return json;
    }

}
