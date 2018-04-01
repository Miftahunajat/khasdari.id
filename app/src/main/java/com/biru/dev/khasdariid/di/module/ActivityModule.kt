package com.groot.indonesia.grootapp.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.biru.dev.khasdariid.di.ActivityContext
import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.detaildeskripsi.DetailDeskripsiMvpPresenter
import com.biru.dev.khasdariid.ui.detaildeskripsi.DetailDeskripsiMvpView
import com.biru.dev.khasdariid.ui.detaildeskripsi.DetailDeskripsiPresenter
import com.biru.dev.khasdariid.ui.detaillokasi.DetailLokasiMvpPresenter
import com.biru.dev.khasdariid.ui.detaillokasi.DetailLokasiMvpView
import com.biru.dev.khasdariid.ui.detaillokasi.DetailLokasiPresenter
import com.biru.dev.khasdariid.ui.detailoleholeh.DetailOlehOlehMvpPresenter
import com.biru.dev.khasdariid.ui.detailoleholeh.DetailOlehOlehMvpView
import com.biru.dev.khasdariid.ui.detailoleholeh.DetailOlehOlehPresenter
import com.biru.dev.khasdariid.ui.detailreview.DetailReviewMvpPresenter
import com.biru.dev.khasdariid.ui.detailreview.DetailReviewMvpView
import com.biru.dev.khasdariid.ui.detailreview.DetailReviewPresenter
import com.biru.dev.khasdariid.ui.detailrute.DetailRuteMvpPresenter
import com.biru.dev.khasdariid.ui.detailrute.DetailRuteMvpView
import com.biru.dev.khasdariid.ui.detailrute.DetailRutePresenter
import com.biru.dev.khasdariid.ui.home.*
import com.biru.dev.khasdariid.ui.login.LoginMvpPresenter
import com.biru.dev.khasdariid.ui.login.LoginMvpView
import com.biru.dev.khasdariid.ui.login.LoginPresenter
import com.biru.dev.khasdariid.ui.main.MainMvpPresenter
import com.biru.dev.khasdariid.ui.main.MainMvpView
import com.biru.dev.khasdariid.ui.main.MainPresenter
import com.biru.dev.khasdariid.ui.oleholeh.OlehOlehMvpPresenter
import com.biru.dev.khasdariid.ui.oleholeh.OlehOlehMvpView
import com.biru.dev.khasdariid.ui.oleholeh.OlehOlehPresenter
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailMvpPresenter
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailMvpView
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailPresenter
import com.biru.dev.khasdariid.ui.register.RegisterMvpPresenter
import com.biru.dev.khasdariid.ui.register.RegisterMvpView
import com.biru.dev.khasdariid.ui.register.RegisterPresenter
import com.biru.dev.khasdariid.ui.splash.SplashMvpPresenter
import com.biru.dev.khasdariid.ui.splash.SplashMvpView
import com.biru.dev.khasdariid.ui.splash.SplashPresenter
import com.biru.dev.khasdariid.ui.userinfo.UserInfoMvpPresenter
import com.biru.dev.khasdariid.ui.userinfo.UserInfoMvpView
import com.biru.dev.khasdariid.ui.userinfo.UserInfoPresenter


import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import java.util.ArrayList

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

    @Provides
    @PerActivity
    internal fun provideHomePresenter(
            presenter: HomePresenter<HomeMvpView>): HomeMvpPresenter<HomeMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun providePlaceDetailPresenter(
            presenter: PlaceDetailPresenter<PlaceDetailMvpView>): PlaceDetailMvpPresenter<PlaceDetailMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideDetailRutePresenter(
            presenter: DetailRutePresenter<DetailRuteMvpView>): DetailRuteMvpPresenter<DetailRuteMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideDetailDeskripsiPresenter(
            presenter: DetailDeskripsiPresenter<DetailDeskripsiMvpView>): DetailDeskripsiMvpPresenter<DetailDeskripsiMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideDetailLokasiPresenter(
            presenter: DetailLokasiPresenter<DetailLokasiMvpView>): DetailLokasiMvpPresenter<DetailLokasiMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideDetailOlehOlehPresenter(
            presenter: DetailOlehOlehPresenter<DetailOlehOlehMvpView>): DetailOlehOlehMvpPresenter<DetailOlehOlehMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideDetailReviewPresenter(
            presenter: DetailReviewPresenter<DetailReviewMvpView>): DetailReviewMvpPresenter<DetailReviewMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideUserInfoPresenter(
            presenter: UserInfoPresenter<UserInfoMvpView>): UserInfoMvpPresenter<UserInfoMvpView> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideOlehOlehPresenter(
            presenter: OlehOlehPresenter<OlehOlehMvpView>): OlehOlehMvpPresenter<OlehOlehMvpView> {
        return presenter
    }

    @Provides
    internal fun provideWisataPopular(): WisataPopularAdapter = WisataPopularAdapter(ArrayList())

    @Provides
    internal fun provideOlehOlehPopular(): OlehOlehAdapter = OlehOlehAdapter(ArrayList())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }
}
