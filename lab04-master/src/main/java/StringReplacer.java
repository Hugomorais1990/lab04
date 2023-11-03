public class StringReplacer implements StringTransformer{

    private char oldcharacter;
    private char newcharacter;

    public StringReplacer(char oldc, char newc){
        this.oldcharacter = oldc;
        this.newcharacter = newc;
    }

    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(this.oldcharacter, this.newcharacter));
    }
    @Override
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(this.newcharacter, this.oldcharacter));
    }
}
