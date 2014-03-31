package de.metalcon.sdd.api.requests;


public class DeleteAction extends WriteRequestAction {

    private static final long serialVersionUID = 6801497307088006411L;

    private long nodeId;

    /* package */DeleteAction(
            long nodeId) {
        super();
        this.nodeId = nodeId;
    }

    public long getNodeId() {
        return nodeId;
    }

}
