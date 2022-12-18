package articulatesdk;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticulateListComponent extends ArticulateComponent {
    private static final String LISTS_KEY = "lists";

    private final Map<String, List<List<String>>> lists = new HashMap<>();

    public ArticulateListComponent(final ComponentType type) {
        super(type);
    }

    public void addList(final String key, List<List<String>> list) {
        this.lists.put(key, list);
    }

    @Override
    public JSONObject renderAsJson() {
        JSONObject initial = super.renderAsJson();
        JSONObject listsJSON = new JSONObject();

        this.lists.forEach((String key, List<List<String>>list) -> {
            try {
                listsJSON.put(key, list);
            } catch (JSONException ignored) {}
        });

        try {
            initial.put(LISTS_KEY, listsJSON);
        } catch (JSONException ignored) {}

        return initial;
    }
}
