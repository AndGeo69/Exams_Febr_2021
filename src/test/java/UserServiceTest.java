import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    UserDB MockUser = new UserDB("user", "user");


    @Test
    public void testUserExistAndPasswordWeak() {
        UserService connection = new UserService(MockUser);
        boolean result = connection.changePassword("user", "newpass");
        Assert.assertFalse(result);
    }


    @Test
    public void testUserExistAndPasswordCorrect() {
        UserService connection = new UserService(MockUser);
        boolean result = connection.changePassword("user", "newBetterPassword!214");
        Assert.assertTrue(result);
    }


    @Test
    public void testUserNotExistAndPasswordCorrect() {
        UserService connection = new UserService(MockUser);
        boolean result = connection.changePassword("userNotEx", "newBetterPassword!214");
        Assert.assertFalse(result);
    }

//
}