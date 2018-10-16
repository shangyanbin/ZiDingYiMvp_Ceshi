package easicare.com.zidingyimvp_ceshi.mvp_main.view.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import easicare.com.zidingyimvp_ceshi.R;
import easicare.com.zidingyimvp_ceshi.base.BaseActivity;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;
import easicare.com.zidingyimvp_ceshi.mvp_main.presenter.LoginPresenter;
import easicare.com.zidingyimvp_ceshi.mvp_main.view.view.iview.ILoginView;

public class MainActivity extends BaseActivity<LoginPresenter> implements ILoginView {


    @Override
    protected LoginPresenter providePresenter() {
        return new LoginPresenter(MainActivity.this,this);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initListener() {
        super.initListener();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login("15501186523", "123456");
            }
        });
    }

    @Override
    protected Context initView() {
        return MainActivity.this;
    }

    @Override
    public void Success(LoginBean bean) {
        Toast.makeText(context, ""+bean.getMsg(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Error(String e) {
        Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context cotext() {
        return null;
    }
}
