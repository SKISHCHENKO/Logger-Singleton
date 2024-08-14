import java.util.ArrayList;
import java.util.List;


public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (Integer n : source) {
            if (n >= treshold) {
                logger.log("Элемент " + n + " проходит");
                count++;
                result.add(n);
            } else {
                logger.log("Элемент " + n + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        return result;
    }
}