public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            System.out.println("Maasiniz 1000₺'den dusuk oldugundan size vergi uygulanmayacaktir.");
            return 0;
        } else {
            double vergi = salary * 3 / 100;
            return vergi;
        }
    }

    int bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        } else {
            System.out.println("Calisma sureniz azami mesai saati ustunde degildir.");
            return 0;
        }
    }

    double raiseSalary() {
        if (2021 - hireYear > 19) {
            System.out.println("19 yildan fazladir calistiginiz icin maasiniz 15% artmistir : ");
            return (salary * 15 / 100);
        } else if (2021 - hireYear > 10) {
            System.out.println("10 yildan fazla suredir calistiginiz icin maasiniz 10% artmistir : ");
            return (salary * 10 / 100);
        } else {
            System.out.println("9 yildan az suredir calistiginiz icin maasiniz 5% artmistir : ");
            return (salary * 5 / 100);
        }
    }

    void showInfos() {
        System.out.println("Adi : " + name);
        System.out.println("Maasi : " + salary);
        System.out.println("Calisma Saati : " + workHours);
        System.out.println("Baslangic Yili : " + salary);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maas : " + (salary + raiseSalary()));
    }
}
