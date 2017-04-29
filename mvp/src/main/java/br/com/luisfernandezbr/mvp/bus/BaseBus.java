package br.com.luisfernandezbr.mvp.bus;

import br.com.luisfernandezbr.mvp.event.BaseEvent;

public interface BaseBus {
    void subscribe(Object object);
    void unsubscribe(Object object);
    void post(BaseEvent event);
}
