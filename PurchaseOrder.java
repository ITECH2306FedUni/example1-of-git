
// A class to represent a purchasing order - that is, a request to purchase some items
public class PurchaseOrder
{
	private String whoFor;		// Who is placing this order request
	private String deliverTo;	// The address to deliver to
	private String itemsOrdered;	// Description of items being ordered

	public PurchaseOrder(String buyer, String addressDeliverTo)
	{
		this.whoFor = buyer;
		this.deliverTo = addressDeliverTo;
		itemsOrdered = "";
	}

	public void setItemsOrdered(String itemsToOrder)
	{
		this.itemsOrdered = itemsToOrder;
	}
}
