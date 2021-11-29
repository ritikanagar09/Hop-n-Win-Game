public class Calculator <T1> {
    private T1 ob1;
    private T1 ob2;

    public Calculator(T1 _t1, T1 _t2) {
        this.ob1 = _t1;
        this.ob2 = _t2;

    }

    public T1 Calculate() {

        boolean b = ob1 instanceof String && ob2 instanceof String;
        if (b) {

            String s1 = (String) ob1;
            String s2 = (String) ob2;
            String ans = s1 + s2;
            T1 obj = (T1) ans;
            return obj;


        } else {
            try {
                Integer I1 = (Integer) ob1;
                Integer I2 = (Integer) ob2;
                Integer ans1 = I1 + I2;
                T1 obj1 = (T1) ans1;
                return obj1;
            } catch (ClassCastException c) {
                System.out.println(c);
            }
        }
        throw new IllegalArgumentException("Argument must be String or Integer!");

    }


}





