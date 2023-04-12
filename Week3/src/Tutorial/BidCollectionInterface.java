/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutorial;

/**
 *
 * @author VJT
 */
public interface BidCollectionInterface {

    /**
     * Adds a bid to this collection.
     *
     * @param bid The bid to be added.
     * @throws IllegalArgumentException If the bid is null.
     */
    void addBid(BidInterface bid);

    /**
     * Returns the bid in this collection with the best yearly cost.
     *
     * @return The bid with the best yearly cost, or null if the collection is
     * empty.
     */
    BidInterface getBestYearlyCostBid();

    /**
     * Returns the bid in this collection with the best initial cost. The
     * initial cost will be defined as the unit cost plus the installation cost.
     *
     * @return The bid with the best initial cost, or null if the collection is
     * empty.
     */
    BidInterface getBestInitialCostBid();

    /**
     * Clears all of the bids from this collection.
     */
    void clearBids();

    /**
     * Gets the number of bids in this collection.
     *
     * @return The number of bids in this collection.
     */
    int getNumberOfBids();

    /**
     * Determines whether this collection is empty.
     *
     * @return True if this collection is empty, or false otherwise.
     */
    boolean isEmpty();

    /**
     * Searches for bids with the given maximum price and returns them as an
     * array.
     * @param maxPrice The maximum price to search for.
     * @return An array of bids with a cost less than or equal to the maximum
     * price, or an empty array if no bids are found.
     * @throws IllegalArgumentException If the maximum price is negative.
     */
    BidInterface[] searchBidsByPrice(double maxPrice);

    /**
     * Searches for bids with the given minimum performance and returns them as
     * an array.
     *
     * @param minPerformance The minimum performance to search for.
     * @return An array of bids with a seasonal efficiency greater than or equal
     * to the minimum performance, or an empty array if no bids are found.
     * @throws IllegalArgumentException If the minimum performance is negative.
     */
    BidInterface[] searchBidsByPerformance(double minPerformance);
}

