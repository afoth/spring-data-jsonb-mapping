package com.afoth.experiments.matprop.domain;

import com.afoth.experiments.matprop.domain.properties.Density;
import com.afoth.experiments.matprop.domain.properties.MeltingPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by des on 19.04.17.
 */
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Properties implements Serializable {

    Density density;

    MeltingPoint meltingPoint;

}
