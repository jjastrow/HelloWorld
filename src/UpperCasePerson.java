/**
 * Created by zach on 2/9/16.
 */
public class UpperCasePerson extends Person {
    public UpperCasePerson(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
        super.setName(name.toUpperCase());
    }
}
