package br.com.luisfernandezbr.challenge99.mvp.view;

import android.support.annotation.IdRes;

import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.event.ViewItemClickedEvent;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.ActivityLoader;
import br.com.luisfernandezbr.mvp.BaseView;
import br.com.luisfernandezbr.mvp.bus.BusProvider;
import br.com.mobiplus.simplerecylerview.SimpleLinearRecyclerView;
import br.com.mobiplus.simplerecylerview.adapter.OnItemClickListener;

public class TechStarsListViewImpl extends BaseView implements TechStarsListView {

    private SimpleLinearRecyclerView recyclerView;

    public TechStarsListViewImpl(ActivityLoader activityLoader) {
        super(activityLoader);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_techstars_list;
    }

    @Override
    protected void initViews() {
        recyclerView = (SimpleLinearRecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    public void sendViewItemClickedEvent(TechStar techStar) {
        BusProvider.getInstance().post(new ViewItemClickedEvent(techStar));
    }

    @Override
    public void showLoadListSuccess(List<TechStar> techStarsList) {
        recyclerView.setCollection(techStarsList, new OnItemClickListener<TechStar>() {

            @Override
            public void onItemClick(TechStar techStar, @IdRes int resId) {
                TechStarsListViewImpl.this.sendViewItemClickedEvent(techStar);
            }
        });
    }

    @Override
    public void showLoadListError(int errorCode, String errorMessage) {

    }
}
