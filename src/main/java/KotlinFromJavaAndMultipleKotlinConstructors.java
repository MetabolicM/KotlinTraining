import entities.TestKotlinEntity;

public class KotlinFromJavaAndMultipleKotlinConstructors {
    public static void main(String[] args) {
        TestKotlinEntity testKotlinEntity1 = new TestKotlinEntity("firstK", "secondK", 123);
        TestKotlinEntity testKotlinEntity2 = new TestKotlinEntity();
        TestKotlinEntity testKotlinEntity3 = new TestKotlinEntity("secondK");

        System.out.println(testKotlinEntity1);
        System.out.println(testKotlinEntity2);
        System.out.println(testKotlinEntity3);
    }
}
