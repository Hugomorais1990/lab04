import java.util.List;

public class StringRecipe {

        List<StringTransformer> transformers;

        public StringRecipe(List<StringTransformer> transformers2){
                this.transformers = transformers2;
        }

        public void mix(StringDrink drink2){
                for (int i = 0; i < transformers.size(); i++){
                        transformers.get(i).execute(drink2);
                }
        }

}
