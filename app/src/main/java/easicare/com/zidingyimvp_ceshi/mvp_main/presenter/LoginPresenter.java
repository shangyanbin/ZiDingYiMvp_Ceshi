package easicare.com.zidingyimvp_ceshi.mvp_main.presenter;

import android.content.Context;

import easicare.com.zidingyimvp_ceshi.base.BasePresenter;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.LoginModel;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;
import easicare.com.zidingyimvp_ceshi.mvp_main.view.view.iview.ILoginView;

public class LoginPresenter extends BasePresenter<ILoginView>{

    private LoginModel model;
    private Context context;
    public LoginPresenter(Context context,ILoginView view) {
        super(view);
        this.context=context;
    }

    @Override
    protected void initModel() {
        model = new LoginModel();
    }

    public void login(String phone, String pwd) {
        if(phone.equals("")){
            if(view!=null){
                view.Error("手机号不能为空");
            }
        }

        model.login(context, phone, pwd, new LoginModel.LoginPanDuan() {
            @Override
            public void Success(LoginBean bean) {
                view.Success(bean);
            }

            @Override
            public void Failer(String e) {
                view.Error(e);
            }
        });
    }
}
