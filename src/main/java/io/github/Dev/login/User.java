package io.github.Dev.login;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User
{
    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Integer id;
    private String name;
    private String real_name;
    private String password;
    private String email;

    /**
     * Hibernate uses this one.
     */
    @SuppressWarnings("unused")
    public User()
    {

    }

    public User(String name, String real_name, String password, String email) {
        this.name = name;
        this.real_name = real_name;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
