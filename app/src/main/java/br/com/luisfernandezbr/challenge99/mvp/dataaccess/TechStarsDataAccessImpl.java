package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.android.AndroidUtils;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class TechStarsDataAccessImpl implements TechStarsDataAccess {

    public static final String TAG = "TechStarsDataAccessImpl";
    private Context context;

    @Override
    public void loadList() {
        String jsonFromRaw = null;

        try {
            jsonFromRaw = AndroidUtils.getJsonFromRaw(context, R.raw.mock_data_list);

            List<TechStar> techStarsList = this.getFromJson(jsonFromRaw);

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
        return false;
    }

    private List<TechStar> getFromJson(String json) {
        return null;
    }
}
