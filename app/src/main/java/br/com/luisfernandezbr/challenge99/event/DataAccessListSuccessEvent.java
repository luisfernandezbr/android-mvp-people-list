package br.com.luisfernandezbr.challenge99.event;


import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.event.BaseEvent;

public class DataAccessListSuccessEvent extends BaseEvent {

    private List<TechStar> techStarsList;

    public DataAccessListSuccessEvent(List<TechStar> techStarsList) {
        this.techStarsList = techStarsList;
    }

    public List<TechStar> getTechStarsList() {
        return techStarsList;
    }
}