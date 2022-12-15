package studentassesment;

class Student {

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

interface Sport {

    int grace();
}

class Exam extends Student {

    int physicsMark, chemistryMark, biologyMark;

    public Exam(int roll, String name, int physicsMark, int chemistryMark, int biologyMark) {
        super(roll, name);
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
        this.biologyMark = biologyMark;
    }

    int getSubjectiveMarks() {
        return physicsMark + chemistryMark + biologyMark;
    }
}

class Results extends Exam implements Sport {

    int marks = 0;

    public Results(int roll, String name, int physicsMark, int chemistryMark, int biologyMark) {
        super(roll, name, physicsMark, chemistryMark, biologyMark);
    }

    @Override
    public int grace() {
        return 15;
    }

    @Override
    int getSubjectiveMarks() {
        return super.getSubjectiveMarks() + grace();
    }

    void print() {
        marks = getSubjectiveMarks();
        System.out.println("Roll: " + roll + ", Name: " + name + ", Marks : " + marks);
    }
}

class StudentAssesment {

    public static void main(String[] args) {
        Results results = new Results(190305003, "NISHAT MAHMUD", 85, 78, 55);
        results.print();
    }
}
