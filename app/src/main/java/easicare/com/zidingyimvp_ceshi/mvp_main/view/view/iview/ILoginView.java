package easicare.com.zidingyimvp_ceshi.mvp_main.view.view.iview;

import android.content.Context;

import easicare.com.zidingyimvp_ceshi.base.IView;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;

public interface ILoginView extends IView {
    void Success(LoginBean bean);
    void Error(String e);
}
