package PhoneApp;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;
import PhoneApp.PhoneActions.Sms;
import PhoneApp.PhoneInventory.*;

import java.util.ArrayList;
import java.util.Scanner;

import static PhoneApp.PhoneInventory.SamsungNote.*;
import static PhoneApp.PhoneInventory.SamsungS8.*;
import static PhoneApp.PhoneInventory.iPhone3.*;
import static PhoneApp.PhoneInventory.iPhone9.*;

public class Main {
    public static void main(String[] args){
        String phoneModel;
        Phone samsungS8_1=new SamsungS8("gold", "plastic-metal", "97543731wfe235");
        Phone samsungNote1=new SamsungNote("grey", "metal", "98547632wre215");
        Phone iPhone3_1=new iPhone3("white", "metal", "938656rff215");
        Phone iPhone9_1=new iPhone9("metallic grey", "metal", "98369632wy85re215");
        int menuCounter=0;
        while (menuCounter!=5){
            menu(samsungS8_1,samsungNote1,iPhone3_1,iPhone9_1);
            switch (UserInputNr()){
                case 1:
                    System.out.println("SamsungS8 actions:");
                    int phoneMenuCounter=0;
                    while (phoneMenuCounter!=7) {
                        phoneMenu();
                        phoneMenuCounter = phoneActions(iPhone9_1, phoneMenuCounter,s8ContactList,s8CallList,s8MessageList);
                    }
                    break;
                case 2:
                    System.out.println("SamsungNote actions:");
                    phoneMenuCounter=0;
                    while (phoneMenuCounter!=7) {
                        phoneMenu();
                        phoneMenuCounter = phoneActions(iPhone9_1, phoneMenuCounter,sNoteContactList,sNoteCallList,sNoteMessageList);
                    }
                    break;
                case 3:
                    System.out.println("iPhone3 actions:");
                    phoneMenuCounter=0;
                    while (phoneMenuCounter!=7) {
                        phoneMenu();
                        phoneMenuCounter = phoneActions(iPhone9_1, phoneMenuCounter,iPhone3ContactList,iPhone3CallList,iPhone3MessageList);
                    }
                    break;
                case 4:
                    System.out.println("iPhone9 actions:");
                    phoneMenuCounter=0;
                    while (phoneMenuCounter!=7) {
                        phoneMenu();
                        phoneMenuCounter = phoneActions(iPhone9_1, phoneMenuCounter,iPhone9ContactList,iPhone9CallList,iPhone9MessageList);
                    }
                    break;
                case 5:
                    menuCounter=5;
                    break;
                default:
                    System.out.println("------------------------------------------------------");
                    System.out.println("Incorrect menu option! Choose from the defined options! ");
                    System.out.println("------------------------------------------------------");
                    break;
            }
        }
    }

    public static int phoneActions(Phone phone, int phoneMenuCounter, ArrayList<Contact> contactList, ArrayList<Call> callList,ArrayList<Sms> smsList) {
        switch (UserInputNr()) {
            case 1:
                addContact(contactList,phone);
                revenireMeniu();
                break;
            case 2:
                contactList(contactList);
                revenireMeniu();
                break;
            case 3:
                callNumber(contactList,callList);
                revenireMeniu();
                break;
            case 4:
                listCall(callList);
                revenireMeniu();
                break;
            case 5:
                sendSms(contactList,smsList);
                revenireMeniu();
                break;
            case 6:
                listSms(smsList);
                revenireMeniu();
                break;
            case 7:
                phoneMenuCounter = 7;
                break;
            default:
                System.out.println("------------------------------------------------------");
                System.out.println("Incorrect action! Choose from the defined options! ");
                System.out.println("------------------------------------------------------");
                break;
        }
        return phoneMenuCounter;
    }

    public static void contactList(ArrayList<Contact> contactList) {
        System.out.println("Contact list:");
        System.out.println("---------------------------------------------------------------");
        for (int i=0; i<contactList.size();i++){
            System.out.println(contactList.get(i));
        }
    }

    public static void addContact(ArrayList<Contact> contactList,Phone phone) {
        int id;
        id = getIntId();
        String firstName = getStringFirstName();
        String lastName = getStringLastName();
        long phoneNumber = getLongPhoneNumber();
        contactList.add(phone.newContact(id,firstName,lastName,phoneNumber));
        System.out.println("");
        System.out.println("Contact saved");
        System.out.println("");
    }

