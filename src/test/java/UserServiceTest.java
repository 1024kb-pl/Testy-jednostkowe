import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    @Test
    public void shouldCorrectAddNewUser() {
        // given
        UserService userService = new UserService();
        User user = new User("pablo", "pablo123");
        User expectedUser = new User("pablo", "pablo123");
        expectedUser.setId(0L);

        // when
        User resultUser = userService.createUser(user);

        // then
        Assert.assertEquals(expectedUser, resultUser);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowLoginExceptionWhileCreatingNewUser() {
        // given
        UserService userService = new UserService();
        User user = new User("pa", "pablo123");

        // when
        userService.createUser(user);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowPasswordExceptionWhileCreatingNewUser() {
        // given
        UserService userService = new UserService();
        User user = new User("pablo", "pass");

        // when
        userService.createUser(user);
    }

    @Test
    public void shouldCorrectRemoveUser() {
        // given
        UserService userService = new UserService();
        User user = new User("pablo", "pablo123");
        userService.createUser(user);


        //when
        userService.removeUser(0L);
    }
    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenUserDoesntExistWhileRemoving() {
        // given
        UserService userService = new UserService();

        //when
        userService.removeUser(1L);
    }

}
