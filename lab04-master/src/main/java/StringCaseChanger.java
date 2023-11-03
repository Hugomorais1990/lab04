public class StringCaseChanger implements StringTransformer {

    private String Text;

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder result = new StringBuilder("");

        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        drink.setText(result.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText();
        StringBuilder result = new StringBuilder("");


    }
}
