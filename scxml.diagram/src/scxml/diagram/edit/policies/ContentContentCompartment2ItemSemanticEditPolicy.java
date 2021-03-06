package scxml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import scxml.diagram.edit.commands.Content2CreateCommand;
import scxml.diagram.providers.ScxmlElementTypes;

/**
 * @generated
 */
public class ContentContentCompartment2ItemSemanticEditPolicy extends ScxmlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContentContentCompartment2ItemSemanticEditPolicy() {
		super(ScxmlElementTypes.Content_3035);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScxmlElementTypes.Content_3035 == req.getElementType()) {
			return getGEFWrapper(new Content2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
