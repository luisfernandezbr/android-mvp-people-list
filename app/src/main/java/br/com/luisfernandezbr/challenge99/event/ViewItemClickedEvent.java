package br.com.luisfernandezbr.challenge99.event;


import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class ViewItemClickedEvent {

    private TechStar techStar;

    public ViewItemClickedEvent(TechStar techStar) {
        this.techStar = techStar;
    }

    public TechStar getTechStar() {
        return techStar;
    }
}