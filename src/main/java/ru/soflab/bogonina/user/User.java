package ru.soflab.bogonina.user;

/**
 * Пользователь
 */
public class User {
    private Long id;
    private String login;
    private String password;
    private String surname;
    private String firstName;

    /**
     * Получить id пользователя
     * @return id пользователя
     */
    public Long getId() {
        return id;
    }

    /**
     * Установить id пользователя
     * @param id id пользователя
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Получить логин пользователя
     * @return логин польователя
     */
    public String getLogin() {
        return login;
    }

    /**
     * Установить логин пользователя
     * @param login логин пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Получить пароль пользователя
     * @return пароль пользователя*/
    public String getPassword() {
        return password;
    }

    /**
     * Установить пароль пользователя
     * @param password пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Получить фамилию пользователя
     * @return фамилия пользователя
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Установить фамилию пользователя
     * @param surname фамилия пользователя
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Получить firstName пользователя
     * @return  firstName пользователя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Установить firstName пользователя
     * @param firstName firstName пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
