package com.xx.register;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xx.base.BaseActivity;
import com.xx.base.ConstantUrls;

@Route(path = ConstantUrls.RegUrl)
public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
