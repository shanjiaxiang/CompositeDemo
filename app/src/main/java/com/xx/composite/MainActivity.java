package com.xx.composite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xx.base.ConstantUrls;
import com.xx.login.LoginActivity;

@Route(path = ConstantUrls.MainUrl)
public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.main_tv);
        tv.setOnClickListener(v->{
            startActivity(new Intent(this, LoginActivity.class));
//            ARouter.getInstance().build(ConstantUrls.LoginUrl).navigation();
        });
    }
}
