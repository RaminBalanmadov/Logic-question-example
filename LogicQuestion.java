
public class LogicQuestion {

    /*
    Birinci gul 7 gunde bir cicek acir
    Ikinci gul 12 gunde bir cicek acir
    Ucuncu gul ise 21 gunde bir cicek acir
    bu uc gul nece gunden sonra eyni gude cicek acar?
    
     */
    //kod dinamik olaraq calisir istenilen reqem verile biler!
    public static void main(String[] args) {
        int firstRose = 7;
        int secondRose = 105;
        int thirdRose = 18;
        long day = 0;
        int index = thirdRose;
        for (int i = 1; i < index; i++) {
            index++;
            if (i % firstRose == 0 && i % secondRose == 0 && i % thirdRose == 0) {

                day = i;
                break;
               
            }
        }
        System.out.println(day+" - gun sonra her uc gul eyni gunde cicek acacaq !");
    }

}
