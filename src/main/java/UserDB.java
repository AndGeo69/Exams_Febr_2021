public class UserDB {

     private String username = "";
     private String password = "";

     public UserDB(String username, String password) {
          this.username = username;
          this.password = password;
     }

     boolean changePassword(String username, String password) {
          if(this.username.equals(username)) {
               this.password = password;
               return true;
          } else return false;
     }
}