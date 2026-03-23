package br.com.kael.screenmatch.service;

import br.com.kael.screenmatch.model.Serie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversion implements IConversion{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T DataConversion(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}


