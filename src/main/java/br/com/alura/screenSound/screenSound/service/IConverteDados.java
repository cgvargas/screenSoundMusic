package br.com.alura.screenSound.screenSound.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
