package br.com.luisfernandezbr.challenge99.mvp.navigator;


import android.content.Context;

import br.com.luisfernandezbr.challenge99.android.activity.DetailsActivity;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class Navigator {


    public void navigateToDetailScreen(Context context, TechStar techStar) {
        DetailsActivity.start(context, techStar);
    }
}
