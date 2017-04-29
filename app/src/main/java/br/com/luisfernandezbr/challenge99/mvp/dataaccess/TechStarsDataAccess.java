package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public interface TechStarsDataAccess {

    void loadList();
    void sendDataAccessListSuccessEvent(List<TechStar> techStarsList);
}
