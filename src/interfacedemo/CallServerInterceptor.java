package interfacedemo;

/**
 * Created with IntelliJ IDEA
 *
 * @author limiao
 * @create 2019-01-31 2:10 PM
 */
public class CallServerInterceptor implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        System.out.println("interceptors 中最后一个 interceptor， intercept 中不再执行 chain,遍历结束，开始返回值");
        System.out.println("CallServerInterceptor");
        return "返回的值：CallServerInterceptor";
    }
}
