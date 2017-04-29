package br.com.luisfernandezbr.mvp.bus.eventbus;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.greenrobot.eventbus.EventBus;

import br.com.luisfernandezbr.mvp.bus.BaseBus;
import br.com.luisfernandezbr.mvp.event.BaseEvent;

public class EventBaseBusImpl implements BaseBus {

    private static final String TAG = "EventBaseBusImpl";

    private Gson gson;

    public EventBaseBusImpl() {
        gson = new GsonBuilder().create();
        EventBus.builder().throwSubscriberException(true).installDefaultEventBus();
    }

    @Override
    public void subscribe(Object object) {
        EventBus.getDefault().register(object);
    }

    @Override
    public void unsubscribe(Object object) {
        EventBus.getDefault().unregister(object);
    }

    @Override
    public void post(BaseEvent event) {
        String message = "post [Event: " + event.getClass().getSimpleName() + "] [Data: " + gson.toJson(event) + "]";
        Log.d(TAG, message);

        EventBus.getDefault().post(event);
    }
}
