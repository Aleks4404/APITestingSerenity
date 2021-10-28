package starter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    String id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    String userStatus;
}
