public class Employee {
        long id;
        String name;
        int age;
        double salary;
        int fixedBugs;
        String gender;
        double defaultBugRate;

        Employee(long id, String name, int  age, double salary,
                 int fixedBugs, String gender, double defaultBugRate){
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.fixedBugs = fixedBugs;
            this.gender = gender;
            this.defaultBugRate = defaultBugRate;
        }

        @Override
        public String toString() {
            return "ID:\t" + id + "\n" +
                    "Name:\t" + name + "\n" +
                    "Age:\t" + age + "\n" +
                    "Salary:\t" + salary + "\n" +
                    "Gender:\t" + gender + "\n" +
                    "Fixed bugs:\t" + fixedBugs + "\n" +
                    "Default bug rate:\t" + defaultBugRate + "\n";
        }


}
