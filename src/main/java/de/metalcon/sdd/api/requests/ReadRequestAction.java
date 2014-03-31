package de.metalcon.sdd.api.requests;

import java.io.Serializable;

import de.metalcon.domain.Muid;

public class ReadRequestAction implements Serializable {

    private static final long serialVersionUID = -3449857244978921844L;

    private Muid nodeId;

    private String detail;

    /* package */ReadRequestAction(
            Muid nodeId,
            String detail) {
        super();
        this.nodeId = nodeId;
        this.detail = detail;
    }

    public Muid getNodeId() {
        return nodeId;
    }

    public String getDetail() {
        return detail;
    }

}
