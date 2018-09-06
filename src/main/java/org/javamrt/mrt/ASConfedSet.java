// This file is part of java-mrt
// A library to parse MRT files

// This file is released under LGPL 3.0
// http://www.gnu.org/licenses/lgpl-3.0-standalone.html

package org.javamrt.mrt;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ASConfedSet extends AS {

    private LinkedList<AS> asList;

    public ASConfedSet(final List<AS> asList) {
        this.asList = new LinkedList<>();
        this.asList.addAll(asList);
    }

    public String toString() {
        return asList.stream().map(AS::toString).collect(Collectors.joining(" ", "{", "}"));
    }
}

