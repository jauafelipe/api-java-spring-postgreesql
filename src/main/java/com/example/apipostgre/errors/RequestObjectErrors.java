package com.example.apipostgre.errors;

public class RequestObjectErrors {
    private String error;
    
    public RequestObjectErrors(String msg){
        this.error = msg;
    }
    public String getError() {
        return this.error;
    }
    public void setError(String error) {
        this.error = error;
    }
}
