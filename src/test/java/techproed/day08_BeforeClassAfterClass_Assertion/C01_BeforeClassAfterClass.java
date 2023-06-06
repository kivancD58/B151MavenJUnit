package techproed.day08_BeforeClassAfterClass_Assertion;

import org.junit.*;

public class C01_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodlari static olmak zorundadir.
     */

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("Her class'tan once BeforeClass Method'u bir kez calisir. ");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Her class'tan sonra AfterClass Method'u bir kez calisir.");
    }

    @Before
    public static void beforeClass() throws Exception {
        System.out.println("Her method'dan once Before(setUp) method'u bir kez calisir. ");
    }

    @After
    public static void afterClass() throws Exception {
        System.out.println("Her method'dan sonra After(tearDown) method'u bir kez calisir.");
    }

    @Test
    public void test01() {
        System.out.println("Test01 method'u calisti");
    }

    @Test
    public void test02() {
        System.out.println("Test02 method'u calisti");
    }

    @Test
    public void test03() {
        System.out.println("Test03 method'u calisti");
    }
}
