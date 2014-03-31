package de.metalcon.sdd.api.requests;

import java.util.List;

import de.metalcon.domain.Muid;

public class SetRelationsAction extends WriteRequestAction {

    private static final long serialVersionUID = 8619946426392098991L;

    private long nodeId;

    private String nodeType;

    private String relation;

    private List<Muid> toIds;

    /* pacakge */SetRelationsAction(
            long nodeId,
            String nodeType,
            String relation,
            List<Muid> toIds) {
        super();
        this.nodeId = nodeId;
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
