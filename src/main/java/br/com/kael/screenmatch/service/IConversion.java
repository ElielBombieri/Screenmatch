package br.com.kael.screenmatch.service;

public interface IConversion {
    <T> T DataConversion(String json, Class<T> classe);
}
