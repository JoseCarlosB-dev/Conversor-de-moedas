import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public String buscarMoeda(String base) throws IOException, InterruptedException {

        String apiKey = "2fb25f821627d811eb5c5ef1";

        String endereco =
                "https://v6.exchangerate-api.com/v6/" +
                        apiKey +
                        "/latest/" +
                        base;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}