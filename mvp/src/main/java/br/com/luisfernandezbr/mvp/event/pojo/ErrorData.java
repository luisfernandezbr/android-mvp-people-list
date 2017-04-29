package br.com.luisfernandezbr.mvp.event.pojo;

public class ErrorData {

    private int errorCode;
    private String errorMessage;

    public ErrorData(int errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorData(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorData(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
