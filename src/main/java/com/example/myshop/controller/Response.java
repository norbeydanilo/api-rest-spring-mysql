package com.example.myshop.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Modelo de respuesta
 * 
 * @author --
 * @version 1.0
 *          Se usa como respuesta genérica cuando lo que hay que responder no es
 *          información sino
 *          que es la confirmación de que una operación se ha ejecutado
 *          correctamente o bien un error
 *          porque algo no ha ocurrido como se esperaba
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Response {

    public static final int NO_ERROR = 0;
    public static final int NOT_FOUND = 101;

    public static final String NO_MESSAGE = "";

    private Error error;

    @Data
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    static class Error {
        private long errorCode;
        private String message;
    }

    public static Response noErrorResponse() {
        return new Response(new Error(NO_ERROR, NO_MESSAGE));
    }

    public static Response errorResonse(int errorCode, String errorMessage) {
        return new Response(new Error(errorCode, errorMessage));
    }
}
