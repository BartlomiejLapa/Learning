class TestForward{
    String str;

    TestForward(String s){
        str = s;
    }

    void testForward (int idx){
        if(idx != str.length ()-1) testForward (idx+1);
        System.out.print(str.charAt (idx));
    }
}

public class Test66 {
    public static void main(String args[]){
            TestForward test = new TestForward ("to jest test");
            test.testForward (0);
    }
}
