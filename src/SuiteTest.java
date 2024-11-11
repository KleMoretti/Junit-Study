import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Suite;


//这里一次可以类推

@RunWith(Suite.class)
@Suite.SuiteClasses({Test1.class,Test2.class})
public class SuiteTest {
    /*
     * 写一个空类：不包含任何方法
     * 更改测试运行器Suite.class
     * 将测试类作为数组传入到Suite.SuiteClasses（{}）中
     */
}