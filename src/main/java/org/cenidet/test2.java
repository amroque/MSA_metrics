package org.cenidet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {
    public static void main(String[] args) {
        String metodoJava = "public Response createAndModifyRoute(RouteInfo request, HttpHeaders headers) {\n" +
                "\n" +
                "        HttpEntity requestEntity = new HttpEntity(request, null);\n" +
                "        ResponseEntity<Response<Route>> re = restTemplate.exchange(\n" +
                "                \"http://ts-route-service:11178/api/v1/routeservice/routes\",\n" +
                "                HttpMethod.POST,\n" +
                "                requestEntity,\n" +
                "                new ParameterizedTypeReference<Response<Route>>() {\n" +
                "                });\n" +
                "        if (re.getStatusCode() != HttpStatus.ACCEPTED) {\n" +
                "            logger.error(\"Get status error, response code: {}\", re.getStatusCodeValue());\n" +
                "        }\n" +
                "        return re.getBody();\n" +
                "    }";

        String resultado = obtenerMetodoHastaPrimeraLlave(metodoJava);
        System.out.println(resultado + "}");
    }

    public static String obtenerMetodoHastaPrimeraLlave(String metodo) {
        int indicePrimeraLlave = metodo.indexOf('{');
        if (indicePrimeraLlave != -1) {
            return metodo.substring(0, indicePrimeraLlave + 1);
        } else {
            // Manejar el caso en que no se encuentra ninguna llave
            return metodo;
        }
    }
}
