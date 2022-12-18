package articulatesdk;

public enum ComponentType {
    PARAGRAPH_ONE,
    HEADER_ONE,
    SUB_TITLE,
    HEADER_TWO,
    BOX_IMAGE,
    PLAIN_TITLE,
    VERTICAL_TABLE;

    public String getFormattedToken() {
        return this.name().toLowerCase().replace("_", "-");
    }
}
