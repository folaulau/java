import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int    id;

    private String firstName;

    private String lastName;

    private int    age;

    public static User generateUserFromResultset(ResultSet rs) {
        User user = new User();

        try {
            int id = rs.getInt("id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");

            user.setId(id);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setAge(age);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return user;
    }

}
