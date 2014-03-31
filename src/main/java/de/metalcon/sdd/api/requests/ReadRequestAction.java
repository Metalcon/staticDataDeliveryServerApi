package de.metalcon.sdd.api.requests;

import java.io.Serializable;

public class ReadRequestAction implements Serializable {

    private static final long serialVersionUID = -3449857244978921844L;

    private long nodeId;

    private String detail;

    /* package */ReadRequestAction(
            long nodeId,
            String detail) {
        super();
        this.nodeId = nodeId;
        this.detail = detail;
    }

    public long getNodeId() {
        return nodeId;
    }

    public String getDetail() {
        return detail;
    }

}
