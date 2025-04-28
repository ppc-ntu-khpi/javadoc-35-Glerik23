package domain;

/**
 * Представляє співробітника, який є редактором (Editor).
 * Успадковується від {@link Artist} та додає інформацію про переваги редагування (електронне чи паперове).
 *
 * @author Glerik
 * @version 1.0
 * @since 29.04.25
 * @see Artist
 * @see Employee
 */
public class Editor extends Artist {

    /**
     * Створює нового редактора із заданими перевагами редагування, навичками та деталями співробітника.
     * Викликає відповідний конструктор базового класу {@link Artist}.
     *
     * @param electronicEditing {@code true}, якщо перевага надається електронному редагуванню; {@code false}, якщо паперовому.
     * @param skiils Масив рядків, що представляють навички редактора.
     * @param name Ім'я редактора.
     * @param jobTitle Посада редактора.
     * @param level Рівень редактора (1-3).
     * @param dept Відділ редактора.
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора із заданими перевагами редагування та навичками.
     * Викликає конструктор базового класу {@link Artist}.
     *
     * @param electronicEditing {@code true}, якщо перевага надається електронному редагуванню; {@code false}, якщо паперовому.
     * @param skiils Масив рядків, що представляють навички редактора.
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора із заданими перевагами редагування
     * та значеннями за замовчуванням від {@link Artist}.
     * Викликає конструктор базового класу {@link Artist} без аргументів.
     *
     * @param electronicEditing {@code true}, якщо перевага надається електронному редагуванню; {@code false}, якщо паперовому.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора зі значеннями за замовчуванням.
     * Встановлює перевагу електронного редагування на {@code true}.
     * Викликає конструктор базового класу {@link Artist} без аргументів.
     */
    public Editor() {
        super();
        this.electronicEditing = true; // Перевага електронного редагування за замовчуванням
    }

    /**
     * Надає рядкове представлення об'єкта Editor, включаючи інформацію про художника та переваги редагування.
     * @return Відформатований рядок, що містить деталі про редактора та його переваги.
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= ";
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
    }

    // Приватне поле, що вказує на перевагу електронного редагування.
    private boolean electronicEditing;

    /**
     * Повертає перевагу редагування.
     * @return {@code true}, якщо перевага надається електронному редагуванню; {@code false}, якщо паперовому.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює перевагу редагування.
     * @param electronic {@code true} для електронного редагування, {@code false} для паперового.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}