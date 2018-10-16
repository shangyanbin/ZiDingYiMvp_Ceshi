package easicare.com.zidingyimvp_ceshi.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    public static ApiServer apiServer;
    public static String path="https://www.zhaoapi.cn/user/";
    public static ApiServer getInstance(){
        if(apiServer==null){
            synchronized (ApiServer.class){
                if(apiServer==null){
                    new Api();
                }
            }
        }
        return apiServer;
    }

    public Api() {
        OkHttpClient client = new OkHttpClient.Builder().
                connectTimeout(10, TimeUnit.SECONDS).
                readTimeout(10, TimeUnit.SECONDS).
                writeTimeout(10, TimeUnit.SECONDS).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(path)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
         apiServer = retrofit.create(ApiServer.class);
    }
}
