package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 1:55 PM
 */
public class RetryAndFollowUpInterceptor implements Interceptor{


    @Override
    public String intercept(Chain chain) {
//        System.out.println("开始执行第一个真正的 interceptor 中的 intercept 方法");
        chain.proceed("RetryAndFollowUpInterceptor");
        System.out.println("RetryAndFollowUpInterceptor");
        return "返回的值：RetryAndFollowUpInterceptor";
    }
}
