package de.metalcon.sdd.api.requests;

import java.util.List;

import de.metalcon.domain.Muid;

public class AddRelationsAction extends WriteRequestAction {

    private static final long serialVersionUID = -1812573255226315962L;

    private long nodeId;

    private String nodeType;

    private String relation;

    private List<Muid> toIds;

    /* package */AddRelationsAction(
            long nodeId,
            String nodeType,
            String relation,
            List<Muid> toIds) {
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

    public List<Muid> getToIds() {
        return toIds;
    }

}
