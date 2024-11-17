import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {

    public MonedasApi buscaMoneda(String moneda1, String moneda2, double valor){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5b6d7c6c69662bf414f27e9d/pair/"+moneda1+"/"+moneda2+"/"+valor);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), MonedasApi.class);

            } catch (IOException  | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
