package de.metalcon.sdd.api.responses;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import de.metalcon.api.responses.SuccessResponse;
import de.metalcon.domain.Muid;

public class SddSucessfulReadResponse extends SuccessResponse {

    private static final long serialVersionUID = -5596683508242175935L;

    private Map<Muid, Map<String, String>> outputs =
            new HashMap<Muid, Map<String, String>>();

    public void add(long nodeId, String detail, String output) {
        Map<String, String> nodeOutputs =
                outputs.get(Muid.createFromID(nodeId));
        if (nodeOutputs == null) {
            nodeOutputs = new HashMap<String, String>();
            outputs.put(Muid.createFromID(nodeId), nodeOutputs);
        }
        nodeOutputs.put(detail, output);
    }

    public String get(Muid nodeId, String detail) {
        Map<String, String> nodeOutputs = outputs.get(nodeId);
        if (nodeOutputs == null) {
            return null;
        }
        return nodeOutputs.get(detail);
    }

    public Map<String, String> get(Muid nodeId) {
        return Collections.unmodifiableMap(outputs.get(nodeId));
    }

    public Map<Muid, Map<String, String>> get() {
        return Collections.unmodifiableMap(outputs);
    }

}
