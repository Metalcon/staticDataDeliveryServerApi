package de.metalcon.sdd.api.requests;

public class SddUpdateRelsRequest extends SddRequest {

    private static final long serialVersionUID = 4188092801600553290L;

    private long id;

    private String type;

    private String attr;

    private long[] rels;

    public SddUpdateRelsRequest(
            long id,
            String type,
            String attr,
            long[] rels) {
        super();
        this.id = id;
        this.type = type;
        this.attr = attr;
        this.rels = rels;
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

    public long[] getRels() {
        return rels;
    }

}
