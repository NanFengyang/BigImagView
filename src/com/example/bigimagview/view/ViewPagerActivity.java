package com.example.bigimagview.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.example.bigimagview.R;

/**
 * Created by liuheng on 2015/8/19.
 */
public class ViewPagerActivity extends Activity {

	private ViewPager mPager;

	private int[] imgsId = new int[] { R.drawable.aaa, R.drawable.bbb, R.drawable.ccc, R.drawable.ddd,
			R.drawable.ic_launcher, R.drawable.image003 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_pager);

		mPager = (ViewPager) findViewById(R.id.pager);
		mPager.setPageMargin((int) (getResources().getDisplayMetrics().density * 15));
		mPager.setAdapter(new PagerAdapter() {
			@Override
			public int getCount() {
				return imgsId.length;
			}

			@Override
			public boolean isViewFromObject(View view, Object object) {
				return view == object;
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				PhotoView view = new PhotoView(ViewPagerActivity.this);
				view.enable();
				view.setImageResource(imgsId[position]);
				container.addView(view);
				return view;
			}

			@Override
			public void destroyItem(ViewGroup container, int position, Object object) {
				container.removeView((View) object);
			}
		});
	}
}
