package easicare.com.zidingyimvp_ceshi.mvp_main.model;

import android.content.Context;

import java.util.HashMap;

import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;
import easicare.com.zidingyimvp_ceshi.net.ApiMethod;
import easicare.com.zidingyimvp_ceshi.net.MyObserver;
import easicare.com.zidingyimvp_ceshi.net.ObserverOnNextListener;

public class LoginModel {
    public void login(Context context, String phone, String pwd, final LoginPanDuan loginPanDuan) {
        ObserverOnNextListener<LoginBean> listener = new ObserverOnNextListener<LoginBean>() {
            @Override
            public void onNext(LoginBean loginBean) {
                if(loginBean.getCode().equals("0")){
                    loginPanDuan.Success(loginBean);
                }
            }

            @Override
            public void onError(String e) {
                loginPanDuan.Failer(e);

            }
        };
        HashMap<String, String> map = new HashMap<>();
        map.put("source","android");
        map.put("mobile",phone);
        map.put("password",pwd);
        ApiMethod.SetLogin(new MyObserver<LoginBean>(context,listener),map);
    }

    public interface LoginPanDuan{
        void Success(LoginBean bean);
        void Failer(String e);
    }
}
