/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.exceptions;

/**
 * Thrown when problems by modification application appear.
 * 
 * @author Juraj Somorovsky <juraj.somorovsky@rub.de>
 */
public class ModificationException extends RuntimeException {

    public ModificationException() {
	super();
    }

    public ModificationException(String message) {
	super(message);
    }

    public ModificationException(String message, Throwable cause) {
	super(message, cause);
    }
}
