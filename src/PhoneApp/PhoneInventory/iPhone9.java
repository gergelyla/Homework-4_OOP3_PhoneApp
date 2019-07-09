package PhoneApp.PhoneInventory;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;
import PhoneApp.PhoneActions.Sms;

import java.util.ArrayList;

public class iPhone9 extends iPhone {
    private static int batteryLifeHours=30;
    private String imeiNr;

/////////////////////////////////////////////////////////////

    public iPhone9(String color, String material,String imeiNr){
        super(color,material);
        this.imeiNr=imeiNr;
    }

/////////////////////////////////////////////////////////////

    public static ArrayList<Contact> iPhone9ContactList=new ArrayList <>();
    public static ArrayList<Call> iPhone9CallList=new  ArrayList <>();
    public static ArrayList<Sms> iPhone9MessageList=new  ArrayList <>();

    @Override
    public String toString() {
        return "iPhone9 |" + " material: "+super.getMaterial()+" | color: "+super.getColor()+ " | battery life (hours): " + batteryLifeHours +
                " | imeiNr=" + imeiNr;
    }

    public static int getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public static void setBatteryLifeHours(int batteryLifeHours) {
        iPhone9.batteryLifeHours = batteryLifeHours;
    }

    public String getImeiNr() {
        return imeiNr;
    }

    public void setImeiNr(String imeiNr) {
        this.imeiNr = imeiNr;
    }
}
