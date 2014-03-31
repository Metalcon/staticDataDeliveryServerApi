package de.metalcon.sdd.api.requests;

import java.util.Map;

import de.metalcon.domain.Muid;

public class SetPropertiesAction extends WriteRequestAction {

    private static final long serialVersionUID = 5188261185004116333L;

    private Muid nodeId;

    private Map<String, String> properties;

    /* package */SetPropertiesAction(
            Muid nodeId,
            Map<String, String> properties) {
        super();
        this.nodeId = nodeId;
        this.properties = properties;
    }

    public Muid getNodeId() {
        return nodeId;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

}
