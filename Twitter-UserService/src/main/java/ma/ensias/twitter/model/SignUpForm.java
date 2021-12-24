package ma.ensias.twitter.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class SignUpForm {

    String username;
    String password;
    String email;
}
