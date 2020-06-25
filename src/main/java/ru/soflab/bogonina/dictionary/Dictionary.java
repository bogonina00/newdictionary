package ru.soflab.bogonina.dictionary;

import ru.soflab.bogonina.user.User;

import java.util.List;

/**
 * Словарь
 */
public class Dictionary {
    private Long id;
    private User user;
    private LanguageType languageType;
    private List<Word> words;

    /**
     * Получить id словаря
     * @return id словаря
     */
    public Long getId() {
        return id;
    }

    /**
     * Установить id словаря
     * @param id словаря
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Получить пользоватля словарём
     * @return пользователь словаря
     */
    public User getUser() {
        return user;
    }

    /**
     * Установить словарь
     * @param user пользователь словаря
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Получить язык словаря
     * @return languageType язык словаря
     */
    public LanguageType getLanguageType() {
        return languageType;
    }

    /**
     * Установить язык словаря
     * @param languageType язык словаря
     */
    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    /**
     * Получить слова словаря
     * @return слова словаря
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Установить слова словаря
     * @param words слова словаря
     */
    public void setWords(List<Word> words) {
        this.words = words;
    }
}
