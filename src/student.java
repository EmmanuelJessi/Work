public class student {

    String reg_number;
    String firstname;
    String lastname;
    String program;

    public student (String reg, String fname, String lname, String prog){


        reg_number = reg;
        firstname = fname;
        lastname = lname;
        program = prog;

    }

    public void attendclass()
    {

        System.out.println("the registration number is "+reg_number);
        System.out.println("the firstname is "+firstname);
        System.out.println("the lastname is "+lastname);
        System.out.println("the program is "+program);

    }
    public static void main(String[] args) {

        student stud1 = new student("21/111/BIT-J","sabi","dear","BIT");


        stud1.display();
        stud1.attendclass();
    }

    private void display() {
    }


    }

