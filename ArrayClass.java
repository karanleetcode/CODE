
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Acer on 4/27/2018.
 */

public class ArrayClass {
    ArrayList<Contacts> arrayList;
    ArrayClass(){
        arrayList =  new ArrayList<>();
    }
    public ArrayList<Contacts> returnArraylist(){

        arrayList.add(new Contacts(1,"Abate","to lessen.","Rather than leavinf immediately, they waited for the storm to abate","0","0"));
        arrayList.add(new Contacts(2,"Abhor","to hate.","FFWEFWEFWFESFSEFSFFSWFS","0","0"));
        arrayList.add(new Contacts(3,"Abjure","to lessen.","He abjured his alligiance to the king.","0","0"));
        arrayList.add(new Contacts(4,"Abortive","to leave.","We have to abandon out abortive attempts.","0","0"));
        arrayList.add(new Contacts(5,"Abound","to deny to do.","I am abound to reciprocate to the services","0","0"));
        arrayList.add(new Contacts(6,"Abrogate","to abolish.","He intended to abrogate the decree issued by his predecessor.","0","0"));
        arrayList.add(new Contacts(7,"Abstemious","refrain from eating food.","He is abstemious about food as he is on dieting.","0","0"));
        arrayList.add(new Contacts(8,"Absurd","happening in an irrelevant way.","0","0","0"));

/*
        arrayList.add(new Contacts(9,"Access","to lessen.","To access the system the parameters have to crossed"));
        arrayList.add(new Contacts(10,"Accomodate","to fdfad.","0"));
        arrayList.add(new Contacts(11,"Accomplice","to lessen.","0"));
        arrayList.add(new Contacts(12,"Accost","to fdfad.","0"));
        arrayList.add(new Contacts(13,"Acknowledge","to accept.","He acknowledge the fact that he was not u enough to enter the college."));
        arrayList.add(new Contacts(14,"Acme","to fdfad.","0"));
        arrayList.add(new Contacts(15,"Acquiesce","to lessen.","0"));
        arrayList.add(new Contacts(16,"Acrimonious","to fdfad.","0"));
        arrayList.add(new Contacts(17,"Acute","to lessen.","0"));
        arrayList.add(new Contacts(18,"Adamant","to fdfad.","0"));
        arrayList.add(new Contacts(19,"Admonish","to lessen.","0"));
        arrayList.add(new Contacts(20,"Adroit","to be skillful","0"));

*/
        return arrayList;
    }
}
