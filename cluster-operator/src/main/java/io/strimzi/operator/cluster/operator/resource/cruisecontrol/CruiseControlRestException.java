/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.operator.cluster.operator.resource.cruisecontrol;

/**
 * Represents an exception related to Cruise Control REST API interaction
 */
class CruiseControlRestException extends RuntimeException {

    public CruiseControlRestException(String message) {
        super(message);
    }
}
