package de.mide.patterns.state;

/**
 * State for document that is under review.
 */
public class DocumentStateReview implements IDocumentState {

	public String getStatus() { return "Review"; }
}
