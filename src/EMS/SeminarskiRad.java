
/*
   Predmet: Softversko inženjerstvo II
   ZADATAK: Kreirati timove kao i na predmetu Baze podataka. Kreirati klase i funkcionalnosti za model koji je kreiran na predmetu Baze podataka.
            Kod i opis koda uraditi kroz seminarski rad. Svaki tim ce na zadnjem predavanju uz diskusiju pokazati rezultate svog rada (bez pravljenja prezentacije).

   Tema seminarskog rada: EMS (Employment Management System) - vođenje evidencije o zaposlenicima

   Članovi tima:
    - Papučić Amna, 8102
    - Topalović Aldin, 7966
    - Vujičić Lana, 7995
 */

package EMS;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeminarskiRad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//-------------------------------------------------------------- LISTA ZAPOSLENIH --------------------------------------------------------------------------------
        ArrayList<Zaposlenik> zaposleni = new ArrayList<>();

        zaposleni.add(new Zaposlenik("Amna", "Papučić", 2301000, "Sarajevo", "Sarajevo", 61434343, "IT menadžer", "Tehnički sektor-IT podrška", "amna.papucic@fsk.unsa.ba", "amna1"));
        zaposleni.add(new Zaposlenik("Lana", "Vujičić", 2604999, "Sarajevo", "Sarajevo", 61444444, "Menadžer", "Menadžment sektor", "lana.vujicic@fsk.unsa.ba", "lana2"));
        zaposleni.add(new Zaposlenik("Aldin", "Topalović", 1001999, "Sarajevo", "Sarajevo", 62225883, "Finansije", "Sektor za finansije i knjigovodstvo", "aldin.topalovic@fsk.unsa.ba", "aldin3"));
        zaposleni.add(new Zaposlenik("Rizvan", "Alen", 1602000, "Bugojno", "Banja Luka", 61852369, "Nadzorni odbor", "Sektor za razvoj i projektovanje", "alen2000@hotmail.com", "7895"));
        zaposleni.add(new Zaposlenik("Olivia", "Coleman", 1607993, "Texas", "Berlin", 49173654, "Nadzorni odbor", "Sektor za upravljanje kvalitetom i okolišem", "olivia.col@yahoo.com", "4462"));
        zaposleni.add(new Zaposlenik("Adi", "Dizdar", 1805996, "Mostar", "Mostar", 61987123, "Marketing menadžer", "Marketing sektor", "dizdar.adii@gmail.com", "8520"));
        zaposleni.add(new Zaposlenik("Izudin", "Begović", 2903998, "Zenica", "Zenica", 61987456, "IT podrška", "Sektor za razvoj i projektovanje", "izudin.begovic@hotmail.com", "1598"));
        zaposleni.add(new Zaposlenik("Adin", "Džindo", 2910994, "Doboj", "Sarajevo", 63226998, "Upravni odbor", "Sektor za investicije i investiciono održavanje", "dzindo.adin@hotmail.com", "3224"));
        zaposleni.add(new Zaposlenik("Tina", "Vujović", 1402001, "Tuzla", "Tuzla", 61003258, "Marketing menadžer", "Menadžment sektor", "tina.vujovic20@gmail.com", "1167"));
        zaposleni.add(new Zaposlenik("Merima", "Cico", 2912998, "Sarajevo", "Sarajevo", 62222222, "Generalni direktor", "Sektor za ljudske resurse", "merima.cico@fsk.unsa.ba", "8036"));

//-------------------------------------------------------------- LISTA ODSUSTVA ----------------------------------------------------------------------------------
        ArrayList<Odsustvo> odsustva = new ArrayList<>();

        odsustva.add(new Odsustvo("Aldin","Topalović",1001999,"Praznik","29.12.2021", "03.01.2022"));
        odsustva.add(new Odsustvo("Tina","Vujović",1402001,"Praznik","29.12.2021", "03.01.2022"));
        odsustva.add(new Odsustvo("Alen","Rizvan",1602000,"Smrtni slučaj","03.01.2022", "10.01.2022"));
        odsustva.add(new Odsustvo("Olivia","Coleman",1607993,"Poslovno putovanje","20.10.2021", "30.10.2021"));
        odsustva.add(new Odsustvo("Adi","Dizdar",1805996,"Bolovanje","15.08.2021", "24.08.2021"));
        odsustva.add(new Odsustvo("Amna","Papučić",2301000,"Praznik","29.12.2021", "03.01.2022"));
        odsustva.add(new Odsustvo("Lana","Vujičić",2604999,"Godišnji odmor","22.09.2021", "02.10.2021"));
        odsustva.add(new Odsustvo("Izudin","Begović",2903998,"Slobodni dan","10.01.2022", "12.01.2022"));

