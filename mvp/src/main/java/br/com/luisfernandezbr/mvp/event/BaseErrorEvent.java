package br.com.luisfernandezbr.mvp.event;

import br.com.luisfernandezbr.mvp.event.pojo.ErrorData;

/**
 * Created by lfernandez on 1/16/17.
 */
public class BaseErrorEvent extends BaseEvent {

    private ErrorData errorData;

    public BaseErrorEvent(ErrorData errorData) {
        this.errorData = errorData;
    }

    public ErrorData getErrorData() {
        return errorData;
    }
}
