package br.com.luisfernandezbr.challenge99.mvp.view;


import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public interface TechStarsListView {

    void sendViewLoadListEvent();
    void sendViewItemClickedEvent();
    void onListLoad(List<TechStar> techStarsList);
}
