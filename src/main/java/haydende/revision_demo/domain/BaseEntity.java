package haydende.revision_demo.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@RequiredArgsConstructor
public class BaseEntity {

    private final Long id;
}