//-------------------------------------------------------------- LISTA RADNOG VREMENA -----------------------------------------------------------------------------
        ArrayList<VrijemeRada> vrijeme = new ArrayList<>();

        vrijeme.add(new VrijemeRada("Aldin", "Topalović",1001999, "18.01.2022","07:30:45","16:02:08" ));
        vrijeme.add(new VrijemeRada("Lana", "Vujičić",2604999, "18.01.2022","07:42:27","16:16:36" ));
        vrijeme.add(new VrijemeRada("Amna", "Papučić",2301000, "18.01.2022","08:30:33","17:06:47" ));
        vrijeme.add(new VrijemeRada("Alen", "Rizvan",1602000, "18.01.2022","07:53:28","16:24:06" ));
        vrijeme.add(new VrijemeRada("Olivia", "Coleman",1607993, "18.01.2022","08:01:49","16:38:45" ));
        vrijeme.add(new VrijemeRada("Adi", "Dizdar",1805996, "18.01.2022","08:05:22","16:38:19" ));
        vrijeme.add(new VrijemeRada("Izudin", "Begović",2903998, "18.01.2022","08:42:56","17:15:28" ));
        vrijeme.add(new VrijemeRada("Adin", "Džindo",2910994, "18.01.2022","09:00:54","17:52:21" ));
        vrijeme.add(new VrijemeRada("Tina", "Vujović",1402001, "18.01.2022","07:46:13","16:15:43" ));
        vrijeme.add(new VrijemeRada("Merima", "Cico",2912998, "18.01.2022","08:15:32","16:50:41" ));
        vrijeme.add(new VrijemeRada("Lana", "Vujičić",2604999, "19.01.2022","08:10:45","17:01:23" ));
        vrijeme.add(new VrijemeRada("Aldin", "Topalović",1001999, "19.01.2022","09:04:55","18:01:34" ));
        vrijeme.add(new VrijemeRada("Amna", "Papučić",2301000, "19.01.2022","07:50:49","16:26:46" ));

//------------------------------------------------------ POČETAK RADA PROGRAMA -------------------------------------------------------------------------------------
        pozdrav();
        int cijeliBroj = Integer.valueOf(scanner.nextLine());

