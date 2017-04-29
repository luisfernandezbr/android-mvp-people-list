package br.com.luisfernandezbr.mvp;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.ViewGroup;

import java.lang.ref.WeakReference;

public abstract class BaseView {

    private WeakReference<ActivityLoader> mActivity;
    private ViewGroup mRootView;

    public BaseView(ActivityLoader activityLoader) {
        this.mActivity = new WeakReference<>(activityLoader);
        this.initDefaultViews(this.getLayoutResId());
        this.initViews();
    }

    private void initDefaultViews(int layoutResId) {
        getActivity().setContentView(layoutResId);
        mRootView = (ViewGroup) getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public Activity getActivity() {
        return mActivity.get().loadActivity();
    }

    public ViewGroup getRootView() {
        return mRootView;
    }

    public View findViewById(int resId) {
        return mRootView.findViewById(resId);
    }

    public String getString(@StringRes int resStringId) {
        return getActivity().getString(resStringId);
    }

    public void showView(View view) {
        view.setVisibility(View.VISIBLE);
    }

    public void hideView(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    public void goneView(View view) {
        view.setVisibility(View.GONE);
    }

    public void showView(@IdRes int viewResId) {
        View view = mRootView.findViewById(viewResId);
        showView(view);
    }

    public void hideView(@IdRes int viewResId) {
        View view = mRootView.findViewById(viewResId);
        hideView(view);
    }

    public void goneView(@IdRes int viewResId) {
        View view = mRootView.findViewById(viewResId);
        goneView(view);
    }

    protected abstract int getLayoutResId();

    protected abstract void initViews();
}
