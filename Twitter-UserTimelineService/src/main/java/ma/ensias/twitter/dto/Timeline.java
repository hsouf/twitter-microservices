package ma.ensias.twitter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.ensias.twitter.entities.Tweet;
import ma.ensias.twitter.entities.User;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Timeline {


    private User user;
    private Set<Tweet> tweets;




}