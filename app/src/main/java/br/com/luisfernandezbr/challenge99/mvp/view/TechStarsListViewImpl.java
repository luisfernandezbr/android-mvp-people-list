package br.com.luisfernandezbr.challenge99.mvp.view;

import java.util.List;

import br.com.luisfernandezbr.challenge99.R;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.ActivityLoader;
import br.com.luisfernandezbr.mvp.BaseView;

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

    }

    @Override
    public void sendViewLoadListEvent() {

    }

    @Override
    public void sendViewItemClickedEvent() {

    }

    @Override
    public void showLoadListSuccess(List<TechStar> techStarsList) {

    }

    @Override
    public void showLoadListError(int errorCode, String errorMessage) {

    }
}
