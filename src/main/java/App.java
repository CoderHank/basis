import org.junit.Test;
import util.Log4jLogger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Hank on 2015/3/19.
 */
public class App {
    @Test
    public void testHello(){
        String a = "hello";
        String b = "hello";

        Log4jLogger.getLogger().info("日志输出");
        assertThat(a, is(b));
    }
}
