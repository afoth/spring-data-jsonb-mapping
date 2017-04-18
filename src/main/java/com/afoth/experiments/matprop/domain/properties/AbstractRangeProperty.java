package com.afoth.experiments.matprop.domain.properties;

import lombok.Data;

/**
 * Created by des on 19.04.17.
 */
@Data
public abstract class AbstractRangeProperty implements Property {
    ValueRange range;
}