//------------------------------------------------------------ LOG IN ----------------------------------------------------------------------------------------------
        if (cijeliBroj == 1) {
            Zaposlenik podaci = checkUserCredentials(zaposleni, scanner);
            pocetneOpcije();
            while (true) {
                String opcija = scanner.nextLine().toLowerCase(Locale.ROOT);

//============================================== OPCIJA 1 - PREGLED LIČNIH PODATAKA ==================================================================================

                 if (opcija.equals("1")) {
                    System.out.println("Prezime i ime: " + podaci.prezime + " " +  podaci.ime);
                    System.out.println("JMBG: " + podaci.JMBG);
                    System.out.println("Mjesto rođenja: " + podaci.mjestoRodenja);
                    System.out.println("Mjesto prebivališta: " + podaci.mjestoPrebivalista);
                    System.out.println("Broj telefona: " + podaci.brTelefona);
                    System.out.println("Radna pozicija: " + podaci.pozicija);
                    System.out.println("Sektor: " + podaci.sektor);
                    System.out.println("E-mail: " + podaci.email);
                    pocetneOpcije();
                }

//============================================ OPCIJA 2 - PODACI O RADNOM VREMENU ================================================================================

                 else if (opcija.equals("2")) {
                    System.out.println("Odaberite jednu od ponuđenih opcija: ");
                    System.out.println("1. Pregled dosadašnjeg radnog vremena");
                    System.out.println("2. Unos novog vremena dolaska i odlaska s posla");
                    System.out.println("3. Nazad na početne opcije");

                    String radnoVrijeme = scanner.nextLine().toLowerCase(Locale.ROOT);
                    System.out.println("");

//---------------------------------------------------- PODOPCIJE OPCIJE 2 ----------------------------------------------------------------------------------------

                    if (radnoVrijeme.equals("1")) {
                        checkUserWorkTime(vrijeme, podaci.JMBG);
                        pocetneOpcije();

                    } else if (radnoVrijeme.equals("2")) {
                        System.out.println("Unesite datum dolaska i odlaska: (DD.MM.GGGG)");
                        String datum = scanner.nextLine();
                        System.out.println("Unesite Vaš dolazak na posao: (hh:mm:ss)");
                        String vrijemeDol = scanner.nextLine();
                        System.out.println("Unesite Vaš odlazak sa posla: (hh:mm:ss)");
                        String vrijemeOdl = scanner.nextLine();
                        vrijeme.add(new VrijemeRada(podaci.ime, podaci.prezime, podaci.JMBG, datum, vrijemeDol, vrijemeOdl));
                        System.out.println("");
                        checkUserWorkTime(vrijeme, podaci.JMBG);
                        pocetneOpcije();

                    } else if (radnoVrijeme.equals("3")) {
                        pocetneOpcije();

                    } else {
                        System.out.println("Molim Vas odaberite jednu od ponuđenih opcija!");
                        pocetneOpcije();
                    }
                }

//=================================================== OPCIJA 3 - PODACI O ODSUSTVIMA ====================================================================================

                 else if (opcija.equals("3")) {
                 opcijaOdsustva();
                 int opcija2 =Integer.valueOf(scanner.nextLine());

                        if (opcija2 == 1) {
                            System.out.println("");
                            System.out.println("Odaberite vrstu odsustva?");
                            System.out.println("1. Godišnji odmor");
                            System.out.println("2. Praznik");
                            System.out.println("3. Slobodni dani");
                            System.out.println("4. Poslovno putovanje");
                            System.out.println("5. Bolovanje");
                            System.out.println("6. Smrtni slučaj");

                            int vrstaOdsustva =Integer.valueOf(scanner.nextLine());

                            if (vrstaOdsustva == 1){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Godišnji odmor",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else if (vrstaOdsustva == 2){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Praznik",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else if (vrstaOdsustva == 3){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Slobodni dani",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else if (vrstaOdsustva == 4){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Poslovno putovanje",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else if (vrstaOdsustva == 5){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Bolovanje",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else if (vrstaOdsustva == 6){
                                System.out.println("Unesite datum odlaska: (DD.MM.GGGG)");
                                String datumOdl=scanner.nextLine();
                                System.out.println("Unesite datum dolaska: (DD.MM.GGGG)");
                                String datumDol=scanner.nextLine();
                                odsustva.add(new Odsustvo(podaci.ime, podaci.prezime, podaci.JMBG,"Smrtni slučaj",datumOdl,datumDol));
                                System.out.println("Vaše odsustvo je zabilježeno, ovo je Vaša lista svih odsustava: ");
                                System.out.println("");
                                checkOdsustvo(odsustva,podaci.JMBG);
                                pocetneOpcije();

                            } else {
                                System.out.println("Molimo unesite jedno od ponuđenih opcija");
                            }
                        } else if (opcija2 == 2){
                            checkOdsustvo(odsustva,podaci.JMBG);
                            pocetneOpcije();
                        } else if (opcija2 == 3){
                            pocetneOpcije();
                     }
                }

//==================================================== IZLAZ IZ SISTEMA ==================================================================================================

                 else if (opcija.equals("q")) {
                     System.out.println("");
                     System.out.println("Odjavili ste se sa svog profila.");
                     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                     Date date = new Date();
                     System.out.println(formatter.format(date));
                     break;

                 } else {
                    System.out.println("Molimo Vas unesite jedan od ponuđenih znakova (1, 2, 3 ili Q za izlaz)");
                 }

            }

        }

//------------------------------------------------------------------- SIGN IN ---------------------------------------------------------------------------------------

        //Unos podataka novog zaposlenika
        else if (cijeliBroj == 2) {
            System.out.println("");
            System.out.println("Zdravo! Kako biste napravili Vaš profil u EMS sistemu, molimo Vas da popunite formu koja slijedi.");
            System.out.println("");
            System.out.println("Unesite Vaš e-mail: ");
            String email2 = scanner.nextLine();
            System.out.println("Unesite željenu šifru: ");
            String sifra2 = scanner.nextLine();
            System.out.println("Unesite Vaše ime: ");
            String ime = scanner.nextLine();
            System.out.println("Unesite Vaše prezime: ");
            String prezime = scanner.nextLine();
            System.out.println("Unesite Vaš JMBG: ");
            int JMBG = Integer.valueOf(scanner.nextLine());
            System.out.println("Unesite Vaše mjesto rođenja: ");
            String mjestoRodenja = scanner.nextLine();
            System.out.println("Unesite Vaše mjesto prebivališta: ");
            String mjestoPrebivalista = scanner.nextLine();
            System.out.println("Unesite Vaš broj telefona: ");
            int brTelefona = Integer.valueOf(scanner.nextLine());
            System.out.println("Unesite Vašu poziciju u kompaniji: ");
            String pozicija = scanner.nextLine();
            System.out.println("Unesite sektor kojem pripadate: ");
            String sektor = scanner.nextLine();

            //Spremanje unesenih podataka u listu 'zaposleni'
            zaposleni.add(new Zaposlenik(ime, prezime, JMBG, mjestoRodenja, mjestoPrebivalista, brTelefona, pozicija, sektor, email2, sifra2));

            dobrodoslica();
            System.out.println("Da li biste željeli vidjeti svoje unesene podatke (upišite D za DA ili N za NE)?");

            while (true){
                String licniPodaci = scanner.nextLine().toUpperCase(Locale.ROOT);
                System.out.println("");

                if (licniPodaci.equals("D")){
                    System.out.println("Vaši podaci su: ");
                    System.out.println("-----------------");
                    ispisPodataka(zaposleni);
                    break;

                } else if (licniPodaci.equals("N")){
                    System.out.println("Uredu, želimo Vam ugodan ostatak dana. :)");
                    break;

                } else {
                    System.out.println("Molim Vas unesite znak D ukoliko želite vidjeti svoje podatke ili N ukoliko ne želite?");
                }
            }

        } else {
            System.out.println("Molimo Vas unesite broj 1 ili 2?");
        }
    }

//================================================= FUNKCIJE ===========================================================

    public static void pozdrav() {
        System.out.println("EMPLOYMENT MANAGEMENT SYSTEM");
        System.out.println("");
        System.out.println("Dobrodošli, molimo Vas odaberite jednu od navedenih opcija (upišite broj 1 ili 2): ");
        System.out.println("1. Log in");
        System.out.println("2. Sign in");
        System.out.println("------------");
    }

//----------------------------------------------------------------------------------------------------------------------

    public static Zaposlenik checkUserCredentials(ArrayList<Zaposlenik> zaposleni, Scanner scanner) {
        System.out.println("Unesite e-mail: ");
        String email1 = scanner.nextLine();
        System.out.println("Unesite šifru: ");
        String sifra1 = scanner.nextLine();

        for (Zaposlenik zaposlenik : zaposleni) {
            if (zaposlenik.email.equals(email1) && zaposlenik.sifra.equals(sifra1)) {
                System.out.println("");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                System.out.println(formatter.format(date));
                System.out.println("Zdravo, " + zaposlenik.ime);
                return zaposlenik;
            }
        }
        System.out.println("Email ili sifra nije tacna, ponovite unos");
        checkUserCredentials(zaposleni, scanner);
        return null;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static void pocetneOpcije() {
        System.out.println("");
        System.out.println("Dostupne opcije: ");
        System.out.println("1. Pregled ličnih podataka");
        System.out.println("2. Podaci o Vašem radnom vremenu");
        System.out.println("3. Podaci o Vašim odsustvima");
        System.out.println("");
        System.out.println("Unosom određenog broja pristupate gore navedenim funkcijama, a unosom slova Q se odjavljujete: ");
    }
//----------------------------------------------------------------------------------------------------------------------

    public static void dobrodoslica() {
        System.out.println("");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println("Hvala Vam na izdvojenom vremenu.");
        System.out.println("DOBRODOŠLI U EMS SISTEM!");
    }
//----------------------------------------------------------------------------------------------------------------------

    public static void ispisPodataka (ArrayList<Zaposlenik> zaposleni) {
        Zaposlenik novi=zaposleni.get(zaposleni.size() - 1);
        System.out.println("Prezime i ime: " + novi.prezime + " " +  novi.ime);
        System.out.println("JMBG: " + novi.JMBG);
        System.out.println("Mjesto rođenja: " + novi.mjestoRodenja);
        System.out.println("Mjesto prebivališta: " + novi.mjestoPrebivalista);
        System.out.println("Broj telefona: " + novi.brTelefona);
        System.out.println("Radna pozicija: " + novi.pozicija);
        System.out.println("Sektor: " + novi.sektor);
        System.out.println("E-mail: " + novi.email);
    }

//----------------------------------------------------------------------------------------------------------------------

    public static void opcijaOdsustva(){
        System.out.println("Odaberite željenu opciju: ");
        System.out.println("1. Prijava odsustva");
        System.out.println("2. Pregled dosadašnjih odsustava");
        System.out.println("3. Nazad na početne opcije");
    }

//----------------------------------------------------------------------------------------------------------------------

    public static void checkOdsustvo(ArrayList<Odsustvo> odsustva,int JMBG){
        for (Odsustvo odsustvo : odsustva) {
            if (odsustvo.JMBG==JMBG) {
                System.out.println(odsustvo);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    public static void checkUserWorkTime(ArrayList<VrijemeRada> vrijeme, int JMBG){
        for (VrijemeRada vrijemeRada : vrijeme) {
            if (vrijemeRada.JMBG==JMBG) {
            System.out.println(vrijemeRada);
             }
        }
    }
}