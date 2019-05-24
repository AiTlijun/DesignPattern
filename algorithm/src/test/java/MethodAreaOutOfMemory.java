import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: MethodAreaOutOfMemory
 * @Description: 方法去溢出
 * @Author: lijun
 * @Date: 2019/4/19 0019下午 5:03
 * @Version: 1.0.0$
 **/
public class MethodAreaOutOfMemory {
    /**
     * @param args
     * @Author YHJ create at 2011-11-12 下午08:47:51
     */

    public static void main(String[] args) {

        while (true) {

            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(TestCase.class);

            enhancer.setUseCache(false);

            enhancer.setCallback(new MethodInterceptor() {

                public Object intercept(Object arg0, Method arg1, Object[] arg2,

                                        MethodProxy arg3) throws Throwable {

                    return arg3.invokeSuper(arg0, arg2);

                }

            });

            enhancer.create();

        }

    }
}
