package RickGuitarStore.v5.Specs;

import RickGuitarStore.v5.Enums.Builder;
import RickGuitarStore.v5.Enums.Type;
import RickGuitarStore.v5.Enums.Wood;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public boolean matches (InstrumentSpec otherSpec){
        if (builderIsDifferent(otherSpec))
            return false;

        if (modelIsDifferent(otherSpec))
            return false;

        if (typeIsDifferent(otherSpec))
            return false;

        if (backWoodIsDifferent(otherSpec))
            return false;

        if (topWoodIsDifferent(otherSpec))
            return false;

        return true;
    }

    private boolean topWoodIsDifferent(InstrumentSpec otherSpec) {
        return topWood != otherSpec.topWood;
    }

    private boolean backWoodIsDifferent(InstrumentSpec otherSpec) {
        return backWood != otherSpec.backWood;
    }

    private boolean typeIsDifferent(InstrumentSpec otherSpec) {
        return type != otherSpec.type;
    }

    private boolean modelIsDifferent(InstrumentSpec otherSpec) {
        return (model != null) && (!model.equals("")) && (!model.equals(otherSpec.model));
    }

    private boolean builderIsDifferent(InstrumentSpec otherSpec) {
        return builder != otherSpec.builder;
    }

}
