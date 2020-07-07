package ru.soflab.bogonina.dictionary;

/**
 * Слово
 */
public class Word {
    private Long id;
    private String transcription;
    private String translation;
    private String natural;/*вместо native*/

    /**
     * Получить id слова
     * @return id слова
     */
    public Long getId() {
        return id;
    }

    /**
     * Установить id слова
     * @param id id слова
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Полчить перевод слова
     * @return перевод слова
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Установить перевод слова
     * @param translation перевод слова*/
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * Получить транскрипцию слова
     * @return транскрипция слова
     */
    public String getTranscription() {
        return transcription;
    }

    /**
     * Установить перевод слова
     * @param transcription транскрипция слова
     */
    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    /**
     * Получить слово на родном языке
     * @return  natural
     */
    public String getNatural() {
        return natural;
    }

    /**
     * Установить слово на родном языке
     * @param natural слово на родном языке
     */
    public void setNatural(String natural) {
        this.natural = natural;
    }
}
