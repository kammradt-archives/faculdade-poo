package RickGuitarStore.v5.Specs;

import RickGuitarStore.v5.Enums.Builder;
import RickGuitarStore.v5.Enums.Style;
import RickGuitarStore.v5.Enums.Type;
import RickGuitarStore.v5.Enums.Wood;

public class MandolinSpec extends InstrumentSpec{
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    // Isso aqui tá cagado
    @Override
    public boolean matches (InstrumentSpec otherSpec) {
        if (genericSpecsAreDifferent(otherSpec))
            return false;

        if (isOtherInstrumentSpec(otherSpec))
            return false;

        MandolinSpec spec = (MandolinSpec)otherSpec;
        if (styleIsDifferent(spec))
            return false;

        return true;
    }

    private boolean styleIsDifferent(MandolinSpec spec) {
        return !style.equals(spec.style);
    }

    private boolean isOtherInstrumentSpec(InstrumentSpec otherSpec) {
        return !(otherSpec instanceof MandolinSpec);
    }

    private boolean genericSpecsAreDifferent(InstrumentSpec otherSpec) {
        return !super.matches(otherSpec);
    }
}
