package RickGuitarStore.v6;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if (properties.isEmpty()) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getSpec(String specName) {
        return this.properties.get(specName);
    }

    public Map getSpecs() {
        return this.properties;
    }

    public boolean isEqual(InstrumentSpec wantedInstrumentSpec) {
        for (Object property : this.properties.keySet()) {
            Object spec = this.properties.get(property);
            Object wantedSpec = wantedInstrumentSpec.getSpec((String) property);

            if (!spec.equals(wantedSpec)) {
                return false;
            }
        }
        return true;
    }
}
