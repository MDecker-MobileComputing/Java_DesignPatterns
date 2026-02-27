package de.mide.patterns.state;

/**
 * Initial state for the document workflow. A reviewer can
 * request changes, which reverts the document into this
 * state.
 */
public class DocumentStateDraft implements IDocumentState {

	public String getStatus() { return "Draft"; }
}
