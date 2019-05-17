import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void shouldNoThrowAnyExceptionWhileValidationCorrectUser() {
        // given
        User user = new User("pablo", "password");
        UserValidator userValidator = new UserValidator();

        // when
        userValidator.validate(user);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhileValidationUserWithTooShortLogin() {
        // given
        User user = new User("as", "password");
        UserValidator userValidator = new UserValidator();

        // when
        userValidator.validate(user);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhileValidationUserWithTooShortPassword() {
        // given
        User user = new User("pablo", "pass");
        UserValidator userValidator = new UserValidator();

        // when
        userValidator.validate(user);
    }
}
