package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import android.content.Context;
import android.support.annotation.RawRes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.android.AndroidUtils;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class RawDataServiceImpl implements DataService {

    private Context context;

    public RawDataServiceImpl(Context context) {
        this.context = context;
    }

    @Override
    public List<TechStar> loadList() throws IOException {
        String jsonFromRaw = this.getJsonFromRaw(R.raw.mock_data_list);
        return this.getFromJson(jsonFromRaw);
    }

    private String getJsonFromRaw(@RawRes int resRawId) throws IOException {
        return AndroidUtils.getJsonFromRaw(context, resRawId);
    }

    private List<TechStar> getFromJson(String json) {
        Gson gson = new Gson();

        Type type = new TypeToken<List<TechStar>>() {
        }.getType();

        return gson.fromJson(json, type);
    }
}
