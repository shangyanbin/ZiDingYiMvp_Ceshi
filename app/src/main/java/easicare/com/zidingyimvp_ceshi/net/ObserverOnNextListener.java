package easicare.com.zidingyimvp_ceshi.net;

public interface ObserverOnNextListener<T> {
    void onNext(T t);
    void onError(String e);
}