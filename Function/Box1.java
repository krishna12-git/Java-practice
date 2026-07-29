public class Box1<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box1<String> stringBox = new Box1<>();
        stringBox.setValue("Hello, World!");
        System.out.println(stringBox.getValue());

        Box1<Integer> integerBox = new Box1<>();
        integerBox.setValue(123);
        System.out.println(integerBox.getValue());

        Box1<Float> FloatBox = new Box1<>();
        FloatBox.setValue(20.7f);
        System.out.println(FloatBox.getValue());

        Box1<Boolean> booleanBox = new Box1<>();
        booleanBox.setValue(true);
        System.out.println(booleanBox.getValue());

        Box1<Double> doubleBox = new Box1<>();
        doubleBox.setValue(99.99);
        System.out.println(doubleBox.getValue());



    }
}