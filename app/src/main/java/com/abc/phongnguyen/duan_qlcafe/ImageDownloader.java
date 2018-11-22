package com.abc.phongnguyen.duan_qlcafe;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.abc.phongnguyen.duan_qlcafe.adapter.SimpleIdlingResource;
import com.abc.phongnguyen.duan_qlcafe.model.Cafe;

import java.util.ArrayList;

public class ImageDownloader {

    private static final int DELAY_MILLIS = 3000;

    final static ArrayList<Cafe> mTeas = new ArrayList<>();

    interface DelayerCallback{
        void onDone(ArrayList<Cafe> teas);
    }

    static void downloadImage(Context context, final  DelayerCallback callback,
                              @Nullable final SimpleIdlingResource idlingResource){

        if (idlingResource != null) {
            idlingResource.setIdleState(false);
        }

        String text = context.getString(R.string.loading_msg);
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        mTeas.add(new Cafe(context.getString(R.string.black_tea_name), R.drawable.cafeden));
        mTeas.add(new Cafe(context.getString(R.string.green_tea_name), R.drawable.americano));
        mTeas.add(new Cafe(context.getString(R.string.white_tea_name), R.drawable.cappuccino));
        mTeas.add(new Cafe(context.getString(R.string.oolong_tea_name), R.drawable.escup));
        mTeas.add(new Cafe(context.getString(R.string.honey_lemon_tea_name), R.drawable.mocha));
        mTeas.add(new Cafe(context.getString(R.string.chamomile_tea_name), R.drawable.viennese));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    callback.onDone(mTeas);
                    if (idlingResource != null) {
                        idlingResource.setIdleState(true);
                    }
                }
            }
        }, DELAY_MILLIS);


    }
}
