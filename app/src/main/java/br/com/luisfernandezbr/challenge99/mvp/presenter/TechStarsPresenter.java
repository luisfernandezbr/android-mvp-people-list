package br.com.luisfernandezbr.challenge99.mvp.presenter;

import br.com.luisfernandezbr.challenge99.event.DataAccessListSuccessEvent;
import br.com.luisfernandezbr.mvp.BasePresenter;

public interface TechStarsPresenter extends BasePresenter {

    void onViewLoadListEvent();

    void onViewItemClickedEvent();

    void onDataAccessListSuccessEvent(DataAccessListSuccessEvent event);

    void onDataAccessListErrorEvent();
}
