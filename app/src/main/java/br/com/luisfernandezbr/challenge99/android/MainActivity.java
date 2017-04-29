package br.com.luisfernandezbr.challenge99.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.luisfernandezbr.challenge99.mvp.presenter.TechStarsPresenter;
import br.com.luisfernandezbr.challenge99.mvp.presenter.TechStarsPresenterImpl;
import br.com.luisfernandezbr.mvp.ActivityLoader;

public class MainActivity extends AppCompatActivity {

    private TechStarsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new TechStarsPresenterImpl(this.getActivityLoader());
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.init();
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.presenter.onStop();
    }

    private ActivityLoader getActivityLoader() {
        return new ActivityLoader() {
            @Override
            public Activity loadActivity() {
                return MainActivity.this;
            }
        };
    }
}
