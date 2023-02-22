import com.google.gson.*;

public class Main {
    public static void main(String[] args) {

        Gson gs = new Gson();
        String t = tarjetas();
        JsonParser parseo = new JsonParser();
        JsonElement jsElement = parseo.parse(t); // aqui_viene_todo
        JsonArray jsonArray = jsElement.getAsJsonObject().getAsJsonArray("arraytarjetas");// aqui obtenemos solo tarjetas

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject tarjetaJson = jsonArray.get(i).getAsJsonObject();
            for(int j=0; i<tarjetaJson.getAsLong(); j++){
                
            }
            ModeladoTarjeta tarjeta1 = gs.fromJson(tarjetaJson, ModeladoTarjeta.class);
            imprimirdatosTarjeta(tarjeta1);
        }
    }

    public static void imprimirdatosTarjeta(ModeladoTarjeta tarjetas){
        System.out.println("Datos de las tarjetas");
        System.out.println("Nombre: " + tarjetas.getNombre_propietario());
        System.out.println("Número de tarjeta: " + tarjetas.getNumero_tarjeta());
        System.out.println("CVV: " + tarjetas.getCvv());
        System.out.println("Fecha de vencimiento: " + tarjetas.getFecha_vencimiento());
        System.out.println("Número de cuenta: " + tarjetas.getNumero_cuenta());
        System.out.println("Arreglo de numeros: " + tarjetas.getNumerosArreglo());
        System.out.println();

    }

    public static String tarjetas(){
        return "{\"arraytarjetas\":[\n" +
                "    {\n" +
                "        \"nombre_propietario\": \"Daniel\",\n" +
                "        \"numero_tarjeta\": 12345678,\n" +
                "        \"cvv\" : 456,\n" +
                "        \"fecha_vencimiento\":\"10/24\",\n" +
                "        \"numero_cuenta\": 456654456,\n" +
                "        \"arrayNumero\":[\n" +
                "            1111,\n" +
                "            1222,\n" +
                "            1333\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"nombre_propietario\": \"Eduardo\",\n" +
                "        \"numero_tarjeta\": 87654321,\n" +
                "        \"cvv\" : 654,\n" +
                "        \"fecha_vencimiento\":\"10/23\",\n" +
                "        \"numero_cuenta\": 123456789,\n" +
                "        \"arrayNumero\":[\n" +
                "            2444,\n" +
                "            2555,\n" +
                "            2666\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"nombre_propietario\": \"Carlos\",\n" +
                "        \"numero_tarjeta\": 12345678,\n" +
                "        \"cvv\" : 123,\n" +
                "        \"fecha_vencimiento\":\"12/25\",\n" +
                "        \"numero_cuenta\": 456654456,\n" +
                "        \"arrayNumero\":[\n" +
                "            3111,\n" +
                "            3222,\n" +
                "            3333\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"nombre_propietario\": \"Adrian\",\n" +
                "        \"numero_tarjeta\": 45654565,\n" +
                "        \"cvv\" : 932,\n" +
                "        \"fecha_vencimiento\":\"08/24\",\n" +
                "        \"numero_cuenta\": 12211221,\n" +
                "        \"arrayNumero\":[\n" +
                "            4111,\n" +
                "            4222,\n" +
                "            4333\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"nombre_propietario\": \"Enrique\",\n" +
                "        \"numero_tarjeta\": 78787878,\n" +
                "        \"cvv\" : 788,\n" +
                "        \"fecha_vencimiento\":\"10/23\",\n" +
                "        \"numero_cuenta\": 12312312,\n" +
                "        \"arrayNumero\":[\n" +
                "            5111,\n" +
                "            5222,\n" +
                "            5333\n" +
                "        ]\n" +
                "    }\n" +
                "]\n" +
                "}   \n";
    }


}
