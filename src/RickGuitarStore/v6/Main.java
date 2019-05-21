package RickGuitarStore.v6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap spec = new HashMap();
        spec.put("chave1", "valor1");
        spec.put("chave2", "valor2");
        spec.put("chave3", "valor3");

        HashMap spec2 = new HashMap();
        spec2.put("chave1", "valor1");
        spec2.put("chave2", "valor2");
        spec2.put("chave3", "valor300");

        InstrumentSpec instrumentSpec = new InstrumentSpec(spec);
        InstrumentSpec instrumentSpec2 = new InstrumentSpec(spec2);

        System.out.println(instrumentSpec.isEqual(instrumentSpec));
        System.out.println(instrumentSpec.isEqual(instrumentSpec2));

    }
}
