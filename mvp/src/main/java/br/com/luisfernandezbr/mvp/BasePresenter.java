package br.com.luisfernandezbr.mvp;

public interface BasePresenter {
    void init(ActivityLoader activityLoader);
    void onStart();
    void onStop();
}
