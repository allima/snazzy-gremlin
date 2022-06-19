package org.example.repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImdbRepository {

    String apiKey;

    public ImdbRepository() {
        this.apiKey = System.getenv("API_KEY_IMDB");
    }

    public String consultTop250Filmes() {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse response;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/" + apiKey))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body().toString();
    }

}