    public static void listSms(ArrayList<Sms> smsList){
        System.out.println("CallList: ");
        for (int i=0; i<smsList.size();i++){
            System.out.println(smsList.get(i));
        }
    }

    public static void listCall(ArrayList<Call> callList){
        System.out.println("CallList: ");
        for (int i=0; i<callList.size();i++){
            System.out.println(callList.get(i));
        }
    }

    public static void sendSms(ArrayList<Contact> contactList,ArrayList<Sms> messageList){
        long smsNumber;
        boolean existingNumber=false;
        String messageBody;
        System.out.println("Enter number to send message:");
        smsNumber=UserInputLong();
        for (int i=0; i<contactList.size();i++) {
            if (smsNumber == (contactList.get(i).getPhoneNr())) {
                System.out.println("Enter message: ");
                messageBody=UserInputString();
                System.out.println("Sending SMS to number " + smsNumber);
                Sms sms = new Sms(smsNumber, messageBody);
                messageList.add(sms);
                existingNumber=true;
                //iPone9_1.batteryLifeHours()=iPone9_1.batterylifeHours-2;
                break;
            }
        }
        if (existingNumber!=true){System.out.println("No such number in the contact list!");}
    }

    public static void callNumber(ArrayList<Contact> contactList,ArrayList<Call> callList){
        long calledNumber;
        String callLength;
        boolean existingNumber=false;
        System.out.println("Enter number to call:");
        calledNumber=UserInputLong();
        for (int i=0; i<contactList.size();i++) {
            if (calledNumber == (contactList.get(i).getPhoneNr())) {
                System.out.println("You are calling the number " + calledNumber);
                System.out.println("Length of call: ");
                callLength=UserInputString();
                Call call = new Call(calledNumber, callLength);
                callList.add(call);
                existingNumber=true;
                //iPhone3_1.batteryLifeHours()=iPhone3_1.batterylifeHours-1;
                break;
            }
        }
        if (existingNumber!=true){System.out.println("No such number in the contact list!");}
    }

    public static long getLongPhoneNumber() {
        long phoneNumber;
        System.out.println("Contact phone number: ");
        phoneNumber=UserInputLong();
        return phoneNumber;
    }

    public static String getStringLastName() {
        String lastName;
        System.out.println("Contact last name: ");
        lastName=UserInputString();
        return lastName;
    }

    public static String getStringFirstName() {
        String firstName;
        System.out.println("Contact first name: ");
        firstName=UserInputString();
        return firstName;
    }

    public static int getIntId() {
        int id;
        System.out.println("Contact id: ");
        id=UserInputNr();
        return id;
    }

    public static void revenireMeniu(){
        System.out.println(" ");
        System.out.println("Press key to return to main menu!");
        UserInputString();
    }

    public static void phoneMenu(){
        System.out.println("1) Add contact");
        System.out.println("2) List contacts");
        System.out.println("3) Call a number from the contact list");
        System.out.println("4) List all calls");
        System.out.println("5) Send SMS to number from contact list");
        System.out.println("6) List all messages");
        System.out.println("7) Back to phone selection!");
        System.out.println("");
        System.out.print("Choose an action:  ");
    }


    public static void menu(Phone samsungS8_1, Phone samsungNote1, Phone iPhone3_1, Phone iPhone9_1){
        System.out.println("Available phones:");
        System.out.println("1) "+samsungS8_1);
        System.out.println("2) "+samsungNote1);
        System.out.println("3) "+iPhone3_1);
        System.out.println("4) "+iPhone9_1);
        System.out.println("5) Exit app!");
        System.out.println("");
        System.out.print("Choose a phone:  ");
    }

    public static String UserInputString() {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        return value;
    }

    public static long UserInputLong() {
        Scanner input = new Scanner(System.in);
        //if (input.nextInt()!=Integer;
        long value = input.nextLong();
        return value;
    }


    public static int UserInputNr() {
        Scanner input = new Scanner(System.in);
        //if (input.nextInt()!=Integer;
        int value = input.nextInt();
        return value;
    }
}
