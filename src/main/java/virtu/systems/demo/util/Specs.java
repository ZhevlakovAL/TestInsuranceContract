package virtu.systems.demo.util;

import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;
import java.util.function.Function;


@UtilityClass
public class Specs {

    public static <T> Specification<T> equal(final String fieldName,
                                             final Object param) {
        return (obj, cq, cb) -> {
            cq.distinct(true);
            return cb.equal(obj.get(fieldName), param);
        };
    }

    public static <T> Specification<T> like(final String fieldName,
                                            final String param) {
        return (obj, cq, cb) -> {
            cq.distinct(true);
            return cb.like(
                    cb.lower(obj.get(fieldName)),
                    "%" + param.toLowerCase() + "%"
            );
        };
    }

    public static <T, S> Function<Specification<T>, Specification<T>> andSpec(
            final Function<S, Specification<T>> additionalSpec,
            final Optional<S> optionalValue) {

        return spec -> optionalValue.isPresent()
                ? spec.and(additionalSpec.apply(optionalValue.get()))
                : spec;
    }

}
