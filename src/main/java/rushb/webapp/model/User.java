package rushb.webapp.model;

import lombok.Data;

@Data
public class User {
    private String username;
    private String email;
    private String password;
    private String userId;
}
