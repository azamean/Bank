package marcusobyrne.bankingapp;



public class Personal {

    private int _id;
    private String _name;
    private double _currentbalance;

    public Personal(String _name) {
        this._name = _name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
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

    public double get_currentbalance() {
        return _currentbalance;
    }
}
