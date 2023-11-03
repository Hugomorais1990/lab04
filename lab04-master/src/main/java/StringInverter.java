public class StringInverter implements StringTransformer {

    private String Text;

    public void execute(StringDrink drink){
        StringBuilder str = new StringBuilder(drink.getText());
        str = str.reverse();
        drink.setText(str.toString());
    }

    public void undo(StringDrink drink){
        StringBuilder str = new StringBuilder(drink.getText());
        str = str.reverse();
        drink.setText(str.toString());
    }
}
