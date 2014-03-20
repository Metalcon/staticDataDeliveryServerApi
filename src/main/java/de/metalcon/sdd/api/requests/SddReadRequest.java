package de.metalcon.sdd.api.requests;

public class SddReadRequest extends SddRequest {

    private static final long serialVersionUID = 5917412654438148252L;

    private long id;

    private String detail;

    public SddReadRequest(
            long id,
            String detail) {
        super();

        if (detail == null) {
            throw new IllegalArgumentException("detail was null");
        }

        this.id = id;
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

}
