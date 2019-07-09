package PhoneApp.PhoneInventory;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;
import PhoneApp.PhoneActions.Sms;

import java.util.ArrayList;

import static PhoneApp.PhoneInventory.SamsungS8.s8ContactList;

public class iPhone3 extends iPhone {
    private static int batteryLifeHours=25;
    private String imeiNr;

/////////////////////////////////////////////////////////////////////////

    public iPhone3(String color, String material,String imeiNr){
        super(color,material);
        this.imeiNr=imeiNr;
    }

/////////////////////////////////////////////////////////////////////////

    public static ArrayList<Contact> iPhone3ContactList=new ArrayList <>();
    public static ArrayList<Call> iPhone3CallList=new  ArrayList <>();
    public static ArrayList<Sms> iPhone3MessageList=new  ArrayList <>();

    @Override
    public String toString() {
        return "iPhone3 |" + " material: "+super.getMaterial()+" | color: "+super.getColor()+ " | battery life (hours): " + batteryLifeHours +
                " | imeiNr=" + imeiNr;
    }

    public static int getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public static void setBatteryLifeHours(int batteryLifeHours) {
        iPhone3.batteryLifeHours = batteryLifeHours;
    }

    public String getImeiNr() {
        return imeiNr;
    }

    public void setImeiNr(String imeiNr) {
        this.imeiNr = imeiNr;
    }
}
