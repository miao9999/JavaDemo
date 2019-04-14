package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:55 PM
 */
public class CacheInterceptor implements Interceptor{
    @Override
    public String intercept(Chain chain) {
        chain.proceed("CacheInterceptor");
        System.out.println("CacheInterceptor");
        return "CacheInterceptor";
    }
}
