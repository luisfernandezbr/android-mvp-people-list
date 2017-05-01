package br.com.luisfernandezbr.challenge99.mvp.presenter;

import org.greenrobot.eventbus.Subscribe;

import java.util.List;

import br.com.luisfernandezbr.challenge99.event.DataAccessListSuccessEvent;
import br.com.luisfernandezbr.challenge99.event.ViewItemClickedEvent;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccess;
import br.com.luisfernandezbr.challenge99.mvp.dataaccess.TechStarsDataAccessImpl;
import br.com.luisfernandezbr.challenge99.mvp.navigator.Navigator;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListView;
import br.com.luisfernandezbr.challenge99.mvp.view.TechStarsListViewImpl;
import br.com.luisfernandezbr.challenge99.pojo.TechStar;
import br.com.luisfernandezbr.mvp.ActivityLoader;
import br.com.luisfernandezbr.mvp.bus.BusProvider;

public class TechStarsPresenterImpl implements TechStarsPresenter {

    private ActivityLoader activityLoader;
    private TechStarsListView view;
    private TechStarsDataAccess dataAccess;
    private Navigator navigator;

    public TechStarsPresenterImpl(ActivityLoader activityLoader) {
        this.activityLoader = activityLoader;
        this.dataAccess = new TechStarsDataAccessImpl(activityLoader.loadActivity().getApplicationContext());
        this.view = new TechStarsListViewImpl(activityLoader);
        this.navigator = new Navigator();
    }

    @Override
    public void init() {
        this.dataAccess.loadList();
    }

    @Subscribe
    @Override
    public void onViewItemClickedEvent(ViewItemClickedEvent event) {
        navigator.navigateToDetailScreen(event.getTechStar());
    }

    @Subscribe
    @Override
    public void onDataAccessListSuccessEvent(DataAccessListSuccessEvent event) {
        List<TechStar> techStarsList = event.getTechStarsList();
        this.view.showLoadListSuccess(techStarsList);
    }

    @Subscribe
    @Override
    public void onDataAccessListErrorEvent() {

    }

    @Override
    public void onStart() {
        BusProvider.getInstance().subscribe(this);
    }

    @Override
    public void onStop() {
        BusProvider.getInstance().unsubscribe(this);
    }
}
