package interfacedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:56 PM
 */
public class RealInterceptorChain implements Interceptor.Chain {
    int index;
    List<Interceptor> interceptors = new ArrayList<>();
    public RealInterceptorChain(int index,List<Interceptor> interceptors) {
        this.index = index;
        this.interceptors = interceptors;
    }

    @Override
    public String proceed(String request) {

        RealInterceptorChain next = new RealInterceptorChain(index + 1,interceptors);

        Interceptor interceptor = interceptors.get(index);

        System.out.println("遍历 interceptor 的值：第" + (index + 1) + "个 interceptor:");
        System.out.println("RealInterceptor：" + interceptor.getClass().getName());

        String intercept = interceptor.intercept(next);

////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("第" + (index +1) + "个 interceptor");
        System.out.println("interceptors:-----" + intercept);


        return "RealInterceptorChain:" + intercept;
    }
}
