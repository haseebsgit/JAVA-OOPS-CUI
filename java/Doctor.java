public class Doctor {

    private static int counter = 0;


    public Doctor(){
        counter++;
    }


    public static int getDoctorCount() {
        return counter;
    }

    public void func(int a){
        a = a+a;
        System.out.println();
    }
    public static void setDoctorCount(int doctorCount) {
        Doctor.counter = doctorCount;
    }
    



}
