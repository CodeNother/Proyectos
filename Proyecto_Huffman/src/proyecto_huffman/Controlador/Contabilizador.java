package proyecto_huffman.Controlador;

import java.util.HashMap;
import java.util.Map;

public class Contabilizador {

    private Map<String, Long> ocurrencias; // Map porque son... UNICODE!

    public Contabilizador() {

        ocurrencias = new HashMap<String, Long>();

    }

    /**
     * Metodo para contabilizar las letras *
     */
    public void contabiliza(String linea) {

        for (int i = 0; i < linea.length(); i++) {

            if (null == ocurrencias.get("" + linea.charAt(i))) {

                ocurrencias.put("" + linea.charAt(i), 1L);

            } else {

                Long valor = ocurrencias.get("" + linea.charAt(i));
                valor++;
                ocurrencias.put("" + linea.charAt(i), valor);
            }

        }

    }

    public Map<String, Long> getOcurrencias() {

        return ocurrencias;

    }

}
