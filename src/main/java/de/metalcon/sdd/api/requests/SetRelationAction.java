package de.metalcon.sdd.api.requests;


public class SetRelationAction extends WriteRequestAction {

    private static final long serialVersionUID = -4792313824535983730L;

    private long nodeId;

    private String nodeType;

    private String relation;

    private long toId;

    /* package */SetRelationAction(
            long nodeId,
            String nodeType,
            String relation,
            long toId) {
        super();
        this.nodeId = nodeId;
        this.relation = relation;
        this.toId = toId;
    }

    public long getNodeId() {
        return nodeId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public String getRelation() {
        return relation;
    }

    public long getToId() {
        return toId;
    }

}
