import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class UserDaoTest {
    @Test
    public void shouldCorrectCreateUser() {
        // given
        UserDao userDao = new UserDao();
        User user = new User("pablo", "pablo123");

        // when
        User resultUser = userDao.create(user);
        User expectedUser = userDao.getById(0L).get();

        // then
        Assert.assertEquals(expectedUser, resultUser);
    }
    @Test
    public void shouldReturnUserWhileGetById() {
        // given
        UserDao userDao = new UserDao();
        User user = new User("pablo", "pablo123");
        User expectedUser = new User("pablo", "pablo123");
        expectedUser.setId(0L);

        // when
        userDao.create(user);
        Optional<User> resultUser = userDao.getById(0L);

        // then
        Assert.assertEquals(Optional.of(expectedUser), resultUser);
    }
    @Test
    public void shouldReturnEmptyOptionalWhileGetById() {
        // given
        UserDao userDao = new UserDao();

        // when
        Optional<User> resultUser = userDao.getById(0L);

        // then
        Assert.assertEquals(Optional.empty(), resultUser);
    }
}
