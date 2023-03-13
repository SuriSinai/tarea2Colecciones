import java.util.HashMap;
import java.util.Map;

public class ResultadosExamen {

    public static void calificacionFinal(HashMap<String, Integer> calificacionPrevia,
                                         HashMap<String, Integer> calificacionPosterior) {
        for (Map.Entry<String, Integer> s1 : calificacionPrevia.entrySet()) {

            for (Map.Entry<String, Integer> s2 : calificacionPosterior.entrySet()) {

                if(s1.getKey() == s2.getKey()){

                    if (s1.getValue() >=  s2.getValue()) {
                        System.out.println(s1);
                    }
                    if (s1.getValue() <   s2.getValue()) {
                        System.out.println(s2);

                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        HashMap<String, Integer> calificacionPrevia = new HashMap<String, Integer>();
        calificacionPrevia.put("Ana", 24);
        calificacionPrevia.put("Daniel", 50);
        calificacionPrevia.put("Alejandro", 79);
        calificacionPrevia.put("Laura", 32);
        calificacionPrevia.put("Kelly", 80);
        calificacionPrevia.put("Ivan", 40);
        calificacionPrevia.put("Maria", 59);
        calificacionPrevia.put("Melanie", 55);
        calificacionPrevia.put("Diego", 95);
        calificacionPrevia.put("Miguel", 63);




     HashMap<String, Integer> calificacionPosterior = new HashMap<String, Integer>();

        calificacionPosterior.put("Ana", 97);
        calificacionPosterior.put("Daniel", 89);
        calificacionPosterior.put("Alejandro", 79);
        calificacionPosterior.put("Laura", 82);
        calificacionPosterior.put("Kelly", 76);
        calificacionPosterior.put("Ivan", 98);
        calificacionPosterior.put("Maria", 80);
        calificacionPosterior.put("Melanie", 95);
        calificacionPosterior.put("Diego", 90);
        calificacionPosterior.put("Miguel", 62);

        calificacionFinal(calificacionPrevia, calificacionPosterior);
    }
}