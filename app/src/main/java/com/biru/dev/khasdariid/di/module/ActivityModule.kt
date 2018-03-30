package com.groot.indonesia.grootapp.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.biru.dev.khasdariid.di.ActivityContext
import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.login.LoginMvpPresenter
import com.biru.dev.khasdariid.ui.login.LoginMvpView
import com.biru.dev.khasdariid.ui.login.LoginPresenter
import com.biru.dev.khasdariid.ui.main.MainMvpPresenter
import com.biru.dev.khasdariid.ui.main.MainMvpView
import com.biru.dev.khasdariid.ui.main.MainPresenter
import com.biru.dev.khasdariid.ui.register.RegisterMvpPresenter
import com.biru.dev.khasdariid.ui.register.RegisterMvpView
import com.biru.dev.khasdariid.ui.register.RegisterPresenter
import com.biru.dev.khasdariid.ui.splash.SplashMvpPresenter
import com.biru.dev.khasdariid.ui.splash.SplashMvpView
import com.biru.dev.khasdariid.ui.splash.SplashPresenter


import dagger.Module
import dagger.Provides

/**
 * Created by miftahun on 3/9/18.
 */

@Module
class ActivityModule(val mActivity: AppCompatActivity) {

    @Provides
    @ActivityContext
    internal fun provideContext(): Context {
        return this.mActivity
    }

    @Provides
    internal fun provideActivity(): AppCompatActivity {
        return this.mActivity
    }

    @Provides
    @PerActivity
    internal fun provideLoginPresenter(
            presenter: LoginPresenter<LoginMvpView>): LoginMvpPresenter<LoginMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideRegisterPresenter(
            presenter: RegisterPresenter<RegisterMvpView>): RegisterMvpPresenter<RegisterMvpView> {
        return presenter
    }


    @Provides
    @PerActivity
    internal fun provideSplashPresenter(
            presenter: SplashPresenter<SplashMvpView>): SplashMvpPresenter<SplashMvpView> {
        return presenter
    }
//
    @Provides
    @PerActivity
    internal fun provideMainPresenter(
            presenter: MainPresenter<MainMvpView>): MainMvpPresenter<MainMvpView> {
        return presenter
    }
}
