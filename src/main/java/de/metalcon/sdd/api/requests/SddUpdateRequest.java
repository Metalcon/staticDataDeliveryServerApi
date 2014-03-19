package de.metalcon.sdd.api.requests;

import java.util.Map;

public class SddUpdateRequest extends SddRequest {

    private static final long serialVersionUID = -4238092829750944842L;

    private long id;

    private String type;

    private Map<String, String> attrs;

    public SddUpdateRequest(
            long id,
            String type,
            Map<String, String> attrs) {
        super();
        this.id = id;
        this.type = type;
        this.attrs = attrs;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Map<String, String> getAttrs() {
        return attrs;
    }

}
