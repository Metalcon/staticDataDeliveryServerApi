package de.metalcon.sdd.api.requests;

import de.metalcon.domain.Muid;

public class DeleteAction extends WriteRequestAction {

    private static final long serialVersionUID = 6801497307088006411L;

    private Muid nodeId;

    /* package */DeleteAction(
            Muid nodeId) {
        super();
        this.nodeId = nodeId;
    }

    public Muid getNodeId() {
        return nodeId;
    }

}
