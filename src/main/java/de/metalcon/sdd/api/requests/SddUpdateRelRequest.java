package de.metalcon.sdd.api.requests;

public class SddUpdateRelRequest extends SddRequest {

    private static final long serialVersionUID = 4188092801600553290L;

    private long id;

    private String type;

    private String attr;

    private long rel;

    public SddUpdateRelRequest(
            long id,
            String type,
            String attr,
            long rel) {
        super();
        this.id = id;
        this.type = type;
        this.attr = attr;
        this.rel = rel;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAttr() {
        return attr;
    }

    public long getRel() {
        return rel;
    }

}
