package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import br.com.luisfernandezbr.challenge99.event.DataAccessListSuccessEvent;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.service.DataService;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.service.RawDataServiceImpl;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.bus.BusProvider;

public class TechStarsDataAccessImpl implements TechStarsDataAccess {

    private static final String TAG = "TechStarsDataAccessImpl";

    private DataService rawDataService;

    public TechStarsDataAccessImpl(Context context) {
        this.rawDataService = new RawDataServiceImpl(context);
    }

    @Override
    public void loadList() {
        try {
            List<TechStar> techStarsList = this.rawDataService.loadList();

            if (this.isValidList(techStarsList)) {
                this.sendDataAccessListSuccessEvent(techStarsList);
            } else {
                this.sendDataAccessListErrorEvent(4001, "Error parsing data!");
            }

        } catch (IOException e) {
            String errorMessage = "Error loading data!";
            Log.e(TAG, errorMessage, e);

            this.sendDataAccessListErrorEvent(4000, errorMessage);
        }
    }

    @Override
    public void sendDataAccessListSuccessEvent(List<TechStar> techStarsList) {
        BusProvider.getInstance().post(new DataAccessListSuccessEvent(techStarsList));
    }

    @Override
    public void sendDataAccessListErrorEvent(int errorCode, String errorMessage) {

    }

    private boolean isValidList(List<TechStar> techStarsList) {
        return techStarsList != null && techStarsList.size() > 0;
    }
}
