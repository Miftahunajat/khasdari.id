package com.biru.dev.khasdariid.ui.placedetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import com.daimajia.slider.library.SliderTypes.BaseSliderView
import com.daimajia.slider.library.SliderTypes.TextSliderView
import kotlinx.android.synthetic.main.activity_place_detail.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject
import com.daimajia.slider.library.SliderLayout
import kotlinx.android.synthetic.main.activity_place_detail.view.*


class PlaceDetailActivity : BaseActivity(), PlaceDetailMvpView {

    @Inject
    lateinit var mPresenter: PlaceDetailMvpPresenter<PlaceDetailMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)

        activityComponent.inject(this)

        mPresenter.onAttach(this@PlaceDetailActivity)

        setUp()

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        setSupportActionBar(main_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mPresenter.loadDataWisata(intent.getStringExtra("id").toInt())

        setUpTabLayout()
    }

    private fun setUpTabLayout() {
        val desc = tablayout_detail.newTab()
        val lokasi = tablayout_detail.newTab()
        val rute = tablayout_detail.newTab()
        val olehOleh = tablayout_detail.newTab()
        val review = tablayout_detail.newTab()

        desc.setIcon(R.drawable.ic_android_black_24dp)
        lokasi.setIcon(R.drawable.ic_android_black_24dp)
        rute.setIcon(R.drawable.ic_android_black_24dp)
        olehOleh.setIcon(R.drawable.ic_android_black_24dp)
        review.setIcon(R.drawable.ic_android_black_24dp)

        tablayout_detail.addTab(desc)
        tablayout_detail.addTab(lokasi)
        tablayout_detail.addTab(rute)
        tablayout_detail.addTab(olehOleh)
        tablayout_detail.addTab(review)

        val viewPagerAdapter = PlaceDetailPagerAdapter(supportFragmentManager)
        viewpager_detail.adapter = viewPagerAdapter
        viewpager_detail.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout_detail))
    }

    override fun setupSlider(photos: List<Int>) {


        slider_layout.stopAutoCycle()
        photos.reversed().forEach {
            val textSliderView = TextSliderView(this)
            textSliderView
                    .image(it)
                    .setScaleType(BaseSliderView.ScaleType.Fit)

            slider_layout.addSlider(textSliderView)
        }
        slider_layout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom)
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, PlaceDetailActivity::class.java)
        }
    }

    override fun setTitleName(name: String) {
        tv_place_detail_name.text = name
    }
}
