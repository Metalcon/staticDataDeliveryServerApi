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
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new SetPropertiesAction(nodeId.getValue(), nodeId.getType()
                .getIdentifier(), properties));
    }

    public void setRelation(Muid nodeId, String relation, Muid toId) {
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new SetRelationAction(nodeId.getValue(), nodeId.getType()
                .getIdentifier(), relation, toId.getValue()));
    }

    public void setRelations(Muid nodeId, String relation, List<Muid> toIds) {
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new SetRelationsAction(nodeId.getValue(), nodeId.getType()
                .getIdentifier(), relation, listToArray(toIds)));
    }

    public void addRelations(Muid nodeId, String relation, List<Muid> toIds) {
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new AddRelationsAction(nodeId.getValue(), nodeId.getType()
                .getIdentifier(), relation, listToArray(toIds)));
    }

    public void delete(Muid nodeId) {
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new DeleteAction(nodeId.getValue()));
    }

    public void deleteRelations(Muid nodeId, String relation, List<Muid> toIds) {
        if (nodeId == null) {
            throw new IllegalArgumentException("nodeId was null");
        }
        actions.add(new DeleteRelationsAction(nodeId.getValue(), nodeId
                .getType().getIdentifier(), relation, listToArray(toIds)));
    }

    public List<WriteRequestAction> getActions() {
        return Collections.unmodifiableList(actions);
    }

    private static long[] listToArray(List<Muid> list) {
        long[] array = new long[list.size()];
        int i = 0;
        for (Muid entry : list) {
            if (entry == null) {
                throw new IllegalArgumentException(
                        "List of Muids contained null value.");
            }
            array[i] = entry.getValue();
            ++i;
        }
        return array;
    }

}
