package de.metalcon.sdd.api.requests;

import java.util.Map;

public class SddUpdateAttrsRequest extends SddRequest {

    private static final long serialVersionUID = -1747354581755890854L;

    private long id;

    private String type;

    private Map<String, String> attrs;

    public SddUpdateAttrsRequest(
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
