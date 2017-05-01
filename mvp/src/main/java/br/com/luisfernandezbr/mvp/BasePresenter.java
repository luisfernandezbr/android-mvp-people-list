package br.com.luisfernandezbr.mvp;

public abstract class BasePresenter {

    private boolean initialized;

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }
}