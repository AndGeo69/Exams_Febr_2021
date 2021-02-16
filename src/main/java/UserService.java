public class UserService {

    private UserDB user = null;

    public UserService(UserDB user) {
        this.user = user;
    }

    public UserService() {
    }

    boolean changePassword(String username, String password) {
        if(password.length() < 8) {
            return false;
        } else return user.changePassword(username, password);
    }
}