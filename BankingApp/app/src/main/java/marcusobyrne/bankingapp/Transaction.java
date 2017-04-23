package marcusobyrne.bankingapp;

/**
 * Created by Funk on 23/04/2017.
 */

public class Transaction {

    private int _id;
    private String _description;
    private double _balance;

    public Transaction(String _description, double _balance) {
        this._description = _description;
        this._balance = _balance;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_balance() {
        return _balance;
    }

    public void set_balance(double _balance) {
        this._balance = _balance;
    }
}
