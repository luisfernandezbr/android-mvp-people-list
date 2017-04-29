package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class TechStarsDataAccessImpl implements TechStarsDataAccess {

    @Override
    public void loadList() {

    }

    @Override
    public void sendDataAccessListSuccessEvent(List<TechStar> techStarsList) {

    }

    private boolean isValidList(List<TechStar> techStarsList) {
        return false;
    }

    private List<TechStar> getFromJson(String json) {
        return null;
    }
}
