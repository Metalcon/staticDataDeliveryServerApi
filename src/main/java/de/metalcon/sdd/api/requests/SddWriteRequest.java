package de.metalcon.sdd.api.requests;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.metalcon.domain.Muid;

public class SddWriteRequest extends SddRequest {

    private static final long serialVersionUID = 284025577561283163L;

    private List<WriteRequestAction> actions =
            new LinkedList<WriteRequestAction>();

    public void setProperties(Muid nodeId, Map<String, String> properties) {
        actions.add(new SetPropertiesAction(nodeId.getValue(), nodeId
                .getMuidType().getIdentifier(), properties));
    }

    public void setRelation(Muid nodeId, String relation, Muid toId) {
        actions.add(new SetRelationAction(nodeId.getValue(), nodeId
                .getMuidType().getIdentifier(), relation, toId));
    }

    public void setRelations(Muid nodeId, String relation, List<Muid> toIds) {
        actions.add(new SetRelationsAction(nodeId.getValue(), nodeId
                .getMuidType().getIdentifier(), relation, toIds));
    }

    public void addRelations(Muid nodeId, String relation, List<Muid> toIds) {
        actions.add(new AddRelationsAction(nodeId.getValue(), nodeId
                .getMuidType().getIdentifier(), relation, toIds));
    }

    public void delete(Muid nodeId) {
        actions.add(new DeleteAction(nodeId.getValue()));
    }

    public void deleteRelations(Muid nodeId, String relation, List<Muid> toIds) {
        actions.add(new DeleteRelationsAction(nodeId.getValue(), nodeId
                .getMuidType().getIdentifier(), relation, toIds));
    }

    public List<WriteRequestAction> getActions() {
        return Collections.unmodifiableList(actions);
    }

}
