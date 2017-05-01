package br.com.luisfernandezbr.challenge99.mvp.presenter;

import br.com.luisfernandezbr.challenge99.event.DataAccessListSuccessEvent;
import br.com.luisfernandezbr.challenge99.event.ViewItemClickedEvent;

public interface TechStarsPresenter {

    void init();
    void onStart();
    void onStop();

    void onViewItemClickedEvent(ViewItemClickedEvent event);

    void onDataAccessListSuccessEvent(DataAccessListSuccessEvent event);

    void onDataAccessListErrorEvent();
}
