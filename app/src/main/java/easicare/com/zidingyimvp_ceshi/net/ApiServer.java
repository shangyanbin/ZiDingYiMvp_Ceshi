package easicare.com.zidingyimvp_ceshi.net;

import java.util.Map;
import easicare.com.zidingyimvp_ceshi.mvp_main.model.bean.LoginBean;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServer {
    //查询商品列表  http://192.168.1.166:8080/b2c/d21/shop//goods/search.do?keyword=%E7%89%9B%E5%A5%B6&page=1
    @POST("login")
    @FormUrlEncoded
    Observable<LoginBean> GetMedicine(@FieldMap Map<String, String> map);
}
