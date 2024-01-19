import transformations.CensorTransformation;
import java.util.HashMap;

public class CensorTransformationFactory {
    HashMap<String, CensorTransformation> cache = new HashMap<String, CensorTransformation>();

    public CensorTransformation get(String word) {
        if(word.length() > 4)
            return new CensorTransformation(word);

        if(!cache.containsKey(word))
            cache.put(word, new CensorTransformation(word));

        return cache.get(word);
    }

}
