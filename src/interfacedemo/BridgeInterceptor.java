package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:55 PM
 */
public class BridgeInterceptor implements Interceptor{
    @Override
    public String intercept(Chain chain) {
        chain.proceed("BridgeInterceptor");
        System.out.println("BridgeInterceptor");
        return "返回的值：BridgeInterceptor";
    }
}
