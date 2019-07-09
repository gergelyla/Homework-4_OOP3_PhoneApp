package PhoneApp.PhoneInventory;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;
import PhoneApp.PhoneActions.Sms;

import java.util.ArrayList;

public class SamsungS8 extends Samsung{
    private static int batteryLifeHours=36;
    private String imeiNr;

////////////////////////////////////////////////////////////////////

    public SamsungS8(String color, String material,String imeiNr){
        super(color,material);
        this.imeiNr=imeiNr;
    }

////////////////////////////////////////////////////////////////////

    public static ArrayList<Contact> s8ContactList=new ArrayList <>();
    public static ArrayList<Call> s8CallList=new  ArrayList <>();
    public static ArrayList<Sms> s8MessageList=new  ArrayList <>();

    @Override
    public String toString() {
        return "SamsungS8 |" + " material: "+super.getMaterial()+" | color: "+super.getColor()+ " | battery life (hours): " + batteryLifeHours +
                " | imeiNr=" + imeiNr;
    }

    public static int getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public void setBatteryLifeHours(int batteryLifeHours) {
        this.batteryLifeHours = batteryLifeHours;
    }

    public String getImeiNr() {
        return imeiNr;
    }

    public void setImeiNr(String imeiNr) {
        this.imeiNr = imeiNr;
    }
}
