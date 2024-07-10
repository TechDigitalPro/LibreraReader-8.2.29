package me.foobnix.pdf.info;

import android.app.Application;

import me.nostra13.universalimageloader.core.ImageLoader;
import me.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class TestAppName extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).threadPoolSize(1)//
				.threadPriority(5)//
				.defaultDisplayImageOptions(IMG.displayCacheMemoryDisc).build();

		ImageLoader.getInstance().init(config);
	}
}
