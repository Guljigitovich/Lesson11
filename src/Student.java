public class Student {
    String name;
    byte age;
    char gender;
    int phoneNumber;

    public void getStudentInfo (Student[]students){
        int countM =0;
        int countW = 0;
        for (Student massive:students) {
            if (massive.gender=='M') {
                countM++;
            } else if (massive.gender=='W') {
                countW++;
            }
        }
        System.out.println("Man : "+countM);
        System.out.println("Women : "+countW);


    }
}
