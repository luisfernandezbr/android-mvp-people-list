package br.com.luisfernandezbr.challenge99.mvp.presenter;


public interface TechStarsPresenter {

    void onViewLoadListEvent();

    void onViewItemClickedEvent();

    void onDataAccessListSuccessEvent();

    void onDataAccessListErrorEvent();
}
