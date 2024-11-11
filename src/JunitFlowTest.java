import org.junit.*;


public class JunitFlowTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("beforeClass...");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("afterClass...");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before...");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }
    @Test
    public void test1() {
        System.out.println("test1方法...");
    }
    @Test
    public void test2(){
        System.out.println("test2方法...");
    }
}