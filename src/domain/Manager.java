package domain;

/**
 * Представляє співробітника, який є менеджером (Manager).
 * Успадковується від {@link Employee} та додає можливість керувати масивом підлеглих співробітників.
 *
 * @author Glerik
 * @version 1.0
 * @since 29.04.25
 * @see Employee
 */
public class Manager extends Employee {

    /**
     * Створює нового менеджера із заданим масивом підлеглих співробітників та деталями співробітника.
     * Викликає відповідний конструктор базового класу {@link Employee}.
     *
     * @param employees Масив об'єктів {@link Employee}, що представляють підлеглих співробітників.
     * @param name Ім'я менеджера.
     * @param jobTitle Посада менеджера.
     * @param level Рівень менеджера (1-3).
     * @param dept Відділ менеджера.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Надає рядкове представлення об'єкта Manager, включаючи інформацію про співробітника та список підлеглих.
     * @return Відформатований рядок, що містить деталі про менеджера та його підлеглих.
     */
    @Override
    public String toString() {
        // Додана перевірка на null або порожній масив, щоб уникнути помилки, якщо підлеглих немає.
        String employeesStr = (employees != null && employees.length > 0 && getEmployees().length() > 0) ? getEmployees() : "None";
        return super.toString()+"\nEmployees: "+ employeesStr;
    }

    /**
     * Створює нового менеджера із заданим масивом підлеглих співробітників
     * та значеннями співробітника за замовчуванням.
     * Викликає конструктор базового класу {@link Employee} без аргументів.
     *
     * @param employees Масив об'єктів {@link Employee}, що представляють підлеглих співробітників.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює нового менеджера зі значеннями за замовчуванням.
     * Викликає конструктор базового класу {@link Employee} без аргументів
     * та ініціалізує масив підлеглих розміром 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    // Приватне поле, що зберігає масив підлеглих співробітників. Документується опосередковано.
    private Employee[] employees;

    /**
     * Повертає імена підлеглих співробітників як єдиний рядок, розділений комою.
     * Якщо масив підлеглих порожній або null, повертає порожній рядок (після виправлення логіки getEmployees).
     * @return Рядок, що містить список імен підлеглих співробітників, розділених комою.
     */
    public String getEmployees() {
        // Додана перевірка на null або порожній масив
        if (employees == null || employees.length == 0) {
            return "";
        }
        String s = "";
        for (Employee e : employees) {
             // Додана перевірка на null для окремого співробітника в масиві
            if (e != null) {
                 s = s + e.getName() + ", ";
            }
        }
        // Видаляє останню кому та пробіл, якщо рядок не порожній
        if (s.length() > 0) {
             s=s.substring(0, s.length() - 2);
        }
        return s;
    }

    /**
     * Встановлює масив підлеглих співробітників для менеджера.
     * @param employees Масив об'єктів {@link Employee}, що представляють нових підлеглих співробітників.
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив підлеглих співробітників.
     * @return Масив об'єктів {@link Employee}, що представляють підлеглих співробітників.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}