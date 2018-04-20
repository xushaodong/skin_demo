package com.mizhi.skin_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import skin.support.SkinCompatManager;

/**
 * 类描述：
 *
 * @Author 许少东
 * Created at 2018/4/19.
 */

public class DialogActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mStartSkinDayButton;
    private Button mStartSkinNightButton,mShowDialogButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_activity);
        initView();
    }

    private void initView() {
        mStartSkinDayButton = findViewById(R.id.bt_start_skin_day);
        mStartSkinNightButton = findViewById(R.id.bt_start_skin_night);
        mShowDialogButton = findViewById(R.id.bt_show_dialog);
        mStartSkinDayButton.setOnClickListener(this);
        mStartSkinNightButton.setOnClickListener(this);
        mShowDialogButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mStartSkinDayButton){
            SkinCompatManager.getInstance().restoreDefaultTheme();
            finish();
        }else if(view == mStartSkinNightButton){
            SkinCompatManager.getInstance().loadSkin("night.skin", null, SkinCompatManager.SKIN_LOADER_STRATEGY_ASSETS);
            finish();
        }else if(view == mShowDialogButton){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("标题")
                    .setIcon(R.drawable.ic_refresh_24dp)
                    .setMessage("简单消息框")
                    .setPositiveButton("是", null)
                    .setNegativeButton("否", null)
                    .setNeutralButton("取消", null);
            builder.show();
        }
    }
}
