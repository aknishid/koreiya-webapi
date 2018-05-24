package work.gekokujo.koreiyawebapi.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private String UserUniqueId;

    private String name;

    private String mail;

    private  String password;

    private String introduction;

    private String userIcon;


}


