package domain;

/**
 * Представляє загального співробітника в структурі компанії.
 * Цей клас є базовим для більш специфічних типів співробітників.
 *
 * @author Glerik
 * @version 1.0
 * @since 29.04.25
 */
public class Employee {

    /**
     * Надає рядкове представлення об'єкта Employee.
     * @return Відформатований рядок, що містить деталі про співробітника: ID, ім'я, посада, рівень та відділ.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    // Приватні поля зазвичай не документуються за допомогою Javadoc,
    // оскільки вони не є частиною публічного API класу.
    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    // private static int employeesCount = 0; // Закоментоване поле

    /**
     * Створює нового співробітника із заданими деталями.
     * Ініціалізує співробітника випадковим ID та встановлює надані властивості.
     * Рівень перевіряється на валідність (від 1 до 3), за замовчуванням встановлюється 1, якщо невалідний.
     *
     * @param name Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level Рівень співробітника (1-3).
     * @param dept Відділ співробітника.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // Викликає конструктор без аргументів для встановлення ID
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1; // Рівень за замовчуванням, якщо наданий рівень невалідний
        }
        this.dept = dept;
    }

    /**
     * Створює нового співробітника зі значеннями за замовчуванням.
     * Призначає випадковий ID співробітнику.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
    }

    /**
     * Встановлює посаду співробітника.
     * @param job Нова посада для співробітника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає поточну посаду співробітника.
     * @return Посада співробітника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     * @return Ім'я співробітника.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника.
     * Перевіряє рівень на валідність (від 1 до 3), за замовчуванням встановлюється 1, якщо невалідний.
     * @param level Новий рівень для співробітника (1-3).
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1; // Рівень за замовчуванням, якщо невалідний
        }
    }

    /**
     * Повертає поточний рівень співробітника.
     * @return Рівень співробітника.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ співробітника.
     * @return Відділ співробітника.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ співробітника.
     * @param dept Новий відділ для співробітника.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника.
     * Ім'я перевіряється за допомогою регулярного виразу.
     * Якщо ім'я неваліднe, за замовчуванням встановлюється "John Doe".
     * @param name Нове ім'я для співробітника.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe"; // Ім'я за замовчуванням для невалідного вводу
        }
    }
}