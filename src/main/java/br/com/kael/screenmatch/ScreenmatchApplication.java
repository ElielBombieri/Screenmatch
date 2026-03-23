package br.com.kael.screenmatch;

import br.com.kael.screenmatch.model.Serie;
import br.com.kael.screenmatch.service.Conversion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.kael.screenmatch.service.ConsumoApi;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    private final ConsumoApi consumoApi;

    public ScreenmatchApplication(ConsumoApi consumoApi) {
        this.consumoApi = consumoApi;
    }

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Conversion conversion = new Conversion();

        String json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=b4813b59");

        Serie serie = conversion.DataConversion(json, Serie.class);
        System.out.println(serie);
    }
}
