package br.com.luisfernandezbr.challenge99.mvp.view;

import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public interface TechStarsListView {

    void sendViewItemClickedEvent();

    void showLoadListSuccess(List<TechStar> techStarsList);
    void showLoadListError(int errorCode, String errorMessage);
}
