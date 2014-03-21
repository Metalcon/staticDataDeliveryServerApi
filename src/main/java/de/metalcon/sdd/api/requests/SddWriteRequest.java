package de.metalcon.sdd.api.requests;

import java.util.List;
import java.util.Map;

import de.metalcon.domain.Muid;

public class SddWriteRequest extends SddRequest {

    private static final long serialVersionUID = 284025577561283163L;

    public void setProperties(Muid id, Map<String, String> properties) {
    }

    public void setRelation(Muid id, String type, Muid relationId) {
    }

    public void setRelations(Muid id, String type, List<Muid> relIds) {
    }

    public void addRelations(Muid id, String type, List<Muid> relIds) {
    }

    public void delete(Muid id) {
    }

    public void deleteRelation(Muid id, String type, Muid relId) {
    }

    public void deleteRelations(Muid id, String type, List<Muid> relIds) {
    }

}
