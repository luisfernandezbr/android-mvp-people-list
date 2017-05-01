package br.com.luisfernandezbr.challenge99.event;


import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.event.BaseEvent;

public class ViewItemClickedEvent extends BaseEvent {

    private TechStar techStar;

    public ViewItemClickedEvent(TechStar techStar) {
        this.techStar = techStar;
    }

    public TechStar getTechStar() {
        return techStar;
    }
}