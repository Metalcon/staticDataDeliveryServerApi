package de.metalcon.sdd.api.requests;

import java.util.Map;

public class SetPropertiesAction extends WriteRequestAction {

    private static final long serialVersionUID = 5188261185004116333L;

    private long nodeId;

    private String nodeType;

    private Map<String, String> properties;

    /* package */SetPropertiesAction(
            long nodeId,
            String nodeType,
            Map<String, String> properties) {
        super();
        this.nodeId = nodeId;
        this.nodeType = nodeType;
        this.properties = properties;
    }

    public long getNodeId() {
        return nodeId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

}
