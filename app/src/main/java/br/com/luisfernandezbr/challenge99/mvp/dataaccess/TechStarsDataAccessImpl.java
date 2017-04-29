package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import android.content.Context;

import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.android.AndroidUtils;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class TechStarsDataAccessImpl implements TechStarsDataAccess {

    private Context context;

    @Override
    public void loadList() {
        String jsonFromRaw = AndroidUtils.getJsonFromRaw(context, R.raw.mock_data_list);

        List<TechStar> techStarsList = this.getFromJson(jsonFromRaw);

        if (this.isValidList(techStarsList)) {
            this.sendDataAccessListSuccessEvent(techStarsList);
        }
    }

    @Override
    public void sendDataAccessListSuccessEvent(List<TechStar> techStarsList) {

    }

    private boolean isValidList(List<TechStar> techStarsList) {
        return false;
    }

    private List<TechStar> getFromJson(String json) {
        return null;
    }
}
