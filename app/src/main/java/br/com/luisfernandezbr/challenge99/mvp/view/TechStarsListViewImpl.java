package br.com.luisfernandezbr.challenge99.mvp.view;

import android.support.annotation.IdRes;
import android.view.View;

import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.event.ViewLoadListEvent;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.ActivityLoader;
import br.com.luisfernandezbr.mvp.BaseView;
import br.com.luisfernandezbr.mvp.bus.BusProvider;
import br.com.mobiplus.simplerecylerview.SimpleLinearRecyclerView;
import br.com.mobiplus.simplerecylerview.adapter.OnItemClickListener;

public class TechStarsListViewImpl extends BaseView implements TechStarsListView {

    public TechStarsListViewImpl(ActivityLoader activityLoader) {
        super(activityLoader);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_techstars_list;
    }

    @Override
    protected void initViews() {

        this.sendViewLoadListEvent();
    }

    @Override
    public void sendViewLoadListEvent() {
        BusProvider.getInstance().post(new ViewLoadListEvent());
    }

    @Override
    public void sendViewItemClickedEvent() {

    }

    @Override
    public void showLoadListSuccess(List<TechStar> techStarsList) {
        SimpleLinearRecyclerView recyclerView = (SimpleLinearRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setCollection(techStarsList, new OnItemClickListener<TechStar>() {

            @Override
            public void onItemClick(TechStar item, @IdRes int resId) {

            }
        });
    }

    @Override
    public void showLoadListError(int errorCode, String errorMessage) {

    }
}
