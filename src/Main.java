import java.util.Scanner;
import java.util.Vector;

public class Main {
    Scanner sc = new Scanner(System.in);
    Vector<Vehicle> vecvehicle = new Vector<>();

    void insert()
    {
        String license;
        String type;
        String drivername;
        String vehiclename;

        do {
            System.out.println("Masukkan nomor lisensi kendaraan [4-10 karakter] : ");
            license = sc.nextLine();
        }while(license.length()<4 || license.length()>10);

        do {
            System.out.println("Masukkan jenis kendaraan [mobil | motor] : ");
            type = sc.nextLine();
        }while(!type.equals("mobil") && !type.equals("motor"));

        do {
            System.out.println("Masukkan nama pengendara [Maks 30 karakter] : ");
            drivername = sc.nextLine();
        }while(drivername.length()>30);


        System.out.println("Masukkan nama/model kendaraan [Maks 30 karakter] : ");
        vehiclename = sc.nextLine();

        if(type.equals("mobil"))
        {
            int capacity;
            System.out.println("Masukkan kapasitas mobil [4-6] : ");
            capacity = sc.nextInt();

            vecvehicle.add(new Car(license, type, drivername, vehiclename, capacity));
        }
        else
        {
            String service;
            do
            {
                System.out.println("Masukkan jenis motor [matic | manual] : ");
                service = sc.nextLine();
            }while(!service.equals("matic") && !service.equals("manual"));

            vecvehicle.add(new Ojek(license, type, drivername, vehiclename, service));
        }
    }

    void view()
    {
        for(int i = 0; i < vecvehicle.size();i++)
        {
            System.out.println("Nomor Lisensi Kendaraan : "+vecvehicle.get(i).getLicense()+"\nJenis Kendaraan : " +vecvehicle.get(i).getType()+"\nNama Pengendara :  " +vecvehicle.get(i).getDrivername() + "\nNama/Model Kendaraan :  " + vecvehicle.get(i).getVehiclename()+ " ");

            if(vecvehicle.get(i)instanceof Car)
            {
                Car car = (Car) vecvehicle.get(i);
                System.out.println("kapasitas Mobil : "+car.getCapacity()+"\n");
            }
            else
            {
                Ojek ojek = (Ojek) vecvehicle.get(i);
                System.out.println("Jenis Kendaraan Bermotor : "+ojek.getService()+"\n");
            }
        }
    }

    public Main() {
        int opt;
        vecvehicle.add(new Car("A-1211-2","mobil","Ferdi", "Inova",6));
        vecvehicle.add(new Ojek("B-7822-3","motor","Asep", "vario","matic"));



        do
        {
            System.out.println("Aplikasi Pendaftaran Kendaraan Mobil/Motor");
            System.out.println("1. Daftarkan kendaraan");
            System.out.println("2. Lihat daftar kendaraan");
            System.out.println("3. Keluar");

            opt = sc.nextInt();

            switch(opt)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    break;
            }


        }while(opt != 3);
    }

    public static void main(String[] args) {
        new Main();
    }

}