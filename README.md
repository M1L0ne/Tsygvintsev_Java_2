# Цыгвинцев Олег Сергеевич Лабораторная №2

# Задание 1
## Задача 3
### Текст задачи
Имена.	
Создайте	 сущность	 Имя,	 которая	 описывается	 тремя	 параметрами:	 Фамилия,	 Личное	 имя,	
Отчество.	 Имя	 может	 быть	 приведено	 к	 строковому	 виду,	 включающему	 традиционное	
представление	 всех	 трех	 параметров:	 Фамилия	 Имя	 Отчество	 (например	 “Иванов	 Иван	
Иванович”).	Необходимо	предусмотреть	возможность	того,	что	какой-либо	из	параметров	может	
быть	не	задан,	и	в	этом	случае	он	не	учитывается	при	приведении	к	текстовому	виду.
Необходимо	создать	следующие	имена:
• Клеопатра
• Пушкин	Александр	Сергеевич
• Маяковский	Владимир
Обратите	 внимание,	 что	 при	 выводе	 на	 экран,	 не	 заданные	 параметры	 никак	 не	 участвуют	 в	
образовании	строки.
### Алгоритм решения
    package lab2;
    
    public class Name {
        private String lastName;
        private String firstName;
        private String patronymic;
    
        public Name(String lastName, String firstName, String patronymic) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
        }
    
        @Override
        public String toString() {
            if (lastName == null) {
                lastName = "";
            }
            if (firstName == null) {
                firstName = "";
            }
            if (patronymic == null) {
                patronymic = "";
            }
    
            return (lastName + " " + firstName + " " + patronymic).trim();
        }
    }

## Задача 2
### Текст задачи
Человек.	
Создайте	сущность	Человек,	которая	описывается:
• Имя:	строка
• Рост:	целое	число
Может	 возвращать	 текстовое	 представление	 вида	 “Name, рост:	 height”,	 где	 Name и	 height это	
переменная	с	именем	и	ростом.
Необходимо	создать	и	вывести	на	экран	следующих	людей:
• Человек	с	именем	“Клеопатра”	и	ростом	152
• Человек	с	именем	“Пушкин ”	и	ростом	167
• Человек	с	именем	“Владимир ”	и	ростом	189
### Алгоритм решения
    package lab2;
    
    public class Human {
        private String name;
        private int height;
    
        public Human (String name, int height) {
            this.name = name;
            this.height = height;
        }
    
        @Override
        public String toString() {
            return name + ", рост: " + height;
        }
    }

# Задание 2
## Задача 4
### Текст задачи
Сотрудники	и	отделы.	
Создайте	 сущность	 Сотрудник,	 которая	 описывается	 именем	 (в	 строковой	 форме)	 и	 отделом,	 в	
котором	 сотрудник	 работает,	 причем	 у	 каждого	 отдела	 есть	 название	 и	 начальник,	 который	
также	 является	 Сотрудником.	 Сотрудник	 может	 быть	 приведен	 к	 текстовой	 форме	 вида:	 “Имя	
работает	 в	 отделе	 Название,	 начальник	 которого	 Имя”.	 В	 случае	 если	 сотрудник	 является	
руководителем	отдела,	то	текстовая	форма	должна	быть	“Имя	начальник	отдела	Название”.
Необходимо	выполнить	следующие	задачи:
1. Создать	Сотрудников	Петрова,	Козлова,	Сидорова	работающих	в	отделе	IT.
2. Сделать	Козлова	начальником	IT отдела.
3. Вывести	на	экран	текстовое	представление	
### Алгоритм решения
    package lab2;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class Department {
        private String name;
        private Employee head;
    
        public Department(String name) {
            this.name = name;
        }
    
        public void setHead(Employee employee) {
            head = employee;
        }
    
        public String getHead() {
            if (head == null) {
                return "неизвестен";
            }
            return head.getName();
        }
    
        public String getName() {
            return name;
        }
    }
    
    
    package lab2;
    
    public class Employee {
        private String name;
        private Department department;
    
        public Employee(String name, Department department) {
            this.name = name;
            this.department = department;
        }
    
        @Override
        public String toString() {
            String head = department.getHead();
    
            String departmentName = department.getName();
            return name + " работает в отделе " + departmentName + ", начальник которого " + head;
        }
    
        public String getName() {
            return name;
        }
    }

