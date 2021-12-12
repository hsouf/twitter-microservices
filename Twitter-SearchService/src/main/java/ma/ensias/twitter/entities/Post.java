package ma.ensias.twitter.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {

    @Id @GeneratedValue
    private Long id;
    private String texte;
    @ManyToMany
    private Set<HashTag> listHashTags;

}
