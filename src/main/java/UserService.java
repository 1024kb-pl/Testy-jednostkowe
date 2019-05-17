public class UserService {
    private final UserDao userDao = new UserDao();
    private final UserValidator userValidator = new UserValidator();

    public User createUser(User user) {
        userValidator.validate(user);

        return userDao.create(user);
    }

    public void removeUser(Long userId) {
        boolean result = userDao.delete(userId);

        if (!result) {
            throw new RuntimeException("User with id: " + userId + " doesn't exist.");
        }
    }
}
