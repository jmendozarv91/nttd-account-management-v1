package nttd.bootcamp.microservices.account.management.repository.client;

import nttd.bootcamp.microservices.account.management.dto.ClienteDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Repository
public class ClientRepository {
    private final WebClient webClient;

    public ClientRepository(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl("http://localhost:8087").build();
    }

    public Mono<ClienteDto> obtenerCliente(String parametro) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/v1/clients/")
                        .path(parametro)
                        .build())
                .retrieve()  // inicia la solicitud
                .bodyToMono(ClienteDto.class);
    }
}
