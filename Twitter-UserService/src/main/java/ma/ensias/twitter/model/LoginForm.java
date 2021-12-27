package ma.ensias.twitter.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginForm {

    String username;
    String password;

}
