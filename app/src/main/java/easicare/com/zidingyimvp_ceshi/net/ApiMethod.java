package easicare.com.zidingyimvp_ceshi.net;

import java.util.Map;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ApiMethod {
    public static void ApiSubscribe(Observable observable, Observer observer){
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
    //添加药品的展示列表
    public static  void SetLogin(Observer<LoginBean> observer, Map<String,String> map){
        ApiSubscribe(Api.getInstance().GetMedicine(map),observer);
    }

}
