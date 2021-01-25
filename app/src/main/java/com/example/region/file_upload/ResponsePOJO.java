package com.example.region.file_upload;

public class ResponsePOJO {

    private boolean status;
    private String error;

    public ResponsePOJO( String error, Boolean status) {
        this.status = status;
        this.error = error;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

}
