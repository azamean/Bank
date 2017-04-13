package marcusobyrne.bankingapp;



public class User {

    private int _id;
    private String _name;
    private int _PIN;
    private double _currentbalance;


    public User(String _name) {
        this._name = _name;
    }

    public User(int _PIN) {
        this._PIN = _PIN;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_PIN(int _PIN) {
        this._PIN = _PIN;
    }

    public void set_currentbalance(double _currentbalance) {
        this._currentbalance = _currentbalance;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public int get_PIN() {
        return _PIN;
    }

    public double get_currentbalance() {
        return _currentbalance;
    }
}
