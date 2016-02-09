/**
 * Created by zach on 2/9/16.
 */
public class UpperCasePerson extends Person {
    @Override
    public void setName(String name) {
        super.setName(name.toUpperCase());
    }
}
