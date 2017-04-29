package br.com.luisfernandezbr.mvp.bus;

import br.com.luisfernandezbr.mvp.bus.eventbus.EventBaseBusImpl;

public class BusProvider {

    private static EventBaseBusImpl mInstance;

    public static BaseBus getInstance() {

        if (mInstance == null) {
            mInstance = new EventBaseBusImpl();
        }

        return mInstance;
    }

    private BusProvider() {
    }
}
