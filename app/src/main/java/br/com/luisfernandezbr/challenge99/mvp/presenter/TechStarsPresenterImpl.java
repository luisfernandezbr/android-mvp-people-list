package br.com.luisfernandezbr.challenge99.mvp.presenter;

import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccess;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccessImpl;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListView;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListViewImpl;
import br.com.luisfernandezbr.mvp.ActivityLoader;

class TechStarsPresenterImpl implements TechStarsPresenter {

    private ActivityLoader activityLoader;
    private TechStarsListView view;
    private TechStarsDataAccess dataAccess;

    @Override
    public void init(ActivityLoader activityLoader) {
        this.activityLoader = activityLoader;
        this.view = new TechStarsListViewImpl(activityLoader);
        this.dataAccess = new TechStarsDataAccessImpl();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onViewLoadListEvent() {

    }

    @Override
    public void onViewItemClickedEvent() {

    }

    @Override
    public void onDataAccessListSuccessEvent() {

    }

    @Override
    public void onDataAccessListErrorEvent() {

    }
}
