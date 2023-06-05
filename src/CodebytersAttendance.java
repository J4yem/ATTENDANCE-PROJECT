import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class CodebytersAttendance {
    
        ArrayList <Integer> memberID = new ArrayList<>();
        ArrayList <Integer> sy = new ArrayList();
        ArrayList <String> firstName = new ArrayList <>();
        ArrayList <String> lastName = new ArrayList<>();
        ArrayList <String> school_year = new ArrayList<>();
        ArrayList <String> position = new ArrayList<>();
        ArrayList <Character> middle_initial = new ArrayList<>();
        ArrayList <Character> gender = new ArrayList<>();
        ArrayList <Integer> BirthMonth = new ArrayList<>();
        ArrayList <Integer> BirthDate = new ArrayList<>();
        ArrayList <Integer> BirthYear = new ArrayList<>();
        ArrayList <Long> cellphoneNum = new ArrayList<>();
        ArrayList <String> email = new ArrayList<>();
     //   ArrayList <String> elected = new ArrayList<>();
        
        ArrayList <Integer> month = new ArrayList<>();
        ArrayList <Integer> day = new ArrayList<>();
        ArrayList <Integer> year = new ArrayList<>();
        
        private static final String MEMBERS_FILE_NAME = "members.txt";
        private static final String OFFICERS_FILE_NAME = "viewOfficers.txt";
    
    public static void main(String[] args) {
        
        try{
        
        Scanner sc = new Scanner(System.in);
        CodebytersAttendance byters = new CodebytersAttendance();
        

        // officers
        
        //0
        byters.memberID.add(1234);
        byters.sy.add(2021);
        byters.firstName.add("John");
        byters.lastName.add("Smith");
        byters.school_year.add("2021-2022");
        byters.position.add("President");
        byters.middle_initial.add('E');
        byters.gender.add('M');
        byters.BirthMonth.add(05);
        byters.BirthDate.add(12);
        byters.BirthYear.add(2001);
        byters.cellphoneNum.add(9287429041L);
        byters.email.add("johnsmith@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022);
        
        //1
        byters.memberID.add(1232);
        byters.sy.add(2022);
        byters.firstName.add("Sarah");
        byters.lastName.add("Johnson");
        byters.school_year.add("2022-2023");
        byters.position.add("Vice President");
        byters.middle_initial.add('Q');
        byters.gender.add('M');
        byters.BirthMonth.add(11);
        byters.BirthDate.add(30);
        byters.BirthYear.add(2005);
        byters.cellphoneNum.add(9598206749L);
        byters.email.add("sarahjohnson@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022);
        
        //2
        byters.memberID.add(1532);
        byters.sy.add(2022);
        byters.firstName.add("Michael");
        byters.lastName.add("Davis");
        byters.school_year.add("2022-2023");
        byters.position.add("Secretary");
        byters.middle_initial.add('A');
        byters.gender.add('M');
        byters.BirthMonth.add(12);
        byters.BirthDate.add(23);
        byters.BirthYear.add(1999);
        byters.cellphoneNum.add(9233479056L);
        byters.email.add("michaeldavis@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022);
       
        //3
        byters.memberID.add(1324);
        byters.sy.add(2021);
        byters.firstName.add("Emily");
        byters.lastName.add("Brown");
        byters.school_year.add("2021-2022");
        byters.position.add("Treasurer");
        byters.middle_initial.add('M');
        byters.gender.add('F');
        byters.BirthMonth.add(02);
        byters.BirthDate.add(05);
        byters.BirthYear.add(2002);
        byters.cellphoneNum.add(9799378541L);
        byters.email.add("emilybrown@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022);
        
        //4
        byters.memberID.add(1533);
        byters.sy.add(2023);
        byters.firstName.add("David");
        byters.lastName.add("Lee");
        byters.school_year.add("2023-2024");
        byters.position.add("Auditor");
        byters.middle_initial.add('L');
        byters.gender.add('M');
        byters.BirthMonth.add(12);
        byters.BirthDate.add(18);
        byters.BirthYear.add(2000);
        byters.cellphoneNum.add(9609248910L);
        byters.email.add("davidlee@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022);
        
        //5
        byters.memberID.add(1421);
        byters.sy.add(2022);
        byters.firstName.add("Samantha");
        byters.lastName.add("Chen");
        byters.school_year.add("2022-2023");
        byters.position.add("PRO");
        byters.middle_initial.add('V');
        byters.gender.add('F');
        byters.BirthMonth.add(01);
        byters.BirthDate.add(03);
        byters.BirthYear.add(1998);
        byters.cellphoneNum.add(9907833671L);
        byters.email.add("samanthachen@gmail.com");
        byters.month.add(05);
        byters.day.add(21);
        byters.year.add(2022); 
        
        // members
        byters.memberID.add(4570);
        byters.sy.add(2021);
        byters.firstName.add("Maria");
        byters.lastName.add("Nguyen");
        byters.middle_initial.add('D');
        byters.gender.add('F');
        byters.BirthMonth.add(04);
        byters.BirthDate.add(29);
        byters.BirthYear.add(2000);
        byters.cellphoneNum.add(9123456789L);
        byters.email.add("maria@gmail.com");
        
        byters.memberID.add(9832);
        byters.sy.add(2022);
        byters.firstName.add("Elijah");
        byters.lastName.add("Patel");
        byters.middle_initial.add('R');
        byters.gender.add('M');
        byters.BirthMonth.add(04);
        byters.BirthDate.add(15);
        byters.BirthYear.add(2003);
        byters.cellphoneNum.add(9123345398L);
        byters.email.add("elijah@gmail.com");
        
        int input;
        
        do{
            
        System.out.println("-------------------------------");    
            
        System.out.println();    
        System.out.println("     CODEBYTERS DIRECTORY");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Choose a Number: ");
        System.out.println();
        System.out.println("1 - View Officers");
        System.out.println("2 - Registration Of Officers");
        System.out.println("3 - Registration Of Members");
        System.out.println("4 - Information Of Officers");
        System.out.println("5 - Information Of Members");
        System.out.println("6 - Search Information");
        System.out.println("7 - Exit");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.print("User Input: ");

        input = sc.nextInt();
        sc.nextLine();
        
        if(input == 1){
            byters.officers(sc);
        }
        else if(input == 2){
            byters.registrationOfficers(sc);
        }
        else if(input == 3){
            byters.registrationMembers(sc);
        }
        else if(input == 4){
            byters.informationofOfficers();
        }
        else if(input == 5){
            byters.informationofMembers(sc);
        }
        else if(input == 6){
            byters.searchInformation(sc);
        }
        else if(input == 7){
            System.out.println();
            
            System.out.println("-------------------------------");
            
            System.out.println();
            System.out.println("      Exiting program...");
            System.out.println();
            
            System.out.println("-------------------------------");
        }
        
        else{
            System.out.println();
            System.out.println("-------------------------------");
            
            System.out.println();
            System.out.println("Invalid Input!");
            System.out.println("Please try again.");
            System.out.println();
        }
        }
         
        
        while(input != 7);{
            System.out.println();
        }
        }
        catch (InputMismatchException e) {
                    System.out.println();
                    System.out.println("-------------------------------");
                    System.out.println();
                    System.out.println("Invalid input!");
                    System.out.println("Please try again.");
                    System.out.println();
                    System.out.println("-------------------------------");}
        
    }
    
    void officers(Scanner sc){
        
        System.out.println();
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("          OFFICERS: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(0) + " \nDay Elected mm/dd/yyyy: " + month.get(0)+"/"+day.get(0)+"/"+year.get(0) );
        System.out.println("Fullname: " + firstName.get(0) +" "+middle_initial.get(0)+". "+lastName.get(0));
        System.out.println("ID#: " + memberID.get(0)+"-"+sy.get(0));
        System.out.println("Gender M/F: " + gender.get(0));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(0)+"/"+BirthDate.get(0)+"/"+BirthYear.get(0));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(0));
        System.out.println("Email: " + email.get(0));
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(1) + " \nDay Elected mm/dd/yyyy: " + month.get(1)+"/"+day.get(1)+"/"+year.get(1) );
        System.out.println("Fullname: " + firstName.get(1) +" "+middle_initial.get(1)+". "+lastName.get(1));
        System.out.println("ID#: " + memberID.get(1)+"-"+sy.get(1));
        System.out.println("Gender M/F: " + gender.get(1));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(1)+"/"+BirthDate.get(1)+"/"+BirthYear.get(1));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(1));
        System.out.println("Email: " + email.get(1));
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(2) + " \nDay Elected mm/dd/yyyy: " + month.get(2)+"/"+day.get(2)+"/"+year.get(2) );
        System.out.println("Fullname: " + firstName.get(2) +" "+middle_initial.get(2)+". "+lastName.get(2));
        System.out.println("ID#: " + memberID.get(2)+"-"+sy.get(2));
        System.out.println("Gender M/F: " + gender.get(2));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(2)+"/"+BirthDate.get(2)+"/"+BirthYear.get(2));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(2));
        System.out.println("Email: " + email.get(2));
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(3) + " \nDay Elected mm/dd/yyyy: " + month.get(3)+"/"+day.get(3)+"/"+year.get(3) );
        System.out.println("Fullname: " + firstName.get(3) +" "+middle_initial.get(3)+". "+lastName.get(3));
        System.out.println("ID#: " + memberID.get(3)+"-"+sy.get(3));
        System.out.println("Gender M/F: " + gender.get(3));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(3)+"/"+BirthDate.get(3)+"/"+BirthYear.get(3));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(3));
        System.out.println("Email: " + email.get(3));
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(4) + " \nDay Elected mm/dd/yyyy: " + month.get(4)+"/"+day.get(4)+"/"+year.get(4) );
        System.out.println("Fullname: " + firstName.get(4) +" "+middle_initial.get(4)+". "+lastName.get(4));
        System.out.println("ID#: " + memberID.get(4)+"-"+sy.get(4));
        System.out.println("Gender M/F: " + gender.get(4));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(4)+"/"+BirthDate.get(4)+"/"+BirthYear.get(4));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(4));
        System.out.println("Email: " + email.get(4));
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("Position: "+position.get(5) + " \nDay Elected mm/dd/yyyy: " + month.get(5)+"/"+day.get(5)+"/"+year.get(5) );
        System.out.println("Fullname: " + firstName.get(5) +" "+middle_initial.get(5)+". "+lastName.get(5));
        System.out.println("ID#: " + memberID.get(5)+"-"+sy.get(5));
        System.out.println("Gender M/F: " + gender.get(5));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(5)+"/"+BirthDate.get(5)+"/"+BirthYear.get(5));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(5));
        System.out.println("Email: " + email.get(5));
        System.out.println(); 
        
        try {
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(OFFICERS_FILE_NAME));
            
            writer.write("Position: "+position.get(0) + " \nDay Elected mm/dd/yyyy: " + month.get(0)+"/"+day.get(0)+"/"+year.get(0)+("\n") );
            writer.write("Fullname: " + firstName.get(0) +" "+middle_initial.get(0)+". "+lastName.get(0)+("\n"));
            writer.write("ID#: " + memberID.get(0)+"-"+sy.get(0)+("\n"));
            writer.write("Gender M/F: " + gender.get(0)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(0)+"/"+BirthDate.get(0)+"/"+BirthYear.get(0)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(0)+("\n"));
            writer.write("Email: " + email.get(0)+("\n"));
            
            writer.newLine();
            
            writer.write("Position: "+position.get(1) + " \nDay Elected mm/dd/yyyy: " + month.get(1)+"/"+day.get(1)+"/"+year.get(1)+("\n") );
            writer.write("Fullname: " + firstName.get(1) +" "+middle_initial.get(1)+". "+lastName.get(1)+("\n"));
            writer.write("ID#: " + memberID.get(1)+"-"+sy.get(1)+("\n"));
            writer.write("Gender M/F: " + gender.get(1)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(1)+"/"+BirthDate.get(1)+"/"+BirthYear.get(1)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(1)+("\n"));
            writer.write("Email: " + email.get(1)+("\n"));
            
            writer.newLine();
            
            writer.write("Position: "+position.get(2) + " \nDay Elected mm/dd/yyyy: " + month.get(2)+"/"+day.get(2)+"/"+year.get(2)+("\n") );
            writer.write("Fullname: " + firstName.get(2) +" "+middle_initial.get(2)+". "+lastName.get(2)+("\n"));
            writer.write("ID#: " + memberID.get(2)+"-"+sy.get(2)+("\n"));
            writer.write("Gender M/F: " + gender.get(2)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(2)+"/"+BirthDate.get(2)+"/"+BirthYear.get(2)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(2)+("\n"));
            writer.write("Email: " + email.get(2)+("\n"));
            
            writer.newLine();
            
            writer.write("Position: "+position.get(3) + " \nDay Elected mm/dd/yyyy: " + month.get(3)+"/"+day.get(3)+"/"+year.get(3)+("\n") );
            writer.write("Fullname: " + firstName.get(3) +" "+middle_initial.get(3)+". "+lastName.get(3)+("\n"));
            writer.write("ID#: " + memberID.get(3)+"-"+sy.get(3)+("\n"));
            writer.write("Gender M/F: " + gender.get(3)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(3)+"/"+BirthDate.get(3)+"/"+BirthYear.get(3)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(3)+("\n"));
            writer.write("Email: " + email.get(3)+("\n"));
            
            writer.newLine();
            
            writer.write("Position: "+position.get(4) + " \nDay Elected mm/dd/yyyy: " + month.get(4)+"/"+day.get(4)+"/"+year.get(4)+("\n") );
            writer.write("Fullname: " + firstName.get(4) +" "+middle_initial.get(4)+". "+lastName.get(4)+("\n"));
            writer.write("ID#: " + memberID.get(4)+"-"+sy.get(4)+("\n"));
            writer.write("Gender M/F: " + gender.get(4)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(4)+"/"+BirthDate.get(4)+"/"+BirthYear.get(4)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(4)+("\n"));
            writer.write("Email: " + email.get(4)+("\n"));
            
            writer.newLine();
            
            writer.write("Position: "+position.get(5) + " \nDay Elected mm/dd/yyyy: " + month.get(5)+"/"+day.get(5)+"/"+year.get(5)+("\n") );
            writer.write("Fullname: " + firstName.get(5) +" "+middle_initial.get(5)+". "+lastName.get(5)+("\n"));
            writer.write("ID#: " + memberID.get(5)+"-"+sy.get(5)+("\n"));
            writer.write("Gender M/F: " + gender.get(5)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(5)+"/"+BirthDate.get(5)+"/"+BirthYear.get(5)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(5)+("\n"));
            writer.write("Email: " + email.get(5)+("\n"));
            
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while showing the officers.");
            e.printStackTrace();
        }
    }
    
    public void registrationOfficers(Scanner sc){
        
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("1 - President");
        System.out.println("2 - Vice President");
        System.out.println("3 - Secretary");
        System.out.println("4 - Treasurer");
        System.out.println("5 - Auditor");
        System.out.println("6 - PRO");
        System.out.println();
        System.out.println("-------------------------------");
        System.out.print("User input: "  );
        
        int choice = sc.nextInt();
        System.out.println();
        
        
        switch(choice){
            case 1: 
                changepresident(sc);
                break;
            case 2: 
                changevicepresident(sc);
                break;
            case 3: 
                changesecretary(sc);
                break;
            case 4: 
                changetresurer(sc);
                break;
            case 5: 
                changeauditor(sc);
                break;    
            case 6:
                changepro(sc);
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("Please try again.");
        }
    }   
    //0
    public void changepresident(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("   REGISTRATION OF PRESIDENT: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthPres = sc.nextInt();
        //month.set(0,monthPres);
        
        if(monthPres >= 01 && monthPres <= 12){
            month.set(0,monthPres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int dayPres = sc.nextInt();
        
        if(dayPres >= 01 && dayPres <= 31){
            day.set(0,dayPres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yearPres = sc.nextInt();
        
        if(yearPres >= 2000 && yearPres <= 2023){
            year.set(0,yearPres);
        }
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
 
        System.out.print("ID# 4 numbers only: ");
        int idPres = sc.nextInt();
        
        if(idPres < 1000 || idPres > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(0, idPres);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
            sy.set(0,yearid);
        }
        
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only."); 
        }
        
        System.out.print("First Name: ");
        String firstnamepres = sc.next();
        firstName.set(0,firstnamepres);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnamepres = sc.next();
        lastName.set(0,lastnamepres); 
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(0, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char genderpres = sc.next().charAt(0);
        
        if(genderpres == 'M' || genderpres =='F'){
            gender.set(0,genderpres);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(0,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(0,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(0,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(0,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailpres = sc.next();
        
        if (Emailpres.endsWith("@gmail.com")) {
            email.set(0,Emailpres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("    REGISTERED AS PRESIDENT!");
        System.out.println();
        
    }
    //0
    public void changedpresident(){
        
        System.out.println();
        System.out.println("Position: "+position.get(0) + " \nDay Elected mm/dd/yyyy: " + month.get(0)+"/"+day.get(0)+"/"+year.get(0)  );
        System.out.println("Fullname: " + firstName.get(0) +" "+middle_initial.get(0)+". "+lastName.get(0));
        System.out.println("ID#: " + memberID.get(0)+"-"+sy.get(0));
        System.out.println("Gender M/F: " + gender.get(0));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(0)+"/"+BirthDate.get(0)+"/"+BirthYear.get(0));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(0));
        System.out.println("Email: " + email.get(0));
        System.out.println();
        
    }
    //1
    public void changevicepresident(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("REGISTRATION OF VICE PRESIDENT: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthvPres = sc.nextInt();
        
        
        if(monthvPres >= 01 && monthvPres <= 12){
            month.set(1,monthvPres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int dayvPres = sc.nextInt();
        
        
        if(dayvPres >= 01 && dayvPres <= 31){
            day.set(1,dayvPres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yearvPres = sc.nextInt();
        //year.set(0, yearPres);
        
        if(yearvPres >= 2000 && yearvPres <= 2023){
            year.set(1,yearvPres);
        }
        else{
            throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
        
        System.out.print("ID# 4 numbers only: ");
        int idvPres = sc.nextInt();
        
        if(idvPres < 1000 || idvPres > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(1, idvPres);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
            sy.set(1,yearid);
        }
        
        else{
             
            throw new ArithmeticException("Please enter 2000 - 2023 only.");
        }
            
        System.out.print("First Name: ");
        String firstnamevpres = sc.next();
        firstName.set(1,firstnamevpres);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnamevpres = sc.next();
        lastName.set(1,lastnamevpres);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(1, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char gendervpres = sc.next().charAt(0);
        
        if(gendervpres == 'M' || gendervpres =='F'){
            gender.set(1,gendervpres);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(1,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(1,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(1,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(1,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailvpres = sc.next();
        
        if (Emailvpres.endsWith("@gmail.com")) {
            email.set(1,Emailvpres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println(" REGISTERED AS VICE PRESIDENT!");
        System.out.println();
        
    }
    //1
    public void changedvicepresident(){
        
        System.out.println();
        System.out.println("Position: "+position.get(1) + " \nDay Elected mm/dd/yyyy: " + month.get(1)+"/"+day.get(1)+"/"+year.get(1)  );
        System.out.println("Fullname: " + firstName.get(1) +" "+middle_initial.get(1)+". "+lastName.get(1));
        System.out.println("ID#: " + memberID.get(1)+"-"+sy.get(1));
        System.out.println("Gender M/F: " + gender.get(1));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(1)+"/"+BirthDate.get(1)+"/"+BirthYear.get(1));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(1));
        System.out.println("Email: " + email.get(1));
        System.out.println();
        
    }
    //2
    public void changesecretary(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("   REGISTRATION OF SECRETARY: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthSEC = sc.nextInt();
        
        if(monthSEC >= 01 && monthSEC <= 12){
            month.set(2,monthSEC);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int daySEC = sc.nextInt();
        
        
        if(daySEC >= 01 && daySEC <= 31){
            day.set(2,daySEC);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yearSEC = sc.nextInt();
        
        if(yearSEC >= 2000 && yearSEC <= 2023){
            year.set(2,yearSEC);
        }
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
 
        System.out.print("ID# 4 numbers only: ");
        int idSEC = sc.nextInt();
        
        if(idSEC < 1000 || idSEC > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(2, idSEC);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
            sy.set(2,yearid);
        }
        
        else{
            throw new ArithmeticException("Please enter 2000 - 2023 only.");   
             
        }
            
        System.out.print("First Name: ");
        String firstnameSEC = sc.next();
        firstName.set(2,firstnameSEC);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnameSEC = sc.next();
        lastName.set(2,lastnameSEC);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(2, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char genderSEC = sc.next().charAt(0);
        
        if(genderSEC == 'M' || genderSEC =='F'){
            gender.set(2,genderSEC);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(2,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(2,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(2,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(2,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailvpres = sc.next();
        
        if (Emailvpres.endsWith("@gmail.com")) {
            email.set(2,Emailvpres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("   REGISTERED AS SECRETARY!");
        System.out.println();
        
    }
    //2
    public void changedsecretary(){
        
        System.out.println();
        System.out.println("Position: "+position.get(2) + " \nDay Elected mm/dd/yyyy: " + month.get(2)+"/"+day.get(2)+"/"+year.get(2) );
        System.out.println("Fullname: " + firstName.get(2) +" "+middle_initial.get(2)+". "+lastName.get(2));
        System.out.println("ID#: " + memberID.get(2)+"-"+sy.get(2));
        System.out.println("Gender M/F: " + gender.get(2));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(2)+"/"+BirthDate.get(2)+"/"+BirthYear.get(2));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(2));
        System.out.println("Email: " + email.get(2));
        System.out.println();
        
    }
    //3
    public void changetresurer(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("   REGISTRATION OF TREASURER: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthtres = sc.nextInt();
        
        if(monthtres >= 01 && monthtres <= 12){
            month.set(3,monthtres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int daytres = sc.nextInt();
        
        
        if(daytres >= 01 && daytres <= 31){
            day.set(3,daytres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yeartres = sc.nextInt();
        
        if(yeartres >= 2000 && yeartres <= 2023){
            year.set(3,yeartres);
        }
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
 
        System.out.print("ID# 4 numbers only: ");
        int idtres = sc.nextInt();
        
        if(idtres < 1000 || idtres > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(3, idtres);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
            sy.set(3,yearid);   
        }
        
        else{
            throw new ArithmeticException("Please enter 2000 - 2023 only.");
             
        }
            
        System.out.print("First Name: ");
        String firstnametres = sc.next();
        firstName.set(3,firstnametres);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnametres = sc.next();
        lastName.set(3,lastnametres);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(3, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char gendertres = sc.next().charAt(0);
        
        if(gendertres == 'M' || gendertres =='F'){
            gender.set(3,gendertres);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(3,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(3,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(3,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(3,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailtres = sc.next();
        
        if (Emailtres.endsWith("@gmail.com")) {
            email.set(3,Emailtres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("    REGISTERED AS TREASURER!");
        System.out.println();
        
    }
    //3
    public void changedtresurer(){
        
        System.out.println();
        System.out.println("Position: "+position.get(3) + " \nDay Elected mm/dd/yyyy: " + month.get(3)+"/"+day.get(3)+"/"+year.get(3)  );
        System.out.println("Fullname: " + firstName.get(3) +" "+middle_initial.get(3)+". "+lastName.get(3));
        System.out.println("ID#: " + memberID.get(3)+"-"+sy.get(3));
        System.out.println("Gender M/F: " + gender.get(3));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(3)+"/"+BirthDate.get(3)+"/"+BirthYear.get(3));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(3));
        System.out.println("Email: " + email.get(3));
        System.out.println();
        
    }
    //4
    public void changeauditor(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("    REGISTRATION OF AUDITOR: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthtres = sc.nextInt();
        
        if(monthtres >= 01 && monthtres <= 12){
            month.set(4,monthtres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int daytres = sc.nextInt();
        
        
        if(daytres >= 01 && daytres <= 31){
            day.set(4,daytres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yeartres = sc.nextInt();
        
        if(yeartres >= 2000 && yeartres <= 2023){
            year.set(4,yeartres);
        }
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
 
        System.out.print("ID# 4 numbers only: ");
        int idPres = sc.nextInt();
        
        if(idPres < 1000 || idPres > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(4, idPres);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
            sy.set(4,yearid);  
        }
        
        else{
            throw new ArithmeticException("Please enter 2000 - 2023 only."); 
             
        }
            
        System.out.print("First Name: ");
        String firstnametres = sc.next();
        firstName.set(4,firstnametres);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnametres = sc.next();
        lastName.set(4,lastnametres);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(4, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char gendertres = sc.next().charAt(0);
        
        if(gendertres == 'M' || gendertres =='F'){
            gender.set(4,gendertres);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(4,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(4,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(4,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(4,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailtres = sc.next();
        
        if (Emailtres.endsWith("@gmail.com")) {
            email.set(4,Emailtres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("     REGISTERED AS AUDITOR!");
        System.out.println();
        
    }
    //4
    public void changedauditor(){
        
        System.out.println();
        System.out.println("Position: "+position.get(4) + " \nDay Elected mm/dd/yyyy: " + month.get(4)+"/"+day.get(4)+"/"+year.get(4) );
        System.out.println("Fullname: " + firstName.get(4) +" "+middle_initial.get(4)+". "+lastName.get(4));
        System.out.println("ID#: " + memberID.get(4)+"-"+sy.get(4));
        System.out.println("Gender M/F: " + gender.get(4));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(4)+"/"+BirthDate.get(4)+"/"+BirthYear.get(4));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(4));
        System.out.println("Email: " + email.get(4));
        System.out.println();
        
    }
    //5
    public void changepro(Scanner sc){
    
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("      REGISTRATION OF PRO: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("Month elected /mm: ");
        int monthtres = sc.nextInt();
        
        if(monthtres >= 01 && monthtres <= 12){
            month.set(5,monthtres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 12 only."); 
        }
        
        System.out.print("Day elected /dd: ");
        int daytres = sc.nextInt();
        
        
        if(daytres >= 01 && daytres <= 31){
            day.set(5,daytres);
        }
        else{
             throw new ArithmeticException("Please enter 01 - 31 only.");   
        }
        
        System.out.print("Year elected /yyyy: ");
        int yeartres = sc.nextInt();
        
        if(yeartres >= 2000 && yeartres <= 2023){
            year.set(5,yeartres);
        }
        else{
             throw new ArithmeticException("Please enter 2000 - 2023 only.");   
        }
 
        System.out.print("ID# 4 numbers only: ");
        int idPres = sc.nextInt();
        
        if(idPres < 1000 || idPres > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.set(5, idPres);
        }
 
        System.out.print("Enter your School Year: ");
        int yearid = sc.nextInt();
        
        if(yearid >= 2000 && yearid <= 2023){
             sy.set(5,yearid);
        }
        
        else{           
             throw new ArithmeticException("Please enter 2000 - 2023 only.");  
        }
            
        System.out.print("First Name: ");
        String firstnametres = sc.next();
        firstName.set(5,firstnametres);
        sc.nextLine();
   
        System.out.print("Last Name: ");
        String lastnametres = sc.next();
        lastName.set(5,lastnametres);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.set(5, initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char gendertres = sc.next().charAt(0);
        
        if(gendertres == 'M' || gendertres =='F'){
            gender.set(5,gendertres);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
            
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.set(5,birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.set(5,birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.set(5,birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }
      
        System.out.print("Cellphone number: +63");
        long cellphonenumpres = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenumpres >= 9000000000L && cellphonenumpres <= 9999999999L){
            cellphoneNum.set(5,cellphonenumpres);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Emailtres = sc.next();
        
        if (Emailtres.endsWith("@gmail.com")) {
            email.set(5,Emailtres);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("       REGISTERED AS PRO!");
        System.out.println();
        
    }
    //5
    public void changedpro(){
        
        System.out.println();
        System.out.println("Position: "+position.get(5) + " \nDay Elected mm/dd/yyyy: " + month.get(5)+"/"+day.get(5)+"/"+year.get(5)  );
        System.out.println("Fullname: " + firstName.get(5) +" "+middle_initial.get(5)+". "+lastName.get(5));
        System.out.println("ID#: " + memberID.get(5)+"-"+sy.get(5));
        System.out.println("Gender M/F: " + gender.get(5));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(5)+"/"+BirthDate.get(5)+"/"+BirthYear.get(5));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(5));
        System.out.println("Email: " + email.get(5));
        System.out.println();
        
    }
    
    public void registrationMembers(Scanner sc){
        
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("    REGISTRATION OF MEMBERS: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();    
        System.out.print("ID# 4 numbers only: ");
        int id = sc.nextInt();

        if(id < 1000 || id > 9999){
            throw new ArithmeticException("Please enter 4 digits only.");   
        }
        
        else{
             memberID.add(id);
        }
 
        System.out.print("Enter your School Year: ");
        int syear = sc.nextInt();
        sc.nextLine();
        
        if(syear >= 2000 && syear <= 2023){
            sy.add(syear); 
        }
        
        else{
            throw new ArithmeticException("Please enter 2000 - 2023 only."); 
        }
            
        System.out.print("First Name: ");
        String firstname1 = sc.nextLine();
        firstName.add(firstname1);
   
        System.out.print("Last Name: ");
        String lastname1 = sc.nextLine();
        lastName.add(lastname1);
            
        System.out.print("Middle Initial: ");
        String input = sc.next();

        if (input.length() == 1) {
        char initialpres = input.charAt(0);

        if (initialpres >= 'A' && initialpres <= 'Z') {
        middle_initial.add(initialpres);
         } else {
        throw new ArithmeticException("Please enter A to Z only.");
        }
        } else {
        throw new ArithmeticException("Please enter only one character.");
        }
        
        System.out.print("Gender M/F: ");
        char gender1 = sc.next().charAt(0);
        
        if(gender1 == 'M' || gender1 =='F'){
            gender.add(gender1);
        }
        else{
             throw new ArithmeticException("Please enter M or F only.");   
        }
        
        System.out.print("BirthMonth / mm: ");
        int birthmonth = sc.nextInt();
        
        if(birthmonth >= 01 && birthmonth <= 12){
            BirthMonth.add(birthmonth);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 12 only.");   
        }
        
        System.out.print("BirthDate / dd: ");
        int birthdate = sc.nextInt();
        
        if(birthdate >= 01 && birthdate <= 31){
            BirthDate.add(birthdate);
        }
        else{
             throw new ArithmeticException("Please enter 01 to 31 only.");   
        }
        
        System.out.print("BirthYear / yyyy: ");
        int birthyear = sc.nextInt();
        
        if(birthyear >= 1995 && birthyear <= 2030){
            BirthYear.add(birthyear);
        }
        else{
             throw new ArithmeticException("Please enter 1995 to 2030 only.");   
        }

        System.out.print("Cellphone number: +63");
        long cellphonenum = sc.nextLong();
        sc.nextLine();
        
        if(cellphonenum >= 9000000000L && cellphonenum <= 9999999999L){
            cellphoneNum.add(cellphonenum);
        }
        else{
             throw new ArithmeticException("Please enter 10 digits only and begin at 9.");   
        }
            
        System.out.print("Email: ");
        String Email = sc.nextLine();
 
        if (Email.endsWith("@gmail.com")) {
            email.add(Email);
            
        } else {
            throw new IllegalArgumentException("Invalid email address! Please enter an email address ending with @gmail.com.");
        }
        
        System.out.println();
            
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("     REGISTERED AS A MEMBER!");
        System.out.println();  
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(MEMBERS_FILE_NAME, true));
            
            writer.write("Fullname: " + firstname1+" "+input+". "+lastname1+("\n"));
            writer.write("ID#: " + id+"-"+syear+("\n"));
            writer.write("Gender M/F: " + gender1+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + birthmonth+"/"+birthdate+"/"+birthyear+("\n"));
            writer.write("Cellphone number: +63" + cellphonenum+("\n"));
            writer.write("Email: " + Email+("\n"));
            writer.newLine();
            writer.close();
            
        }
        catch (IOException e) {
            System.out.println("An error occurred while showing the members!.");
            e.printStackTrace();
        }    
        
    }
  
    public void informationofOfficers(){
        
        System.out.println();
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("    INFORMATION OF OFFICERS: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println();
        
    //PRES
        System.out.println("Position: "+position.get(0) + " \nDay Elected mm/dd/yyyy: " + month.get(0)+"/"+day.get(0)+"/"+year.get(0) );
        System.out.println("Fullname: " + firstName.get(0) +" "+middle_initial.get(0)+". "+lastName.get(0));
        System.out.println("ID#: " + memberID.get(0)+"-"+sy.get(0));
        System.out.println("Gender M/F: " + gender.get(0));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(0)+"/"+BirthDate.get(0)+"/"+BirthYear.get(0));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(0));
        System.out.println("Email: " + email.get(0));
        System.out.println();
        
        System.out.println("-------------------------------");
        
    //VPRES    
        System.out.println();
        System.out.println("Position: "+position.get(1) + " \nDay Elected mm/dd/yyyy: " + month.get(1)+"/"+day.get(1)+"/"+year.get(1) );
        System.out.println("Fullname: " + firstName.get(1) +" "+middle_initial.get(1)+". "+lastName.get(1));
        System.out.println("ID#: " + memberID.get(1)+"-"+sy.get(1));
        System.out.println("Gender M/F: " + gender.get(1));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(1)+"/"+BirthDate.get(1)+"/"+BirthYear.get(1));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(1));
        System.out.println("Email: " + email.get(1));
        System.out.println();
        
        System.out.println("-------------------------------");
        
    //SEC
        System.out.println();
        System.out.println("Position: "+position.get(2) + " \nDay Elected mm/dd/yyyy: " + month.get(2)+"/"+day.get(2)+"/"+year.get(2) );
        System.out.println("Fullname: " + firstName.get(2) +" "+middle_initial.get(2)+". "+lastName.get(2));
        System.out.println("ID#: " + memberID.get(2)+"-"+sy.get(2));
        System.out.println("Gender M/F: " + gender.get(2));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(2)+"/"+BirthDate.get(2)+"/"+BirthYear.get(2));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(2));
        System.out.println("Email: " + email.get(2));
        System.out.println();
        
        System.out.println("-------------------------------");
        
    //TRES
        System.out.println();
        System.out.println("Position: "+position.get(3) + " \nDay Elected mm/dd/yyyy: " + month.get(3)+"/"+day.get(3)+"/"+year.get(3) );
        System.out.println("Fullname: " + firstName.get(3) +" "+middle_initial.get(3)+". "+lastName.get(3));
        System.out.println("ID#: " + memberID.get(3)+"-"+sy.get(3));
        System.out.println("Gender M/F: " + gender.get(3));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(3)+"/"+BirthDate.get(3)+"/"+BirthYear.get(3));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(3));
        System.out.println("Email: " + email.get(3));
        System.out.println();    
        
        System.out.println("-------------------------------");
        
    //AUD
        System.out.println();
        System.out.println("Position: "+position.get(4) + " \nDay Elected mm/dd/yyyy: " + month.get(4)+"/"+day.get(4)+"/"+year.get(4) );
        System.out.println("Fullname: " + firstName.get(4) +" "+middle_initial.get(4)+". "+lastName.get(4));
        System.out.println("ID#: " + memberID.get(4)+"-"+sy.get(4));
        System.out.println("Gender M/F: " + gender.get(4));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(4)+"/"+BirthDate.get(4)+"/"+BirthYear.get(4));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(4));
        System.out.println("Email: " + email.get(4));
        System.out.println();    
        
        System.out.println("-------------------------------");
        
    //PRO
        System.out.println();
        System.out.println("Position: "+position.get(5) + " \nDay Elected mm/dd/yyyy: " + month.get(5)+"/"+day.get(5)+"/"+year.get(5) );
        System.out.println("Fullname: " + firstName.get(5) +" "+middle_initial.get(5)+". "+lastName.get(5));
        System.out.println("ID#: " + memberID.get(5)+"-"+sy.get(5));
        System.out.println("Gender M/F: " + gender.get(5));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(5)+"/"+BirthDate.get(5)+"/"+BirthYear.get(5));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(5));
        System.out.println("Email: " + email.get(5));
        System.out.println();   
        
    }
    
    public void informationofMembers(Scanner sc){
        
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("    INFORMATION OF MEMBERS: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println();
    
    if (firstName.size() >= 7) {
        System.out.println("Fullname: " + firstName.get(6) +" "+middle_initial.get(6)+". "+lastName.get(6));
        System.out.println("ID#: " + memberID.get(6)+"-"+sy.get(6));
        System.out.println("Gender M/F: " + gender.get(6));
        System.out.println("Date of Birth mm/dd/yyyy: " + BirthMonth.get(6)+"/"+BirthDate.get(6)+"/"+BirthYear.get(6));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(6));
        System.out.println("Email: " + email.get(6));
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println();
    }
    if (firstName.size() >= 8) {
        System.out.println("Fullname: " + firstName.get(7) + " "+middle_initial.get(7)+". "+lastName.get(7));
        System.out.println("ID#: " +memberID.get(7)+"-"+sy.get(7));
        System.out.println("Gender M/F: " +gender.get(7));
        System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(7)+"/"+BirthDate.get(7)+"/"+BirthYear.get(7));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(7));
        System.out.println("Email: " +email.get(7));
        System.out.println();
        
    }
    if (firstName.size() >= 9) {
        System.out.println("-------------------------------");
        System.out.println();
        
        System.out.println("Fullname: " + firstName.get(8) + " "+middle_initial.get(8)+". "+lastName.get(8));
        System.out.println("ID#: " +memberID.get(8)+"-"+sy.get(8));
        System.out.println("Gender M/F: " +gender.get(8));
        System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(8)+"/"+BirthDate.get(8)+"/"+BirthYear.get(8));
        System.out.println("Cellphone number: +63" + cellphoneNum.get(8));
        System.out.println("Email: " +email.get(8));
        System.out.println();
        
    }
    
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(MEMBERS_FILE_NAME, true));
            
            writer.write("Fullname: " + firstName.get(6) +" "+middle_initial.get(6)+". "+lastName.get(6)+("\n"));
            writer.write("ID#: " + memberID.get(6)+"-"+sy.get(6)+("\n"));
            writer.write("Gender M/F: " + gender.get(6)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(6)+"/"+BirthDate.get(6)+"/"+BirthYear.get(6)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(6)+("\n"));
            writer.write("Email: " + email.get(6)+("\n"));
            
            writer.newLine();
            
            writer.write("Fullname: " + firstName.get(7) +" "+middle_initial.get(7)+". "+lastName.get(7)+("\n"));
            writer.write("ID#: " + memberID.get(7)+"-"+sy.get(7)+("\n"));
            writer.write("Gender M/F: " + gender.get(7)+("\n"));
            writer.write("Date of Birth mm/dd/yyyy: " + BirthMonth.get(7)+"/"+BirthDate.get(7)+"/"+BirthYear.get(7)+("\n"));
            writer.write("Cellphone number: +63" + cellphoneNum.get(7)+("\n"));
            writer.write("Email: " + email.get(7)+("\n"));
            
            writer.newLine();
            
            writer.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while showing the members!.");
            e.printStackTrace();
        }       
    
    }
    
    public void userinput(int id, int syear,String firstname1, String lastname1, char initial, char gender1, int birthmonth, int birthdate, int birthyear, long cellphonenum, String Email){
        
        System.out.println("Fullname: " + firstname1 + " "+middle_initial.set(8,initial)+". "+lastName.set(8,lastname1));
        System.out.println("ID#: " +memberID.set(8,id)+"-"+sy.set(8, syear));
        System.out.println("Gender M/F: " +gender.set(8,gender1));
        System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.set(8,birthmonth)+"/"+BirthDate.set(8,birthdate)+"/"+BirthYear.set(8,birthyear));
        System.out.println("Cellphone number: +63" + cellphoneNum.set(8, cellphonenum));
        System.out.println("Email: " +email.set(8, Email));
        System.out.println();   
        
    }
    
    //123
    
    void searchInformation(Scanner sc){
        
        int memberIDs;
        
        System.out.println();
        System.out.println("-------------------------------");
        
        System.out.println();
        System.out.println("     SEARCH INFORMATION: ");
        System.out.println();
        
        System.out.println("-------------------------------");
        
        System.out.println();
 
        System.out.print("Enter ID number: ");
        memberIDs = sc.nextInt();
        
        if(memberIDs > 1000 || memberIDs < 9999){
         
        System.out.print("Enter School Year: ");
        int syears = sc.nextInt();
        
        if(syears >= 2000 && syears <= 2023){
            // throw new ArithmeticException("Please enter 2000 - 2023 only."); 
        
        System.out.println();
        
        for(int IDs: memberID){

            if(memberIDs == (memberID.get(0)) && syears == (sy.get(0))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(0) + " \nDay Elected mm/dd/yyyy: " + month.get(0)+"/"+day.get(0)+"/"+year.get(0) );
                System.out.println("Fullname: " + firstName.get(0) +" "+middle_initial.get(0)+". "+lastName.get(0));
                System.out.println("ID#: " + memberID.get(0)+"-"+sy.get(0));
                System.out.println("Gender M/F: " + gender.get(0));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(0)+"/"+BirthDate.get(0)+"/"+BirthYear.get(0));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(0));
                System.out.println("Email: " + email.get(0));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(1)) && syears == (sy.get(1))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(1) + " \nDay Elected mm/dd/yyyy: " + month.get(1)+"/"+day.get(1)+"/"+year.get(1) );
                System.out.println("Fullname: " + firstName.get(1) +" "+middle_initial.get(1)+". "+lastName.get(1));
                System.out.println("ID#: " + memberID.get(1)+"-"+sy.get(1));
                System.out.println("Gender M/F: " + gender.get(1));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(1)+"/"+BirthDate.get(1)+"/"+BirthYear.get(1));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(1));
                System.out.println("Email: " + email.get(1));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(2)) && syears == (sy.get(2))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(2) + " \nDay Elected mm/dd/yyyy: " + month.get(2)+"/"+day.get(2)+"/"+year.get(2) );
                System.out.println("Fullname: " + firstName.get(2) +" "+middle_initial.get(2)+". "+lastName.get(2));
                System.out.println("ID#: " + memberID.get(2)+"-"+sy.get(2));
                System.out.println("Gender M/F: " + gender.get(2));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(2)+"/"+BirthDate.get(2)+"/"+BirthYear.get(2));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(2));
                System.out.println("Email: " + email.get(2));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(3)) && syears == (sy.get(3))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(3) + " \nDay Elected mm/dd/yyyy: " + month.get(3)+"/"+day.get(3)+"/"+year.get(3) );
                System.out.println("Fullname: " + firstName.get(3) +" "+middle_initial.get(3)+". "+lastName.get(3));
                System.out.println("ID#: " + memberID.get(3)+"-"+sy.get(3));
                System.out.println("Gender M/F: " + gender.get(3));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(3)+"/"+BirthDate.get(3)+"/"+BirthYear.get(3));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(3));
                System.out.println("Email: " + email.get(3));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(4)) && syears == (sy.get(4))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(4) + " \nDay Elected mm/dd/yyyy: " + month.get(4)+"/"+day.get(4)+"/"+year.get(4) );
                System.out.println("Fullname: " + firstName.get(4) +" "+middle_initial.get(4)+". "+lastName.get(4));
                System.out.println("ID#: " + memberID.get(4)+"-"+sy.get(4));
                System.out.println("Gender M/F: " + gender.get(4));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(4)+"/"+BirthDate.get(4)+"/"+BirthYear.get(4));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(4));
                System.out.println("Email: " + email.get(4));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(5)) && syears == (sy.get(5))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Position: "+position.get(5) + " \nDay Elected mm/dd/yyyy: " + month.get(5)+"/"+day.get(5)+"/"+year.get(5) );
                System.out.println("Fullname: " + firstName.get(5) +" "+middle_initial.get(5)+". "+lastName.get(5));
                System.out.println("ID#: " + memberID.get(5)+"-"+sy.get(5));
                System.out.println("Gender M/F: " + gender.get(5));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(5)+"/"+BirthDate.get(5)+"/"+BirthYear.get(5));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(5));
                System.out.println("Email: " + email.get(5));
                System.out.println();
                break;
                
            }
            else if(memberIDs == (memberID.get(6)) && syears == (sy.get(6))){
                
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Fullname: " + firstName.get(6) + " "+middle_initial.get(6)+". "+lastName.get(6));
                System.out.println("ID#: " +memberID.get(6)+"-"+sy.get(6));
                System.out.println("Gender M/F: " +gender.get(6));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(6)+"/"+BirthDate.get(6)+"/"+BirthYear.get(6));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(6));
                System.out.println("Email: " +email.get(6));
                System.out.println();  
                
                break;
                
            } 
            else if(memberIDs == (memberID.get(7)) && syears == (sy.get(7))){
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Fullname: " + firstName.get(7) + " "+middle_initial.get(7)+". "+lastName.get(7));
                System.out.println("ID#: " +memberID.get(7)+"-"+sy.get(7));
                System.out.println("Gender M/F: " +gender.get(7));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(7)+"/"+BirthDate.get(7)+"/"+BirthYear.get(7));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(7));
                System.out.println("Email: " +email.get(7));
                System.out.println();  
                
                break;
                
            }
            if (firstName.size() == 9) {
            if(memberIDs == (memberID.get(8)) && syears == (sy.get(8))){
            
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Fullname: " + firstName.get(8) + " "+middle_initial.get(8)+". "+lastName.get(8));
                System.out.println("ID#: " +memberID.get(8)+"-"+sy.get(8));
                System.out.println("Gender M/F: " +gender.get(8));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(8)+"/"+BirthDate.get(8)+"/"+BirthYear.get(8));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(8));
                System.out.println("Email: " +email.get(8));
                System.out.println();
                break;
            }
            /*if (firstName.size() == 10) {
            if(memberIDs == (memberID.get(9)) && syears == (sy.get(9))){
            
                System.out.println("       ID NUMBER FOUND!");
                System.out.println();
                
                System.out.println("-------------------------------");
                
                System.out.println();
                System.out.println("Fullname: " + firstName.get(9) + " "+middle_initial.get(9)+". "+lastName.get(9));
                System.out.println("ID#: " +memberID.get(9)+"-"+sy.get(9));
                System.out.println("Gender M/F: " +gender.get(9));
                System.out.println("Date of Birth mm/dd/yyyy: " +BirthMonth.get(9)+"/"+BirthDate.get(9)+"/"+BirthYear.get(9));
                System.out.println("Cellphone number: +63" + cellphoneNum.get(9));
                System.out.println("Email: " +email.get(9));
                System.out.println();
                break;
            }*/
            else {
                
                System.out.println("     ID NUMBER NOT FOUND! "); 
                System.out.println();
                break;
                
            }
            }
            else {
                
                System.out.println("     ID NUMBER NOT FOUND! "); 
                System.out.println();
                break;
                
            }
 
        }
    } 
        else {
        throw new ArithmeticException("Please enter 4 digits only."); 
    }
    } 
}
    
}




