package de.metalcon.sdd.api.requests;

import java.util.List;
import java.util.Map;

import de.metalcon.domain.Muid;

public class SddWriteRequest extends SddRequest {

    private static final long serialVersionUID = 284025577561283163L;

    public void setProperties(Muid nodeId, Map<String, String> properties) {
    }

    public void setRelation(Muid nodeId, String relation, Muid toId) {
    }

    public void setRelations(Muid nodeId, String relation, List<Muid> toIds) {
    }

    public void addRelations(Muid nodeId, String relation, List<Muid> toIds) {
    }

    public void delete(Muid nodeId) {
    }

    public void deleteRelations(Muid nodeId, String relation, List<Muid> toIds) {
    }

}
