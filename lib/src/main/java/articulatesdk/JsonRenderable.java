package articulatesdk;

import org.json.JSONException;
import org.json.JSONObject;

public interface JsonRenderable {
    JSONObject renderAsJson() throws JSONException;
}