# Задание 3
## Задача 4
### Текст задачи
Сотрудники	и	отделы.	
Измените	 решение,	 полученное	 в	 задаче	2.4 таким	 образом,	 чтобы	 имея	 ссылку	 на	 сотрудника,	
можно	было	бы	узнать	список	всех	сотрудников	этого	отдела.
### Алгоритм решения
    package lab2;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class Department {
        private String name;
        private Employee head;
        private List<Employee> employees;
    
        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<Employee>();
        }
    
        public void setHead(Employee employee){
            head = employee;
        }
    
        public String getHead() {
            if (head == null){
                return "неизвестен";
            }
            return head.getName();
        }
    
        public String getName() {
            return name;
        }
    
        public void addEmployee(Employee employee) {
            employees.add(employee);
        }
    
        public List<Employee> getEmployees() {
            return employees;
        }
    }
    
    package lab2;

    public class Employee {
        private String name;
        private Department department;
    
        public Employee(String name, Department department) {
            this.name = name;
            this.department = department;
            department.addEmployee(this);
        }
    
        @Override
        public String toString() {
            String head = department.getHead();
    
            String departmentName = department.getName();
            return name + " работает в отделе " + departmentName + ", начальник которого " + head;
        }
    
        public String getName() {
            return name;
        }
    }

# Задание 4
## Задача 5
### Текст задачи
Создаем	Имена.	
Измените	сущность	Имя	из	задачи	1.3.	Новые	требования	включают:
• Имя	можно	создать	указав	только	Личное	имя
• Имя	можно	создать	указав	 Личное	имя и	Фамилию.
• Имя	можно	создать	указав	все	три	параметра:	Личное	имя,	Фамилию,	Отчество.
Необходимо	создать	следующие	имена:
1. Клеопатра
2. Александр	Сергеевич	Пушкин
3. Владимир	Маяковский
4. Христофор	Бонифатьевич	(здесь	Христофор	это	имя,	а	Бонифатьевич	- фамилия)	
### Алгоритм решения
    package lab2;
    
    public class Names {
        private String lastName;
        private String firstName;
        private String patronymic;
    
        public Names(String firstName) {
            this.firstName = firstName;
        }
    
        public Names(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    
        public Names(String firstName, String lastName, String patronymic) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
        }
    
        @Override
        public String toString() {
            if (lastName == null) {
                lastName = "";
            }
            if (firstName == null) {
                firstName = "";
            }
            if (patronymic == null) {
                patronymic = "";
            }
    
            return (firstName + " " + lastName + " " + patronymic).trim();
        }
    }

# Задание 5
## Задача 1
### Текст задачи
Пистолет	стреляет.
• Создайте	сущность	Пистолет,	которая	описывается	следующим	образом:
• Имеет	Количество	патронов	(целое	число)
• Может	быть	создан	с	указанием	начального	количества	патронов
• Может	 быть	 создан	 без	 указания	 начального	 количества	 патронов,	 в этом	 случае он	
изначально	заряжен	пятью патронами.
• Может	 Стрелять,	 что	 приводит	 к	 выводу	 на	 экран	 текста	 “Бах!” в	 том	 случае,	 если	
количество	патронов	больше	нуля,	иначе	делает	“Клац!”.	После	каждого	выстрела	(когда	
вывелся	“Бах!”) количество	патронов	уменьшается	на	один.
Создайте	пистолет	с	тремя	патронами	и	выстрелите	из	него	пять	раз.	
### Алгоритм решения
    package lab2;
    
    public class Gun {
      private int bullets;
    
      public Gun(int bullets) {
          this.bullets = bullets;
      }
      public Gun() {
          this.bullets = 5;
      }
    
      public void fire() {
          if (bullets > 0) {
              bullets--;
              System.out.println("Бах!");
          }
          else {
              System.out.println("Клац!");
          }
      }
    }
