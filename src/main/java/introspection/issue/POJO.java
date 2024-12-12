package introspection.issue;

import io.micronaut.core.annotation.Introspected;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

// using Builder annotation from Lombok breaks the introspection
@Builder

@AllArgsConstructor
@NoArgsConstructor

@Introspected
public class POJO {

    private String foo;

}
