package com.xx.login;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xx.base.BaseActivity;
import com.xx.base.ConstantUrls;

@Route(path = ConstantUrls.LoginUrl)
public class LoginActivity extends BaseActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv = findViewById(R.id.login_tv);
        tv.setOnClickListener(view -> {
            ARouter.getInstance().build(ConstantUrls.RegUrl).navigation();
        });
    }
}
