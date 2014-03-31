package de.metalcon.sdd.api.requests;

import java.util.List;

import de.metalcon.domain.Muid;

public class DeleteRelationsAction extends WriteRequestAction {

    private static final long serialVersionUID = -2242750141305900557L;

    private Muid nodeId;

    private String relation;

    private List<Muid> toIds;

    /* packge */DeleteRelationsAction(
            Muid nodeId,
            String relation,
            List<Muid> toIds) {
        super();
        this.nodeId = nodeId;
        this.relation = relation;
        this.toIds = toIds;
    }

    public Muid getNodeId() {
        return nodeId;
    }

    public String getRelation() {
        return relation;
    }

    public List<Muid> getToIds() {
        return toIds;
    }

}
