package domain;

/**
 * Представляє співробітника, який є художником (Artist).
 * Успадковується від {@link Employee} та додає інформацію про навички.
 *
 * @author Glerik
 * @version 1.0
 * @since 29.04.25
 * @see Employee
 */
public class Artist extends Employee {

    /**
     * Створює нового художника із заданими навичками та деталями співробітника.
     * Викликає відповідний конструктор базового класу {@link Employee}.
     *
     * @param skiils Масив рядків, що представляють навички художника.
     * @param name Ім'я художника.
     * @param jobTitle Посада художника.
     * @param level Рівень художника (1-3).
     * @param dept Відділ художника.
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює нового художника із заданими навичками та значеннями співробітника за замовчуванням.
     * Викликає конструктор базового класу {@link Employee} без аргументів.
     *
     * @param skiils Масив рядків, що представляють навички художника.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює нового художника зі значеннями за замовчуванням.
     * Викликає конструктор базового класу {@link Employee} без аргументів
     * та ініціалізує масив навичок розміром 10.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Надає рядкове представлення об'єкта Artist, включаючи інформацію про співробітника та навички.
     * @return Відформатований рядок, що містить деталі про художника.
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    // Приватне поле, що зберігає навички. Документується опосередковано через геттери/сеттери.
    private String[] skiils; // Примітка: в коді присутня друкарська помилка "skiils" замість "skills"

    /**
     * Повертає навички художника як єдиний рядок, розділений комою.
     * @return Рядок, що містить список навичок, розділених комою.
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       // Перевірка на випадок порожнього масиву skiils, щоб уникнути помилки substring
       if (s.length() > 0) {
           s=s.substring(0, s.length() - 2); // Видаляє останню кому та пробіл
       }
        return s;
    }

    /**
     * Встановлює масив навичок для художника.
     * @param skills Масив рядків, що представляють нові навички художника.
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

     /**
     * Повертає масив навичок художника.
     * @return Масив рядків, що представляють навички художника.
     */
    public String[] getSkillsLSist() { // Примітка: в коді присутня друкарська помилка "getSkillsLSist" замість "getSkillsList"
        return skiils;
    }
}