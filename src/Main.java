import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static boolean isCnpLengthValid(int length) {
        boolean flag = true;
        if (length != 13) {
            flag = false;
        }
        return flag;
    }

    public static String getSexFromCnp(String genderIdentifier) {
        String sex = null;
        char firstCharacter = genderIdentifier.charAt(0);

        if (firstCharacter == '1'||
                firstCharacter == '3' ||
                firstCharacter == '5' ||
                firstCharacter == '7') {
            sex = "Male";
        } else if (firstCharacter == '2' ||
                firstCharacter == '4' ||
                firstCharacter == '6' ||
                firstCharacter == '8') {
            sex = "Female";
        }
        return sex;
    }

    public static String getYearPrefix (char firstNumber){
        String prefix = "";
        switch (firstNumber) {
            case '1':
                prefix = "19";
                break;
            case '2':
                prefix = "19";
                break;
            case '3':
                prefix = "18";
                break;
            case '4':
                prefix = "18";
                break;
            case '5':
                prefix = "20";
                break;
            case '6':
                prefix = "20";
                break;
            default:
                prefix = "Invalid";
                break;
        }
        return prefix;

    }

    //birthdate = prefix (pp) + last two numbers of year (yy) + month (mm) + day (dd) => 0 1 2 3 4 5 6 7 (8)
    public static String getBirthDateFromCnpAsString (String CNP) {
        String dateOfBirth = CNP.substring(1, 7);
        String prefix = getYearPrefix(CNP.charAt(0));
        dateOfBirth = prefix + dateOfBirth;
        return dateOfBirth.substring(6, 8) + "-" + dateOfBirth.substring(4, 6) + "-" + dateOfBirth.substring(0, 4);
    }

    public static String [] formatDateAsString (String date){
        String [] formattedDate = date.split("-");
        return formattedDate;
    }

    public static int age (String CNP) {
        String[] birthDateFormatted = formatDateAsString(getBirthDateFromCnpAsString(CNP));

        int dayOfBirth = Integer.parseInt(birthDateFormatted[0]);
        int monthOfBirth = Integer.parseInt(birthDateFormatted[1]);
        int yearOfBirth = Integer.parseInt(birthDateFormatted[2]);

        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        Date date = new Date();

        String currentDate = format.format(date);
        String[] currentDateFormatted = formatDateAsString(currentDate);

        int currentDay = Integer.parseInt(currentDateFormatted[0]);
        int currentMonth = Integer.parseInt(currentDateFormatted[1]);
        int currentYear = Integer.parseInt(currentDateFormatted[2]);

        int age = currentYear - yearOfBirth;
        if (monthOfBirth > currentMonth) {
            age -= 1;
        } else if (monthOfBirth == currentMonth) {
            if (dayOfBirth > currentDay) {
                age -= 1;
            }
        }
        return age;
    }

    public static String countyOfBirth (int countyIdentifier) {
        String county = "";
        if (countyIdentifier == 01){
            System.out.println("County = Alba");
        } else if (countyIdentifier == 02) {
            System.out.println("County = Arad");
        } else if (countyIdentifier == 03) {
            System.out.println("County = Arges");
        } else if (countyIdentifier == 04) {
            System.out.println("County = Bacau");
        } else if (countyIdentifier == 05) {
            System.out.println("County = Bihor");
        } else if (countyIdentifier == 06) {
            System.out.println("County = Bistrita-Nasaud");
        } else if (countyIdentifier == 07) {
            System.out.println("County = Botosani");
        } else if (countyIdentifier == 8) {
            System.out.println("County = Brasov");
        } else if (countyIdentifier == 9) {
            System.out.println("County = Braila");
        }else if (countyIdentifier == 10) {
            System.out.println("County = Buzau");
        } else if (countyIdentifier == 11) {
            System.out.println("County = Caras-Severin");
        } else if (countyIdentifier == 12) {
            System.out.println("County = Cluj");
        } else if (countyIdentifier == 13) {
            System.out.println("County = Constanta");
        } else if (countyIdentifier == 14) {
            System.out.println("County = Covasna");
        } else if (countyIdentifier == 15) {
            System.out.println("County = Dambovita");
        } else if (countyIdentifier == 16) {
            System.out.println("County = Dolj");
        } else if (countyIdentifier == 17) {
            System.out.println("County = Galati");
        } else if (countyIdentifier == 18) {
            System.out.println("County = Gorj");
        } else if (countyIdentifier == 19){
            System.out.println("County = Harghita");
        } else if (countyIdentifier == 20) {
            System.out.println("County = Hunedoara");
        } else if (countyIdentifier == 21) {
            System.out.println("County = Ialomita");
        } else if (countyIdentifier == 22) {
            System.out.println("County = Iasi");
        } else if (countyIdentifier == 23) {
            System.out.println("County = Ilfov");
        } else if (countyIdentifier == 24) {
            System.out.println("County = Maramures");
        } else if (countyIdentifier == 25) {
            System.out.println("County = Mehedinti");
        } else if (countyIdentifier == 26) {
            System.out.println("County = Mures");
        } else if (countyIdentifier == 27) {
            System.out.println("County = Neamt");
        } else if (countyIdentifier == 28) {
            System.out.println("County = Olt");
        } else if (countyIdentifier == 29) {
            System.out.println("County = Prahova");
        } else if (countyIdentifier == 30) {
            System.out.println("County = Satu Mare");
        } else if (countyIdentifier == 31) {
            System.out.println("County = Salaj");
        } else if (countyIdentifier == 32) {
            System.out.println("County = Sibiu");
        } else if (countyIdentifier == 33) {
            System.out.println("County = Suceava");
        } else if (countyIdentifier == 34) {
            System.out.println("County = Teleorman");
        } else if (countyIdentifier == 35) {
            System.out.println("County = Timis");
        } else if (countyIdentifier == 36) {
            System.out.println("County = Tulcea");
        } else if (countyIdentifier == 37) {
            System.out.println("County = Vaslui");
        } else if (countyIdentifier == 38) {
            System.out.println("County = Valcea");
        } else if (countyIdentifier == 39) {
            System.out.println("County = Vrancea");
        } else if (countyIdentifier == 40) {
            System.out.println("County = Bucuresti");
        } else if (countyIdentifier == 41) {
            System.out.println("County = Bucuresti - Sector 1");
        } else if (countyIdentifier == 42) {
            System.out.println("County = Bucuresti - Sector 2");
        } else if (countyIdentifier == 43) {
            System.out.println("County = Bucuresti - Sector 3");
        } else if (countyIdentifier == 44) {
            System.out.println("County = Bucuresti - Sector 4");
        } else if (countyIdentifier == 45) {
            System.out.println("County = Bucuresti - Sector 5");
        } else if (countyIdentifier == 46) {
            System.out.println("County = Bucuresti - Sector 6");
        } else if (countyIdentifier == 51) {
            System.out.println("County = Calarasi");
        } else if (countyIdentifier == 52) {
            System.out.println("County = Giurgiu");
        }
        return county;
    }

    public static void main(String[] args) {

        String CNP = "";
        System.out.println(CNP);

        isCnpLengthValid(CNP.length());
        System.out.println("Sex = " + getSexFromCnp(CNP));
        System.out.println(countyOfBirth(Integer.parseInt(CNP.substring(7,9))));
        System.out.println("Date of birth = " + getBirthDateFromCnpAsString(CNP));
        System.out.println("You are " + age(CNP) + " years old now.");


    }
}






