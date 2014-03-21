package de.metalcon.sdd.api.requests;

import java.util.Map;

import de.metalcon.domain.Muid;

public class SddWriteRequest extends SddRequest {

    private static final long serialVersionUID = 284025577561283163L;

    public void setProperties(Muid id, Map<String, String> properties) {
    }

    public void setRelation(Muid id, String attribute, Muid relationId) {
    }

    public void setRelations(Muid id, String attribute, Muid[] relationIds) {
    }

    public void addRelations(Muid id, String attribute, Muid[] relationIds) {
    }

}
