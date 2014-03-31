package de.metalcon.sdd.api.requests;

import de.metalcon.domain.Muid;

public class SetRelationAction extends WriteRequestAction {

    private static final long serialVersionUID = -4792313824535983730L;

    private Muid nodeId;

    private String relation;

    private Muid toId;

    /* package */SetRelationAction(
            Muid nodeId,
            String relation,
            Muid toId) {
        super();
        this.nodeId = nodeId;
        this.relation = relation;
        this.toId = toId;
    }

    public Muid getNodeId() {
        return nodeId;
    }

    public String getRelation() {
        return relation;
    }

    public Muid getToId() {
        return toId;
    }

}
