package br.com.luisfernandezbr.challenge99.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;

public class DetailsActivity extends AppCompatActivity {

    private static final String EXTRA_TECH_STAR = "EXTRA_TECH_STAR";

    public static void start(Context context, TechStar techStar) {
        Intent starter = new Intent(context, DetailsActivity.class);
        starter.putExtra(EXTRA_TECH_STAR, techStar);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
