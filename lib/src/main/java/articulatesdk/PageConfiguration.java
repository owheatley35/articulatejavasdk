package articulatesdk;

public class PageConfiguration {
    private final String pageTitle;
    private final String pageDescription;

    public PageConfiguration() {
        this.pageTitle = null;
        this.pageDescription = null;
    }

    public PageConfiguration(final String pageTitle, final String pageDescription) {
        this.pageTitle = pageTitle;
        this.pageDescription = pageDescription;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getPageDescription() {
        return pageDescription;
    }
}
