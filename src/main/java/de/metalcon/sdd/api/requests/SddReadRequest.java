package de.metalcon.sdd.api.requests;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import de.metalcon.domain.Muid;

public class SddReadRequest extends SddRequest {

    private static final long serialVersionUID = 5917412654438148252L;

    private List<ReadRequestAction> actions =
            new LinkedList<ReadRequestAction>();

    // TODO: switch String detail to enum?

    public void read(Muid nodeId, String detail) {
        actions.add(new ReadRequestAction(nodeId.getValue(), detail));
    }

    public List<ReadRequestAction> getActions() {
        return Collections.unmodifiableList(actions);
    }

}
