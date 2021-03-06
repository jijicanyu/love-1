package com.yc.verbaltalk.skill.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.yc.verbaltalk.R;
import com.yc.verbaltalk.base.activity.BaseSameActivity;

public class LoveDialogueActivity extends BaseSameActivity {

    private String mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_dialogue);
    }

    private void initIntent() {
        Intent intent = getIntent();
        mTitle = intent.getStringExtra("title");
    }
    public static void startLoveDialogueActivity(Context context,String title){
        Intent intent = new Intent(context, LoveDialogueActivity.class);
        intent.putExtra("title",title);
        context.startActivity(intent);
    }

    @Override
    protected String offerActivityTitle() {
        return mTitle;
    }
}
