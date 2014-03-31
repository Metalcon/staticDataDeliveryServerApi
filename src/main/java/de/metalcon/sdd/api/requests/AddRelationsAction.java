package de.metalcon.sdd.api.requests;

import java.util.List;

import de.metalcon.domain.Muid;

public class AddRelationsAction extends WriteRequestAction {

    private static final long serialVersionUID = -1812573255226315962L;

    private Muid nodeId;

    private String relation;

    private List<Muid> toIds;

    /* package */AddRelationsAction(
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
