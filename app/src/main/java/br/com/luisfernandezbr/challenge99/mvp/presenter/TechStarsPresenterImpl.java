package br.com.luisfernandezbr.challenge99.mvp.presenter;

import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccess;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccessImpl;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListView;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListViewImpl;
import br.com.luisfernandezbr.mvp.ActivityLoader;
import br.com.luisfernandezbr.mvp.bus.BusProvider;

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
        BusProvider.getInstance().subscribe(this);
    }

    @Override
    public void onStop() {
        BusProvider.getInstance().unsubscribe(this);
    }

    @Override
    public void onViewLoadListEvent() {
        dataAccess.loadList();
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
