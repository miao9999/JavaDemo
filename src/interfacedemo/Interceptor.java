package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:59 PM
 */
public interface Interceptor {
    String intercept(Chain chain);

    interface Chain {
        String proceed(String request);
    }
}
