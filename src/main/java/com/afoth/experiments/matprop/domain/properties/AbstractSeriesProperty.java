package com.afoth.experiments.matprop.domain.properties;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by des on 18.04.17.
 */
@Data
public abstract class AbstractSeriesProperty implements Property {

    List<SeriesValue> values = new ArrayList<>();
}
