package pl.sda.intermediate16.colectionscomparator;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class CollectionComparisonUtil {


    public static <A, B> CollectionComparisonResult<A, B> compareCollections(Collection<A> collectionA, Collection<B> collectionB, CollectionComparisonComparator<A, B> comparator) {
        CollectionComparisonResult c = new CollectionComparisonResult();

        for (A a : collectionA) {
            for (B b : collectionB) {
                if (comparator.isEqual(a, b)) {
                    c.getCommon().put(a, b);
                }
            }
        }
        return c;
    }


    public static <ELEMENT, KEY> CollectionComparisonResult<ELEMENT, ELEMENT> compareCollections(Collection<ELEMENT> collectionA, Collection<ELEMENT> collectionB, Function<ELEMENT, KEY> keyProvider) {
        throw new NotImplementedException("Do dzieła!"); //todo
    }
}
