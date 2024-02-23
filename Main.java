import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("carro", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("playa", "beach");
        diccionario.put("montaña", "mountain");
        diccionario.put("te amo", "love");
        diccionario.put("bailar", "dance");
        diccionario.put("comer", "eat");
        diccionario.put("dormir", "sleep");
        diccionario.put("correr", "run");
                String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }
        
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabraEspañol);
            if (respuestaUsuario.equals(traduccionCorrecta)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }
        
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
        
        scanner.close();
    }
}