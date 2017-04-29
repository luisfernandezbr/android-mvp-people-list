package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import android.util.Log;

import java.io.IOException;
import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class TechStarsDataAccessImpl implements TechStarsDataAccess {

    private static final String TAG = "TechStarsDataAccessImpl";

    private DataService rawDataService;

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

    }

    @Override
    public void sendDataAccessListErrorEvent(int errorCode, String errorMessage) {

    }

    private boolean isValidList(List<TechStar> techStarsList) {
        return techStarsList != null && techStarsList.size() > 0;
    }
}
