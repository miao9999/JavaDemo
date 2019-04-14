package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:59 PM
 */
public class ConnectInterceptor implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        chain.proceed("ConnectInterceptor");
        System.out.println("ConnectInterceptor");
        return "返回的值：ConnectInterceptor";
    }
}
