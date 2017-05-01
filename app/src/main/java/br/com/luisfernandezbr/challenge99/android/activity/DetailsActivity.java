package br.com.luisfernandezbr.challenge99.android.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.antonioleiva.materializeyourapp.widgets.SquareImageView;
import com.bumptech.glide.Glide;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.mobiplus.simplerecylerview.util.TypefaceUtil;

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

        TechStar techStar = this.loadFrom(getIntent());

        this.setUpToolbar(techStar.getName());
        this.setUpFabButton();
        this.configTextBio(techStar);

        Glide.with(this)
                .load(techStar.getImage())
                .crossFade()
                .into((SquareImageView) findViewById(R.id.imageProfile));
    }

    private TechStar loadFrom(Intent intent) {
        return (TechStar) intent.getSerializableExtra(EXTRA_TECH_STAR);
    }

    private void setUpToolbar(String name) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(name);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setUpFabButton() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is a fake action. :P", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void configTextBio(TechStar techStar) {
        TextView textBio = (TextView) findViewById(R.id.textBio);
        textBio.setText(this.getBioDescription(techStar));
        this.applyFont(textBio);
    }

    private String getBioDescription(TechStar techStar) {
        return TextUtils.isEmpty(techStar.getBio()) ? this.getDefaultBioDescription() : techStar.getBio();
    }

    @NonNull
    private String getDefaultBioDescription() {
        return getString(R.string.details_description_not_available);
    }

    private void applyFont(TextView textBio) {
        TypefaceUtil.defineTextStyle(getApplicationContext(), textBio, "fonts/roboto-light.ttf");
    }
}
