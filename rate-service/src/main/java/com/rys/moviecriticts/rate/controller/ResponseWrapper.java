package com.rys.moviecriticts.rate.controller;

public class ResponseWrapper<T> {

    private final T data;

    public ResponseWrapper(final T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
