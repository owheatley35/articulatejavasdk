package articulatesdk.components;

import articulatesdk.ArticulateListComponent;
import articulatesdk.ComponentType;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class VerticalTableComponent extends ArticulateListComponent {

    private final List<List<String>> headers = new ArrayList<>();
    private final List<List<String>> rows = new ArrayList<>();
    private final int headerCount;

    public VerticalTableComponent(final List<String> headers) {
        super(ComponentType.VERTICAL_TABLE);
        this.headers.add(headers);
        this.addList(ComponentKeyConstants.TABLE_HEADERS, this.headers);
        this.headerCount = headers.size();
        this.addComponentValue(ComponentKeyConstants.TEMP, ComponentKeyConstants.TEMP);
    }

    public void addRow(final List<String> row) {
        if (row.size() != this.headerCount) {return;}
        this.rows.add(row);
    }

    @Override
    public JSONObject renderAsJson() {
        this.addList(ComponentKeyConstants.TABLE_ROW_CONTENT, this.rows);
        return super.renderAsJson();
    }
}
