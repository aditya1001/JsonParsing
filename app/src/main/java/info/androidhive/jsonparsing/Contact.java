package info.androidhive.jsonparsing;

/**
 * Created by Aditya on 12/03/2018.
 */

public class Contact {

    //private variables
    private String _id;

    private String _name;
    private String _email;
    private String _mobile;
    private String _address;
    private String _gender;
    private String _home;
    private String _office;

    // Empty constructor
    public Contact(){

    }


    public Contact(String _id, String _name, String _email, String _mobile, String _address, String _gender, String _home, String _office) {
        this._id = _id;
        this._name = _name;
        this._email = _email;
        this._mobile = _mobile;
        this._address = _address;
        this._gender = _gender;
        this._home = _home;
        this._office = _office;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_mobile() {
        return _mobile;
    }

    public void set_mobile(String _mobile) {
        this._mobile = _mobile;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_gender() {
        return _gender;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }

    public String get_home() {
        return _home;
    }

    public void set_home(String _home) {
        this._home = _home;
    }

    public String get_office() {
        return _office;
    }

    public void set_office(String _office) {
        this._office = _office;
    }

//    // constructor
//    public Contact(int id, String name, String _phone_number){
//        this._id = id;
//        this._name = name;
//        this._phone_number = _phone_number;
//    }
//
//    // constructor
//    public Contact(String name, String _phone_number){
//        this._name = name;
//        this._phone_number = _phone_number;
//    }
//    // getting ID
//    public int getID(){
//        return this._id;
//    }
//
//    // setting id
//    public void setID(int id){
//        this._id = id;
//    }
//
//    // getting name
//    public String getName(){
//        return this._name;
//    }
//
//    // setting name
//    public void setName(String name){
//        this._name = name;
//    }
//
//    // getting phone number
//    public String getPhoneNumber(){
//        return this._phone_number;
//    }
//
//    // setting phone number
//    public void setPhoneNumber(String phone_number){
//        this._phone_number = phone_number;
//    }
}
