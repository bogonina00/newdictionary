package ru.soflab.bogonina.dictionary;

/**
 * Слово
 */
public class Word {
    private String transcription;
    private String translation;
    /*private String native*/
    private Long id;

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
}
