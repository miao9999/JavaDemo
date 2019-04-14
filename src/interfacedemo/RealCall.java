package interfacedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:55 PM
 */
public class RealCall {

    public static void main(String[] args) {
        List<Interceptor> interceptors = new ArrayList<>();

        interceptors.add(new RetryAndFollowUpInterceptor());
        interceptors.add(new BridgeInterceptor());
        interceptors.add(new CacheInterceptor());
        interceptors.add(new ConnectInterceptor());
        interceptors.add(new CallServerInterceptor());


        RealInterceptorChain chain = new RealInterceptorChain(0,interceptors);

        String real_call = chain.proceed("real call");

        System.out.println("由 RealInterceptorChain 返回的值： "+real_call);
    }
}
