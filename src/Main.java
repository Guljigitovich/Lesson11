import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 6;
        triangle.b = 4;
        triangle.c = 5;
        triangle.getArea();


   Flower flower = new Flower();
   flower.name="Roza";
   flower.price= 500;
   flower.color="white";
        Flower flower1 = new Flower();
        flower1.name="Roza";
        flower1.price= 600;
        flower1.color="red";
        Flower flower2 = new Flower();
        flower2.name="Roza";
        flower2.price= 800;
        flower2.color="blue";
        Flower flower3 = new Flower();
        flower3.name="Tulpan";
        flower3.price= 750;
        flower3.color="black";
        Flower flower4 = new Flower();
        flower4.name="Tulpan";
        flower4.price= 650;
        flower4.color="orange";
        Flower flower5 = new Flower();
        flower5.name="Tulpan";
        flower5.price= 720;
        flower5.color="white";
        Flower [] flowers={flower,flower1,flower2,flower3,flower4,flower5};
        flower.getFlowerPrice(flowers);
        flower.getFlowerRan(flowers);

    /*Student student = new Student();
    student.name = "Azamat";
    student.age = 18;
    student.gender = 'M';
    student.phoneNumber = 0777234567;
        Student student1 = new Student();
        student1.name = "Kanat";
        student1.age = 17;
        student1.gender = 'M';
        student1.phoneNumber = 0774254567;
        Student student2 = new Student();
        student2.name = "Baiel";
        student2.age = 20;
        student2.gender = 'M';
        student2.phoneNumber = 032423;
        Student student3 = new Student();
        student3.name = "Janat";
        student3.age = 20;
        student3.gender = 'W';
        student3.phoneNumber = 0323423;
        Student student4 = new Student();
        student4.name = "Aijan";
        student4.age = 19;
        student4.gender = 'W';
        student4.phoneNumber = 0322343;
        Student student5 = new Student();
        student5.name = "Bermet";
        student5.age = 18;
        student5.gender = 'W';
        student5.phoneNumber = 022343;
        Student student6 = new Student();
        student6.name = "Kyial";
        student6.age = 19;
        student6.gender = 'W';
        student6.phoneNumber = 022343;
        Student [] students = {student,student1,student2,student3,student4,student5,student6};
        student.getStudentInfo(students);*/

       /* Car car = new Car();
        car.name ="BMW";
        car.komp = "BMW";
        car.speed = 360;
        System.out.println(car.getSpeed());*/


       /* Country country = new Country();
        country.name= "Kyrgyzstan";
        country.year= 32;
        country.neigh="China,Kazakstan,Uzbekistan,Tajikstan";
        country.neighKolichestvo=4;
        country.leader="Prezident";
        System.out.println(country.getInfo());*/






       /* Scanner scanner = new Scanner(System.in);
        Programist programist=new Programist();
        programist.name= scanner.nextLine();
        programist.surname= scanner.nextLine();
        programist.age= scanner.nextInt();
        System.out.println("Name: "+programist.name+" \n"+"Surname: "+programist.surname);
        programist.getInfoAge();*/

       /* University university= new University();
        university.name="Ala-too";
        university.strana="Turkey";
        university.reiting=2;
        System.out.println(university.name+" "+university.strana+" "+university.reiting);*/





    }
}