package de.metalcon.sdd.api.requests;


public class DeleteRelationsAction extends WriteRequestAction {

    private static final long serialVersionUID = -2242750141305900557L;

    private long nodeId;

    private String nodeType;

    private String relation;

    private long[] toIds;

    /* packge */DeleteRelationsAction(
            long nodeId,
            String nodeType,
            String relation,
            long[] toIds) {
        super();
        this.nodeId = nodeId;
        this.nodeType = nodeType;
        this.relation = relation;
        this.toIds = toIds;
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

    public long[] getToIds() {
        return toIds;
    }

}
