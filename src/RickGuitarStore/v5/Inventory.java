package RickGuitarStore.v5;

import RickGuitarStore.v5.Instruments.Guitar;
import RickGuitarStore.v5.Instruments.Instrument;
import RickGuitarStore.v5.Instruments.Mandolin;
import RickGuitarStore.v5.Specs.GuitarSpec;
import RickGuitarStore.v5.Specs.InstrumentSpec;
import RickGuitarStore.v5.Specs.MandolinSpec;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
        this.inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }

        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : this.inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    // Alguma maneira de criar apenas um search para 'n' instrumentos
    public List<Guitar> search(GuitarSpec wantedSpec){
        List<Guitar> foundGuitars = new LinkedList();
        for (Instrument instrument : this.inventory) {
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                GuitarSpec guitarSpec = (GuitarSpec) guitar.getSpec();
                if (guitarSpec.matches(wantedSpec)) {
                    foundGuitars.add(guitar);
                }
            }
        }
        return foundGuitars;
    }

    public List<Mandolin> search(MandolinSpec wantedSpec){
        List<Mandolin> foundMandolins = new LinkedList();
        for (Instrument instrument : this.inventory) {
            if (instrument instanceof Mandolin) {
                Mandolin mandolin = (Mandolin) instrument;
                MandolinSpec mandolinSpec = (MandolinSpec) mandolin.getSpec();
                if (mandolinSpec.matches(wantedSpec)) {
                    foundMandolins.add(mandolin);
                }
            }
        }
        return foundMandolins;
    }


}
